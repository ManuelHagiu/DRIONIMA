package com.example.myapplication.ui.setNewGoals;


import android.app.Application;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

public class GoalViewModel extends AndroidViewModel{

    private GoalRepository mRepository;
    private final LiveData<List<Goal>> mAllGoals;

    public GoalViewModel(Application application) {
        super(application);
        mRepository = new GoalRepository(application);
        mAllGoals = mRepository.getAllGoals();
    }

    public LiveData<List<Goal>> getAllGoals() {
        return mAllGoals;
    }

    public void insert(Goal goal) {
        mRepository.insert(goal);
    }
}

