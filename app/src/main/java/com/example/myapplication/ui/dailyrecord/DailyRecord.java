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
    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "dateTime")
    public String dateTime;

    @ColumnInfo(name = "waterLitres")
    private final int waterLitres;
    @ColumnInfo(name = "workoutRate")
    private final int workoutRate;
    @ColumnInfo(name = "sleepHours")
    private final int sleepHours;
    @ColumnInfo(name = "caloriesConsumed")
    private final int caloriesConsumed;


    @RequiresApi(api = Build.VERSION_CODES.O)
    public DailyRecord(int waterLitres, int workoutRate, int sleepHours, int caloriesConsumed) {
        this.waterLitres = waterLitres;
        this.workoutRate = workoutRate;
        this.sleepHours = sleepHours;
        this.caloriesConsumed = caloriesConsumed;
        this.dateTime= LocalDateTime.now().toString();
    }

    public int getWaterLitres() {
        return waterLitres;
    }


    public int getWorkoutRate() {
        return workoutRate;
    }


    public int getSleepHours() {
        return sleepHours;
    }


    public int getCaloriesConsumed() {
        return caloriesConsumed;
    }

    @NonNull
    public String getDateTime(){
        return dateTime;
    }







}
