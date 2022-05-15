package com.example.myapplication.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.myapplication.databinding.FragmentHomeBinding;
import com.example.myapplication.ui.setNewGoals.Goal;

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
        final EditText nameInput=binding.nameLabel;

        final Button button=binding.addGoalButton;
        button.setOnClickListener(view -> {
            Goal goal=new Goal(nameInput.getText().toString());
            System.out.println(goal.getGoal());
        });

        return root;
    }



    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}