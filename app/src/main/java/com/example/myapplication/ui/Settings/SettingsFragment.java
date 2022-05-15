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
    @NonNull
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState){
        preferences= getActivity().getSharedPreferences("MyPrefs", Context.MODE_PRIVATE);

        mListPreference = (ListPreference)  getPreferenceManager().findPreference("preference_key");
        mListPreference.setOnPreferenceChangeListener(new Preference.OnPreferenceChangeListener() {
            @Override
            public boolean onPreferenceChange(Preference preference, Object newValue) {
                return preferences.edit().putString(preference.getKey(), (String) newValue).commit();
            }
        });

        return inflater.inflate(R.layout.fragment_home, container, false);
    }


    @Override
    public void onAttach(Activity activity){
        super.onAttach(activity);
        openFragmentListener = (OpenFragmentListener)activity;
    }

    @Override
    public void onCreatePreferences(Bundle bundle, String s) {
        addPreferencesFromResource(R.xml.root_preferences);
        setPreferencesFromResource(R.xml.root_preferences,s);
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