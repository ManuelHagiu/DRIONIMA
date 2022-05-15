package com.example.myapplication.ui.dailyrecord;

import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;

import com.example.myapplication.ui.setNewGoals.Goal;

public class DailyRecordListAdapter extends ListAdapter<DailyRecord,DailyRecordViewHolder> {
    protected DailyRecordListAdapter(@NonNull DiffUtil.ItemCallback<DailyRecord> diffCallback) {
        super(diffCallback);
    }

    @NonNull
    @Override
    public DailyRecordViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull DailyRecordViewHolder holder, int position) {
        DailyRecord current=getItem(position);
        holder.bind(current.getDateTime());
    }

    public static class DailyRecordDiff extends DiffUtil.ItemCallback<DailyRecord> {

        @Override
        public boolean areItemsTheSame(@NonNull DailyRecord oldItem, @NonNull DailyRecord newItem) {
            return oldItem == newItem;
        }


        @Override
        public boolean areContentsTheSame(@NonNull DailyRecord oldItem, @NonNull DailyRecord newItem) {
            return oldItem.getDateTime().equals(newItem.getDateTime());
        }
    }
}
