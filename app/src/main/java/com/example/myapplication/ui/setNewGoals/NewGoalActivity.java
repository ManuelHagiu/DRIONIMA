package com.example.myapplication.ui.setNewGoals;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.myapplication.R;

public class NewGoalActivity extends AppCompatActivity {

    public static final String EXTRA_REPLY = "com.example.android.goallistsql.REPLY";

    private EditText mEditGoalView;
    private EditText mEditDataView;
    private EditText mEditMuschiView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_set_new_goals);
        mEditGoalView = findViewById(R.id.edit_goal);
        mEditDataView = findViewById(R.id.edit_data);
        mEditMuschiView = findViewById(R.id.edit_muschi);

        final Button button = findViewById(R.id.button_save);
        button.setOnClickListener(view -> {
            Intent replyIntent = new Intent();
            if (TextUtils.isEmpty(mEditGoalView.getText())) {
                setResult(RESULT_CANCELED, replyIntent);
            } else {
                String goal = mEditDataView.getText().toString() + " - " + mEditMuschiView.getText().toString() + " - " + mEditGoalView.getText().toString();
                replyIntent.putExtra(EXTRA_REPLY, goal);
                setResult(RESULT_OK, replyIntent);
            }
            finish();
        });
    }
}

