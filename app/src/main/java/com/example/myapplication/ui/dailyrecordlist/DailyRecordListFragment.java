package com.example.myapplication.ui.dailyrecordlist;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;
import com.example.myapplication.databinding.FragmentDailyRecordListBinding;

class DailyRecordListFragment extends Fragment {

    private RecyclerView recyclerView;
    private FragmentDailyRecordListBinding binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        binding=FragmentDailyRecordListBinding.inflate(inflater,container,false);
        View root=binding.getRoot();
        RecyclerView recyclerView=binding.dailyRecordsList;

        return inflater.inflate(R.layout.fragment_daily_record_list, container, false);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}