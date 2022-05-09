package com.example.myapplication.ui.setNewGoals;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SetNewGoalsViewModel extends ViewModel{

    private final MutableLiveData<String> mText;

    public SetNewGoalsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is set new goal fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}