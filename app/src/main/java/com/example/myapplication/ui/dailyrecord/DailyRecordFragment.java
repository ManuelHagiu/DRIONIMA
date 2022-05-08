package com.example.myapplication.ui.dailyrecord;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.myapplication.databinding.FragmentDailyrecordBinding;

public class DailyRecordFragment extends Fragment {
    private FragmentDailyrecordBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        DailyRecordViewModel dailyRecordViewModel =
                new ViewModelProvider(this).get(DailyRecordViewModel.class);

        binding = FragmentDailyrecordBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView waterText = binding.waterText;
        dailyRecordViewModel.getWaterText().observe(getViewLifecycleOwner(), waterText::setText);
        final TextView litresText = binding.litrersBarText;
        dailyRecordViewModel.getLitresText().observe(getViewLifecycleOwner(), litresText::setText);

        /*final TextView textView = binding.;
        dailyRecordViewModel.getWaterText().observe(getViewLifecycleOwner(), textView::setText);
        final TextView textView = binding.waterText;
        dailyRecordViewModel.getWaterText().observe(getViewLifecycleOwner(), textView::setText);

        final TextView textView = binding.waterText;
        dailyRecordViewModel.getWaterText().observe(getViewLifecycleOwner(), textView::setText);
        final TextView textView = binding.waterText;
        dailyRecordViewModel.getWaterText().observe(getViewLifecycleOwner(), textView::setText);

        final TextView textView = binding.waterText;
        dailyRecordViewModel.getWaterText().observe(getViewLifecycleOwner(), textView::setText);
        final TextView textView = binding.waterText;
        dailyRecordViewModel.getWaterText().observe(getViewLifecycleOwner(), textView::setText);

*/

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
