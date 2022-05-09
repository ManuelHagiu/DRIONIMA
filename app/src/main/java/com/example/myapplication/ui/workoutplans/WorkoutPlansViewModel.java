package com.example.myapplication.ui.workoutplans;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class WorkoutPlansViewModel extends ViewModel {


    MutableLiveData<String>  personText, chooseGoal;


    public WorkoutPlansViewModel(){
        personText = new MutableLiveData<>();
        chooseGoal = new MutableLiveData<>();
        chooseGoal.setValue("Choose your goal");
        personText.setValue("BUILD YOUR PERFECT BODY!");
    }

    public LiveData<String> getPersonText()
    {
        return personText;
    }
    public LiveData<String> getChosenGoal()
    {
        return chooseGoal;
    }
}
