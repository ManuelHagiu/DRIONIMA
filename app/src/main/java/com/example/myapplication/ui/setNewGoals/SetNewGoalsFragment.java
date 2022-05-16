package com.example.myapplication.ui.setNewGoals;

import static android.app.Activity.RESULT_OK;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;
import com.example.myapplication.databinding.GoalMainBinding;
import com.example.myapplication.ui.workoutplans.WorkoutPlansViewModel;
import com.google.android.material.floatingactionbutton.FloatingActionButton;


public class SetNewGoalsFragment extends Fragment {
    private GoalMainBinding binding;
    public static final int NEW_GOAL_ACTIVITY_REQUEST_CODE = 1;
    private GoalViewModel mGoalViewModel;
    private TextView textView;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState){
        binding = GoalMainBinding.inflate(inflater, container, false);
        View root = binding.getRoot();


        RecyclerView recyclerView = binding.recyclerView;
        final GoalListAdapter adapter = new GoalListAdapter(new GoalListAdapter.GoalDiff());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        // Get a new or existing ViewModel from the ViewModelProvider.
        mGoalViewModel = new ViewModelProvider(this).get(GoalViewModel.class);

        // Add an observer on the LiveData returned by getAlphabetizedGoals.
        // The onChanged() method fires when the observed data changes and the activity is
        // in the foreground.
        mGoalViewModel.getAllGoals().observe((LifecycleOwner) getContext(), goals -> {
            // Update the cached copy of the goals in the adapter.
            adapter.submitList(goals);
        });

        FloatingActionButton fab = binding.fab;
        fab.setOnClickListener(view -> {
            Intent intent = new Intent(getContext(), NewGoalActivity.class);
            startActivityForResult(intent, NEW_GOAL_ACTIVITY_REQUEST_CODE);
        });

        return root;
    }

    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == NEW_GOAL_ACTIVITY_REQUEST_CODE && resultCode == RESULT_OK) {
            Goal goal = new Goal(data.getStringExtra(NewGoalActivity.EXTRA_REPLY));
            mGoalViewModel.insert(goal);
        } else {
            Toast.makeText(
                    getContext(),
                    R.string.empty_not_saved,
                    Toast.LENGTH_LONG).show();
        }
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
