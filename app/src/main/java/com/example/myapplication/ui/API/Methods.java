package com.example.myapplication.ui.API;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;

public interface Methods {


    @Headers({"X-Api-Key:Y2aCeWQxg/KL4e0Zuzs5OQ==DTAdvVeV8kA2T7vr"})
    @GET("v1/nutrition?query=20oz onion and a tomato")
    Call<RetrofitClientModel> getAllItems();
}
