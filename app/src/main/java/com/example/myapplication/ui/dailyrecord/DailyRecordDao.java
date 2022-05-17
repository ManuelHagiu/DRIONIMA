package com.example.myapplication.ui.dailyrecord;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.List;

@Dao
public interface DailyRecordDao {
    @Query("SELECT * FROM daily_record_table ORDER BY dateTime ASC")
    LiveData<List<DailyRecord>> getOrderedDailyRecords();

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insert(DailyRecord dailyRecord);

    @Query("DELETE FROM daily_record_table")
    void deleteAll();

}
