package com.example.myapplication.ui.workoutplans;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class WorkoutPlansViewModel extends ViewModel {


    MutableLiveData<String>  personText;


    public WorkoutPlansViewModel(){
        personText = new MutableLiveData<>();
        personText.setValue("The workout plan for today is ready!");
    }

    public LiveData<String> getPersonText()
    {
        return personText;
    }
}
