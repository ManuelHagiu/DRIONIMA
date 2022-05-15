package com.example.myapplication.ui.setNewGoals;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;

class GoalViewHolder extends RecyclerView.ViewHolder {
    private final TextView goalItemView;

    private GoalViewHolder(View itemView) {
        super(itemView);
        goalItemView = itemView.findViewById(R.id.textView);
    }

    public void bind(String text) {
        goalItemView.setText(text);
    }

    static GoalViewHolder create(ViewGroup parent) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recyclerview_item, parent, false);
        return new GoalViewHolder(view);
    }
}
