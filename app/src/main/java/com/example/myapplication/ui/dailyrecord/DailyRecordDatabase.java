package com.example.myapplication.ui.dailyrecord;

import android.content.Context;
import android.os.Build;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;

import com.example.myapplication.ui.setNewGoals.Goal;
import com.example.myapplication.ui.setNewGoals.GoalDao;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Database(entities = {DailyRecord.class},version = 2)
public abstract class DailyRecordDatabase extends RoomDatabase {
    abstract DailyRecordDao dailyRecordDao();

    private static volatile DailyRecordDatabase INSTANCE;
    private static final int NUMBER_OF_THREADS = 4;
    public static final ExecutorService databaseWriteExecutor =
            Executors.newFixedThreadPool(NUMBER_OF_THREADS);

    public static DailyRecordDatabase getDatabase(final Context context){
        if(INSTANCE==null){
            synchronized (DailyRecordDatabase.class){
                if(INSTANCE==null)
                    INSTANCE= Room.databaseBuilder(context.getApplicationContext(),
                            DailyRecordDatabase.class,"daily_record_database").fallbackToDestructiveMigration()
                            .addCallback(sRoomDatabaseCallback).allowMainThreadQueries()
                            .build();
            }
        }
        return INSTANCE;
    }

    /**
     * Override the onCreate method to populate the database.
     * For this sample, we clear the database every time it is created.
     */
    private static final RoomDatabase.Callback sRoomDatabaseCallback = new RoomDatabase.Callback() {
        @RequiresApi(api = Build.VERSION_CODES.O)
        @Override
        public void onCreate(@NonNull SupportSQLiteDatabase db) {
            super.onCreate(db);

            databaseWriteExecutor.execute(() -> {
                // Populate the database in the background.
                // If you want to start with more goals, just add them.
                DailyRecordDao dao = INSTANCE.dailyRecordDao();
                dao.deleteAll();

                DailyRecord dailyRecord = new DailyRecord(1, 2, 3, 4);
                dao.insert(dailyRecord);
                dailyRecord = new DailyRecord(5, 6, 7, 8);
                dao.insert(dailyRecord);

            });
        }
    };

}
