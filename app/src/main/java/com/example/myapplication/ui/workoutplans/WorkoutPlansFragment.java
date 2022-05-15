package com.example.myapplication.ui.workoutplans;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.myapplication.databinding.FragmentWorkoutplansBinding;


public class WorkoutPlansFragment extends Fragment {
    private FragmentWorkoutplansBinding binding;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState){
        WorkoutPlansViewModel workoutPlansViewModel = new ViewModelProvider(this).get(WorkoutPlansViewModel.class);

        binding = FragmentWorkoutplansBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView personText = binding.personText;
        workoutPlansViewModel.getPersonText().observe(getViewLifecycleOwner(), personText::setText);

       final TextView chooseGoal = binding.chooseGoal;
        workoutPlansViewModel.getChosenGoal().observe(getViewLifecycleOwner(), chooseGoal::setText);

        final TextView loseWeight = binding.loseWeight;
        workoutPlansViewModel.getLostWeight().observe(getViewLifecycleOwner(), loseWeight::setText);

        final TextView gainMuscleMass = binding.gainMuscleMass;
        workoutPlansViewModel.getGainMuscleMass().observe(getViewLifecycleOwner(), gainMuscleMass::setText);

        final TextView getShredded = binding.getShredded;
        workoutPlansViewModel.getShredded().observe(getViewLifecycleOwner(), getShredded::setText);

        final Button button1 = binding.button1;
        button1.setOnClickListener(v -> {
            Intent intent = new Intent(getContext(), loseWeight.class);
            startActivity(intent);
        } );

        final Button button2 = binding.button2;
        button2.setOnClickListener(v -> {
            Intent intent = new Intent(getContext(), gainMuscleMass.class);
            startActivity(intent);
        });

        final Button button3 = binding.button3;
        button3.setOnClickListener(v -> {
            Intent intent = new Intent(getContext(), getShredded.class);
            startActivity(intent);
        });

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
