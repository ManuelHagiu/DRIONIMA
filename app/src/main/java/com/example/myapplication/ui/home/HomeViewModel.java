package com.example.myapplication.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {

    private final MutableLiveData<String> welcomeMessage,setGoalMessage,nameText,descriptionText,frequencyText,repetitionText;

    public HomeViewModel() {
        welcomeMessage = new MutableLiveData<>();
        setGoalMessage=new MutableLiveData<>();
        nameText=new MutableLiveData<>();
        descriptionText=new MutableLiveData<>();
        frequencyText=new MutableLiveData<>();
        repetitionText=new MutableLiveData<>();
        welcomeMessage.setValue("Welcome back "+"!");
        setGoalMessage.setValue("Why not setting a new goal for today?");
    }

    public LiveData<String> getWelcomeMessage() {
        return welcomeMessage;
    }

    public LiveData<String> getSetGoalMessage() {
        return setGoalMessage;
    }

    public LiveData<String> getNameText() {
        return nameText;
    }

    public LiveData<String> getDescriptionText() {
        return descriptionText;
    }

    public LiveData<String> getFrequencyText() {
        return frequencyText;
    }

    public LiveData<String> getRepetitionText() {
        return repetitionText;
    }
}