package com.example.myapplication.ui.Settings;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.provider.SyncStateContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import androidx.preference.PreferenceFragmentCompat;

import com.example.myapplication.R;

public class SettingsFragment extends PreferenceFragmentCompat {

    OpenFragmentListener openFragmentListener;
    private ListPreference mListPreference;
    SharedPreferences preferences;

    public interface OpenFragmentListener{
        void openFragment();
    }




    @Override
    public void onCreatePreferences(Bundle bundle, String s) {
        addPreferencesFromResource(R.xml.root_preferences);
        setPreferencesFromResource(R.xml.root_preferences,s);
        Preference preference = this.findPreference("key");

    }
}