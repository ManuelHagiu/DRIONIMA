package com.example.myapplication.ui;

public class Goal {
    private String name, description, period;
    private int quantity;

    public Goal(String name){
        this.name=name;
        this.description="";
        this.period="";
        this.quantity=0;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getPeriod() {
        return period;
    }
}
