package com.example.myapplication.ui.info;

import android.widget.Button;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class InfoViewModel extends ViewModel {
    private final MutableLiveData<String> textViewvar, editTextMultiLine;
    private final MutableLiveData<Button> button, button1;

    public InfoViewModel() {
        textViewvar = new MutableLiveData<>();
        editTextMultiLine = new MutableLiveData<>();
        button = new MutableLiveData<>();
        button1 = new MutableLiveData<>();
    }

    public MutableLiveData<Button> getButton() {
        return button;
    }

    public MutableLiveData<String> getEditTextMultiLine() {
        return editTextMultiLine;
    }

    public MutableLiveData<Button> getButton1() {
        return button1;
    }

    public MutableLiveData<String> getTextView() {
        return textViewvar;
    }
}
