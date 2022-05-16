package com.example.myapplication.ui.dailyrecord;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;

public class DailyRecordViewHolder extends RecyclerView.ViewHolder {
    private  TextView dateTime;

    public DailyRecordViewHolder(View itemView){
        super(itemView);
        dateTime = itemView.findViewById(R.id.textView);
    }

    public void bind(String text) {

        dateTime.setText(text);
    }

    static DailyRecordViewHolder create(ViewGroup parent) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recyclerview_item, parent, false);
        return new DailyRecordViewHolder(view);
    }

}
