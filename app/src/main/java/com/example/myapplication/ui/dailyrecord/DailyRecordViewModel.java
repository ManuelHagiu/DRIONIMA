package com.example.myapplication.ui.dailyrecord;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class DailyRecordViewModel extends ViewModel {

    private final MutableLiveData<String> waterText,litresText,workoutText,workoutRate,caloriesText, caloriesCountText,sleepText,sleepHoursText;

    public DailyRecordViewModel() {
        waterText=new MutableLiveData<>();
        litresText=new MutableLiveData<>();
        workoutText=new MutableLiveData<>();
        workoutRate=new MutableLiveData<>();
        caloriesText=new MutableLiveData<>();
        caloriesCountText=new MutableLiveData<>();
        sleepText=new MutableLiveData<>();
        sleepHoursText=new MutableLiveData<>();
        waterText.setValue("LITRES OF WATER DRANK:");
        litresText.setValue("1                2                3");
        workoutText.setValue("RATE YOUR WORKOUT:");
        workoutRate.setValue("");
        caloriesText.setValue("CALORIES CONSUMED:");
        caloriesCountText.setValue("");
        sleepText.setValue("HOURS OF SLEEP:");
        sleepHoursText.setValue("");
    }

    public LiveData<String> getWaterText() {
        return waterText;
    }

    public LiveData<String> getLitresText() {
        return litresText;
    }

    public LiveData<String> getWorkoutText() {
        return workoutText;
    }

    public LiveData<String> getWorkoutRate() {
        return workoutRate;
    }

    public LiveData<String> getCaloriesText() {
        return caloriesText;
    }

    public LiveData<String> getCaloriesCountText() {
        return caloriesCountText;
    }

    public LiveData<String> getSleepText() {
        return sleepText;
    }

    public LiveData<String> getSleepHoursText() {
        return sleepHoursText;
    }
}
