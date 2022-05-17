package com.example.myapplication.ui.dailyrecordlist;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;
import com.example.myapplication.databinding.*;
import com.example.myapplication.ui.dailyrecord.DailyRecordListAdapter;
import com.example.myapplication.ui.dailyrecord.DailyRecordViewModel;
import com.example.myapplication.ui.setNewGoals.GoalListAdapter;
import com.example.myapplication.ui.setNewGoals.GoalViewModel;
import com.example.myapplication.ui.setNewGoals.NewGoalActivity;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class DailyRecordListFragment extends Fragment {
    private DailyRecordViewModel mDailyRecordViewModel;
    private RecyclerView recyclerView;
    private FragmentDailyRecordListBinding binding;
    public static final int NEW_GOAL_ACTIVITY_REQUEST_CODE = 1;


/*    @Nullable
    @Override*/
    @RequiresApi(api = Build.VERSION_CODES.O)
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {
        binding=FragmentDailyRecordListBinding.inflate(inflater,container,false);
        View root=binding.getRoot();



        /*DailyRecordListViewModel dailyRecordListViewModel =
                new ViewModelProvider(this).get(DailyRecordListViewModel.class);*/
        RecyclerView recyclerView=binding.dailyRecordsRecycler;

        final DailyRecordListAdapter adapter = new DailyRecordListAdapter(new DailyRecordListAdapter.DailyRecordDiff());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        // Get a new or existing ViewModel from the ViewModelProvider.

         mDailyRecordViewModel = new ViewModelProvider(this).get(DailyRecordViewModel.class);
        // Add an observer on the LiveData returned by getAlphabetizedGoals.
        // The onChanged() method fires when the observed data changes and the activity is
        // in the foreground.

        mDailyRecordViewModel.getAllDailyRecords().observe((LifecycleOwner) getContext(), dailyRecords -> {
            // Update the cached copy of the goals in the adapter.
            //Log.i("hej", dailyRecords.toString());
            adapter.submitList(dailyRecords);
        });



        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}