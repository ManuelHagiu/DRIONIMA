package com.example.myapplication.ui.dailyrecord;

import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;


public class DailyRecordListAdapter extends ListAdapter<DailyRecord,DailyRecordViewHolder> {
    public DailyRecordListAdapter(@NonNull DiffUtil.ItemCallback<DailyRecord> diffCallback) {
        super(diffCallback);
    }

    @NonNull
    @Override
    public DailyRecordViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return DailyRecordViewHolder.create(parent);
    }

    @Override
    public void onBindViewHolder(@NonNull DailyRecordViewHolder holder, int position) {
        DailyRecord current=getItem(position);
        holder.bind(
                "WorkoutRate: " + current.getWorkoutRate() +
                     " WaterLitres: " + current.getWaterLitres() +
                     " SleepHours: " + current.getSleepHours() +
                     " CaloriesConsumed: " + current.getCaloriesConsumed()
        );
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
