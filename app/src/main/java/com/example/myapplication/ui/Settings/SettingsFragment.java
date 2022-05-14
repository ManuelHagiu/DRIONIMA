package com.example.myapplication.ui.Settings;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.provider.SyncStateContract;

import androidx.preference.Preference;
import androidx.preference.PreferenceFragmentCompat;

import com.example.myapplication.R;

public class SettingsFragment extends PreferenceFragmentCompat {

    OpenFragmentListener openFragmentListener;

    public interface OpenFragmentListener{
        void openFragment();
    }

    @Override
    public void onAttach(Activity activity){
        super.onAttach(activity);
        openFragmentListener = (OpenFragmentListener)activity;

    }

    @Override
    public void onCreatePreferences(Bundle bundle, String s) {
        addPreferencesFromResource(R.xml.root_preferences);

        SharedPreferences preferences= getActivity().getSharedPreferences("MyPrefs", Context.MODE_PRIVATE);
        Preference preference = this.findPreference("key");
        preference.setOnPreferenceClickListener(new Preference.OnPreferenceClickListener(){
            @Override
            public boolean onPreferenceClick(Preference preference){
                openFragmentListener.openFragment();
                return true;
            }
        });
    }
}