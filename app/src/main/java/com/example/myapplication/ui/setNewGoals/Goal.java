package com.example.myapplication.ui.setNewGoals;
import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "goal_table")
public class Goal {
    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "goal")
    private String mGoal;

    public Goal(@NonNull String goal) {
        this.mGoal = goal;
    }

    @NonNull
    public String getGoal() {
        return this.mGoal;
    }
}
