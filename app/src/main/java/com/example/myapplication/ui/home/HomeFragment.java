package com.example.myapplication.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.myapplication.databinding.FragmentHomeBinding;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        HomeViewModel homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView welcomeText = binding.welcomeText;
        homeViewModel.getWelcomeMessage().observe(getViewLifecycleOwner(), welcomeText::setText);

        final TextView setGoalMessage= binding.setGoalMessage;
        homeViewModel.getSetGoalMessage().observe(getViewLifecycleOwner(),setGoalMessage::setText);

        final TextView nameText =binding.nameText;
        homeViewModel.getNameText().observe(getViewLifecycleOwner(),nameText::setText);

        final TextView descriptionText =binding.descriptionText;
        homeViewModel.getDescriptionText().observe(getViewLifecycleOwner(),descriptionText::setText);

        final TextView frequencyText =binding.frequencyText;
        homeViewModel.getFrequencyText().observe(getViewLifecycleOwner(),frequencyText::setText);

        final TextView repetitionText =binding.repetitionText;
        homeViewModel.getRepetitionText().observe(getViewLifecycleOwner(),repetitionText::setText);


        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}