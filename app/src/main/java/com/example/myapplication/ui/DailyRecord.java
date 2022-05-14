package com.example.myapplication.ui;

public class DailyRecord {
    private final int waterLitres, workoutRate, sleepHours, caloriesConsumed;

    public DailyRecord(int waterLitres, int workoutRate, int sleepHours, int caloriesConsumed) {
        this.waterLitres = waterLitres;
        this.workoutRate = workoutRate;
        this.sleepHours = sleepHours;
        this.caloriesConsumed = caloriesConsumed;
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






}
