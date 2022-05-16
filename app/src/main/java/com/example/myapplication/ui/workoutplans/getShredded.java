package com.example.myapplication.ui.workoutplans;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.widget.TextView;

import com.example.myapplication.R;

public class getShredded extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_shredded);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        TextView textView = findViewById(R.id.sit_ups);
        TextView textView1 = findViewById(R.id.twists);
        TextView textView2 = findViewById(R.id.planks);
    }
}