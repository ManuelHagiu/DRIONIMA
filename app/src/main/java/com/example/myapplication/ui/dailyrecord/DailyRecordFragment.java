package com.example.myapplication.ui.dailyrecord;

import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.myapplication.databinding.FragmentDailyrecordBinding;

public class DailyRecordFragment extends Fragment {
    private FragmentDailyrecordBinding binding;
    private DailyRecordViewModel dailyRecordViewModel;

    @RequiresApi(api = Build.VERSION_CODES.O)
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        dailyRecordViewModel =
                new ViewModelProvider(this).get(DailyRecordViewModel.class);

        binding = FragmentDailyrecordBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

       final TextView waterText = binding.waterText;
        dailyRecordViewModel.getWaterText().observe(getViewLifecycleOwner(), waterText::setText);
        final TextView litresText = binding.litrersBarText;
        dailyRecordViewModel.getLitresText().observe(getViewLifecycleOwner(), litresText::setText);

        final TextView workoutText = binding.workoutText;
        dailyRecordViewModel.getWorkoutText().observe(getViewLifecycleOwner(), workoutText::setText);
        final TextView workoutRate = binding.workoutGradesText;
        dailyRecordViewModel.getWorkoutRate().observe(getViewLifecycleOwner(), workoutRate::setText);

        final TextView sleepText = binding.sleepHoursText;
        dailyRecordViewModel.getSleepText().observe(getViewLifecycleOwner(), sleepText::setText);
        final TextView sleepHours = binding.sleepNumbersText;
        dailyRecordViewModel.getSleepHoursText().observe(getViewLifecycleOwner(), sleepHours::setText);

        final TextView caloriesCount = binding.caloriesCountText;
        dailyRecordViewModel.getCaloriesText().observe(getViewLifecycleOwner(), caloriesCount::setText);
        final TextView caloriesNumbers = binding.caloriesNumbersText;
        dailyRecordViewModel.getCaloriesCountText().observe(getViewLifecycleOwner(), caloriesNumbers::setText);

        final SeekBar waterBar= binding.waterBar;
        final SeekBar workoutBar= binding.workoutBar;
        final SeekBar sleepBar=binding.sleepBar;
        final SeekBar caloriesBar=binding.caloriesBar;

        final Button saveButton=binding.saveButton;
        saveButton.setOnClickListener(view -> saveDailyRecord(waterBar.getProgress(),workoutBar.getProgress(),sleepBar.getProgress(),caloriesBar.getProgress()));

        return root;
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    public void saveDailyRecord(int waterLitres, int workoutRate, int sleepHours, int calories){
        DailyRecord dailyRecord=new DailyRecord(waterLitres,workoutRate,sleepHours,calories);
        dailyRecordViewModel.insert(dailyRecord);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
