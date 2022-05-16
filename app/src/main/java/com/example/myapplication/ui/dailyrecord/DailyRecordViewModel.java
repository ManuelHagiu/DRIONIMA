package com.example.myapplication.ui.dailyrecord;

import android.app.Application;
import android.os.Build;

import androidx.annotation.RequiresApi;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;


import java.util.ArrayList;
import java.util.List;

public class DailyRecordViewModel extends AndroidViewModel {

    private DailyRecordRepository mRepository;
    private MutableLiveData<List<DailyRecord>> mAllDailyRecords;
    private final MutableLiveData<String> waterText,litresText,workoutText,workoutRate,caloriesText, caloriesCountText,sleepText,sleepHoursText;


    @RequiresApi(api = Build.VERSION_CODES.O)
    public DailyRecordViewModel(Application application) {
        super(application);
        mRepository = new DailyRecordRepository(application);
        mAllDailyRecords = new MutableLiveData<>();;
        waterText=new MutableLiveData<>();
        litresText=new MutableLiveData<>();
        workoutText=new MutableLiveData<>();
        workoutRate=new MutableLiveData<>();
        caloriesText=new MutableLiveData<>();
        caloriesCountText=new MutableLiveData<>();
        sleepText=new MutableLiveData<>();
        sleepHoursText=new MutableLiveData<>();
        waterText.setValue("LITRES OF WATER DRANK:");
        litresText.setValue("1                       2                       3");
        workoutText.setValue("RATE YOUR WORKOUT:");
        workoutRate.setValue("1    2    3    4    5    6    7    8    9   10");
        caloriesText.setValue("CALORIES CONSUMED:");
        caloriesCountText.setValue("0   1000   1500   2000   2500+");
        sleepText.setValue("HOURS OF SLEEP:");
        sleepHoursText.setValue("1    2    3    4    5    6    7    8    9   10");
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    public LiveData<List<DailyRecord>> getAllDailyRecords() {
        return mRepository.getAllDailyRecords();
    }

    public void insert(DailyRecord dailyRecord) {
        mRepository.insert(dailyRecord);
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
