package com.example.myapplication.ui.setNewGoals;

import android.app.Application;
import androidx.lifecycle.LiveData;

import java.util.List;

public class GoalRepository {

    private GoalDao mGoalDao;
    private LiveData<List<Goal>> mAllGoals;


    GoalRepository(Application application) {
        GoalDatabase db = GoalDatabase.getDatabase(application);
        mGoalDao = db.goalDao();
        mAllGoals = mGoalDao.getAlphabetizedGoals();
    }

    // Room executes all queries on a separate thread.
    // Observed LiveData will notify the observer when the data has changed.
    LiveData<List<Goal>> getAllGoals() {
        return mAllGoals;
    }

    // You must call this on a non-UI thread or your app will throw an exception. Room ensures
    // that you're not doing any long running operations on the main thread, blocking the UI.
    void insert(Goal goal) {
        GoalDatabase.databaseWriteExecutor.execute(() -> {
            mGoalDao.insert(goal);
        });
    }
}
