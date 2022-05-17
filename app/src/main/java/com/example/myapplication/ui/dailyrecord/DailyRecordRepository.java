package com.example.myapplication.ui.dailyrecord;

import android.app.Application;
import androidx.lifecycle.LiveData;



import java.util.List;

public class DailyRecordRepository {
    private DailyRecordDao mDailyRecordDao;
    private LiveData<List<DailyRecord>> mAllDailyRecords;



    public DailyRecordRepository(Application application) {
        DailyRecordDatabase db = DailyRecordDatabase.getDatabase(application);
        mDailyRecordDao = db.dailyRecordDao();
        mAllDailyRecords = mDailyRecordDao.getOrderedDailyRecords();
    }

    // Room executes all queries on a separate thread.
    // Observed LiveData will notify the observer when the data has changed.
    LiveData<List<DailyRecord>> getAllDailyRecords() {
        return mAllDailyRecords;
    }

    // You must call this on a non-UI thread or your app will throw an exception. Room ensures
    // that you're not doing any long running operations on the main thread, blocking the UI.
    public void insert(DailyRecord dailyRecord) {
        DailyRecordDatabase.databaseWriteExecutor.execute(() -> {
            mDailyRecordDao.insert(dailyRecord);
        });
    }
}