package com.example.myapplication.ui.dailyrecord;

import android.os.Build;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.time.LocalDateTime;

@Entity(tableName = "daily_records_table")
public class DailyRecord {
    private final int waterLitres, workoutRate, sleepHours, caloriesConsumed;
    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "dateTime")
    private String dateTime;

    @RequiresApi(api = Build.VERSION_CODES.O)
    public DailyRecord(int waterLitres, int workoutRate, int sleepHours, int caloriesConsumed) {
        this.waterLitres = waterLitres;
        this.workoutRate = workoutRate;
        this.sleepHours = sleepHours;
        this.caloriesConsumed = caloriesConsumed;
        this.dateTime= LocalDateTime.now().toString();
    }

    @ColumnInfo(name = "waterLitres")
    public int getWaterLitres() {
        return waterLitres;
    }

    @ColumnInfo(name = "workoutRate")
    public int getWorkoutRate() {
        return workoutRate;
    }

    @ColumnInfo(name = "sleepHours")
    public int getSleepHours() {
        return sleepHours;
    }

    @ColumnInfo(name = "caloriesConsumed")
    public int getCaloriesConsumed() {
        return caloriesConsumed;
    }






}
