package com.example.myapplication.ui.dailyrecord;



import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;

import com.example.myapplication.R;

public class DailyRecordActivity extends AppCompatActivity {

    public static final String EXTRA_REPLY = "com.example.android.dailyRecordlistsql.REPLY";

    private SeekBar mWaterBarView;
    private SeekBar mWorkoutBarView;
    private SeekBar mSleepBarView;
    private SeekBar mCaloriesBarView;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.fragment_daily_record_list);
        mWaterBarView = findViewById(R.id.waterBar);
        mWorkoutBarView = findViewById(R.id.waterBar);
        mSleepBarView = findViewById(R.id.sleepBar);
        mCaloriesBarView = findViewById(R.id.caloriesBar);


        final Button button = findViewById(R.id.saveButton);
        button.setOnClickListener(view -> {
            Intent replyIntent = new Intent();
            if (TextUtils.isEmpty(mWaterBarView.getAccessibilityClassName())) {
                setResult(RESULT_CANCELED, replyIntent);
            } else {
                String dailyRecord = mWaterBarView.getProgress() + " - " + mWorkoutBarView.getProgress() + " - "  + mSleepBarView.getProgress() + " - " + mCaloriesBarView.getProgress();
                replyIntent.putExtra(EXTRA_REPLY, dailyRecord);
                setResult(RESULT_OK, replyIntent);
            }
            finish();
        });
    }
}

