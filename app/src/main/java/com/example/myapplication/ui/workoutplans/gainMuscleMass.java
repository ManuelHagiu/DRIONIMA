package com.example.myapplication.ui.workoutplans;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.widget.TextView;

import com.example.myapplication.R;

public class gainMuscleMass extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gain_muscle_mass);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        TextView textView = findViewById(R.id.pull_ups);
        TextView textView1 = findViewById(R.id.lunges);
        TextView textView2 = findViewById(R.id.one_arm_push_ups);
    }
}