package com.example.myapplication.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.myapplication.ui.EmailPasswordActivity;

public class HomeViewModel extends ViewModel {

    private final MutableLiveData<String> welcomeMessage,setGoalMessage,nameText;

    public HomeViewModel() {
        welcomeMessage = new MutableLiveData<>();
        setGoalMessage=new MutableLiveData<>();
        nameText=new MutableLiveData<>();


        welcomeMessage.setValue("Welcome back, "+ EmailPasswordActivity.getCurrentUser().getEmail() +"!"); 
        setGoalMessage.setValue("Why not setting a new goal for today?");
        nameText.setValue("GOAL NAME");
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

}