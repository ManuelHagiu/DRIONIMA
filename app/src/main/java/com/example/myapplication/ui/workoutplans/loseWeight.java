package com.example.myapplication.ui.workoutplans;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.widget.TextView;


import com.example.myapplication.R;

public class loseWeight extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lose_weight);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        TextView textView = findViewById(R.id.running);
        TextView textview1 = findViewById(R.id.battle_ropes);
        TextView textview2 = findViewById(R.id.squats);

    }
}