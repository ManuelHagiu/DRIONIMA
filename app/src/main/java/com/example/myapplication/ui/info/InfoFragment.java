package com.example.myapplication.ui.info;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.myapplication.databinding.FragmentInfoBinding;

public class InfoFragment extends Fragment {
    private FragmentInfoBinding binding;


    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        InfoViewModel infoViewModel = new ViewModelProvider(this).get(InfoViewModel.class);

        binding = FragmentInfoBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textViewvar = binding.InfoTitle;
        infoViewModel.getTextView().observe(getViewLifecycleOwner(), textViewvar::setText);
        final Button button = binding.button;
        button.setOnClickListener(v->{
            Intent i = new Intent(getContext(), MoreInfo.class);
            startActivity(i);
        });
        final Button button1 = binding.button2;
        button1.setOnClickListener(v-> Toast.makeText(getContext(), "You look good today G!", Toast.LENGTH_SHORT).show());
        final TextView editText = binding.editTextTextMultiLine;
        infoViewModel.getEditTextMultiLine().observe(getViewLifecycleOwner(), editText::setText);

        return root;
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
