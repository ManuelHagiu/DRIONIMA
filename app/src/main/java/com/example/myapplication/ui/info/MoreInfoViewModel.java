package com.example.myapplication.ui.info;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.myapplication.databinding.FragmentMoreinfoBinding;

public class MoreInfoViewModel extends ViewModel {
    private final MutableLiveData<String> nicolaName, dragosName, ionutName, manuName, nicolaText,
            dragosText, ionutText, manuText;
    private final MutableLiveData<Button> nicolaButton, dragosButton, ionutButton, manuButton;



    public MutableLiveData<String> getNicolaName() {
        return nicolaName;
    }

    public MutableLiveData<String> getDragosName() {
        return dragosName;
    }

    public MutableLiveData<String> getIonutName() {
        return ionutName;
    }

    public MutableLiveData<String> getManuName() {
        return manuName;
    }

    public MutableLiveData<String> getNicolaText() {
        return nicolaText;
    }

    public MutableLiveData<String> getDragosText() {
        return dragosText;
    }

    public MutableLiveData<String> getIonutText() {
        return ionutText;
    }

    public MutableLiveData<String> getManuText() {
        return manuText;
    }

    public MoreInfoViewModel() {
        nicolaButton = new MutableLiveData<>();
        dragosButton = new MutableLiveData<>();
        ionutButton = new MutableLiveData<>();
        manuButton = new MutableLiveData<>();
        nicolaName = new MutableLiveData<>();
        dragosName = new MutableLiveData<>();
        ionutName = new MutableLiveData<>();
        manuName = new MutableLiveData<>();
        nicolaText = new MutableLiveData<>();
        dragosText = new MutableLiveData<>();
        ionutText = new MutableLiveData<>();
        manuText = new MutableLiveData<>();

    }


}
