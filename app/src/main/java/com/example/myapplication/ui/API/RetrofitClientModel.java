package com.example.myapplication.ui.API;

import androidx.lifecycle.ViewModel;

import java.util.ArrayList;

public class RetrofitClientModel extends ViewModel {

    ArrayList<items> items;

    public ArrayList<RetrofitClientModel.items> getItems()
    {
        return items;
    }

    public void setItems(ArrayList<RetrofitClientModel.items> items)
    {
        this.items = items;
    }

    public class items{

        float sugar_g;
        float fiber_g;
        float serving_size_g;
        int sodium_mg;
        String name;
        int postassium_mg;
        float fat_saturated_g;
        float fat_total_g;
        float calories;
        int cholesterol_mg;
        float protein_g;
        float carbohydrates_total_g;

        public float getSugar_g() {
            return sugar_g;
        }

        public void setSugar_g(float sugar_g) {
            this.sugar_g = sugar_g;
        }

        public float getFiber_g() {
            return fiber_g;
        }

        public void setFiber_g(float fiber_g) {
            this.fiber_g = fiber_g;
        }

        public float getServing_size_g() {
            return serving_size_g;
        }

        public void setServing_size_g(float serving_size_g) {
            this.serving_size_g = serving_size_g;
        }

        public int getSodium_mg() {
            return sodium_mg;
        }

        public void setSodium_mg(int sodium_mg) {
            this.sodium_mg = sodium_mg;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getPostassium_mg() {
            return postassium_mg;
        }

        public void setPostassium_mg(int postassium_mg) {
            this.postassium_mg = postassium_mg;
        }

        public float getFat_saturated_g() {
            return fat_saturated_g;
        }

        public void setFat_saturated_g(float fat_saturated_g) {
            this.fat_saturated_g = fat_saturated_g;
        }

        public float getFat_total_g() {
            return fat_total_g;
        }

        public void setFat_total_g(float fat_total_g) {
            this.fat_total_g = fat_total_g;
        }

        public float getCalories() {
            return calories;
        }

        public void setCalories(float calories) {
            this.calories = calories;
        }

        public int getCholesterol_mg() {
            return cholesterol_mg;
        }

        public void setCholesterol_mg(int cholesterol_mg) {
            this.cholesterol_mg = cholesterol_mg;
        }

        public float getProtein_g() {
            return protein_g;
        }

        public void setProtein_g(float protein_g) {
            this.protein_g = protein_g;
        }

        public float getCarbohydrates_total_g() {
            return carbohydrates_total_g;
        }

        public void setCarbohydrates_total_g(float carbohydrates_total_g) {
            this.carbohydrates_total_g = carbohydrates_total_g;
        }
    }
}
