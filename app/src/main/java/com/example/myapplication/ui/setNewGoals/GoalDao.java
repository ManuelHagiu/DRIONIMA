package com.example.myapplication.ui.setNewGoals;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;



import java.util.List;

@Dao
public interface GoalDao {
    @Query("SELECT * FROM goal_table ORDER BY goal ASC")
    LiveData<List<Goal>> getAlphabetizedGoals();

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insert(Goal goal);

    @Query("DELETE FROM goal_table")
    void deleteAll();
}
