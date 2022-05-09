package com.example.myapplication.ui.setNewGoals;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.myapplication.databinding.FragmentSetNewGoalsBinding;


public class SetNewGoalsFragment extends Fragment {

        private FragmentSetNewGoalsBinding binding;

        public View onCreateView(@NonNull LayoutInflater inflater,
                                 ViewGroup container, Bundle savedInstanceState) {
            SetNewGoalsViewModel setnewgoalsViewModel =
                    new ViewModelProvider(this).get(SetNewGoalsViewModel.class);

            binding = FragmentSetNewGoalsBinding.inflate(inflater, container, false);
            View root = binding.getRoot();

            final TextView textView = binding.textSetNewGoals;
            setnewgoalsViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
            return root;
        }

        @Override
        public void onDestroyView() {
            super.onDestroyView();
            binding = null;
        }
    }

