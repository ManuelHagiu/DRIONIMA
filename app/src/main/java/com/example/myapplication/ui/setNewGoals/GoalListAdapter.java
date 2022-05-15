package com.example.myapplication.ui.setNewGoals;


import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.example.myapplication.MainActivity;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;

public class GoalListAdapter extends ListAdapter<Goal, GoalViewHolder> {

    public GoalListAdapter(@NonNull DiffUtil.ItemCallback<Goal> diffCallback) {
        super(diffCallback);
    }

    @Override
    public GoalViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return GoalViewHolder.create(parent);
    }

    @Override
    public void onBindViewHolder(GoalViewHolder holder, int position) {
        Goal current = getItem(position);
        holder.bind(current.getGoal());
    }

   public static class GoalDiff extends DiffUtil.ItemCallback<Goal> {

        @Override
        public boolean areItemsTheSame(@NonNull Goal oldItem, @NonNull Goal newItem) {
            return oldItem == newItem;
        }


        @Override
        public boolean areContentsTheSame(@NonNull Goal oldItem, @NonNull Goal newItem) {
            return oldItem.getGoal().equals(newItem.getGoal());
        }
    }
}
