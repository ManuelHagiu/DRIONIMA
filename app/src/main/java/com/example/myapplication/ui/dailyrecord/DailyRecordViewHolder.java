package com.example.myapplication.ui.dailyrecord;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;

public class DailyRecordViewHolder extends RecyclerView.ViewHolder {
    private  TextView dateTime;

    private DailyRecordViewHolder(View itemView){
        super(itemView);

    }

    public void bind(String text) {
        dateTime.setText(text);
    }

}
