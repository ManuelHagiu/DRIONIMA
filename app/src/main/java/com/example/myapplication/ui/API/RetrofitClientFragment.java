package com.example.myapplication.ui.API;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.myapplication.R;
import com.example.myapplication.databinding.FragmentApiBinding;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClientFragment extends Fragment {
    private FragmentApiBinding binding;
    public static final String TAG = "RetrofitClientFragment";
    ArrayList<RetrofitClientModel.items> items;

   public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
       RetrofitClientModel retrofitClientModel = new ViewModelProvider(this).get(RetrofitClientModel.class);

       binding = FragmentApiBinding.inflate(inflater, container, false);
       View root = binding.getRoot();


       binding.getItems.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Methods methods = RetrofitClientFragment.getRetrofitInstance().create(Methods.class);
               Call<RetrofitClientModel> call = methods.getAllItems();

               call.enqueue(new Callback<RetrofitClientModel>() {
                   @Override
                   public void onResponse(Call<RetrofitClientModel> call, Response<RetrofitClientModel> response) {
                       Log.e(TAG, "onResponse: code:  "+response.code());
                       System.out.println(call.request().url());

                       ArrayList<RetrofitClientModel.items> items = response.body().getItems();

                       for(RetrofitClientModel.items items1 : items){
                           Log.e(TAG, "onResponse: sugar : "+items1.getSugar_g());
                       }
                   }

                   @Override
                   public void onFailure(Call<RetrofitClientModel> call, Throwable t) {
                       Log.e(TAG, "onFailure: "+t.getMessage());
                   }
               });
           }
       });
       return root;
   }


        private static Retrofit retrofit;
        private static String BASE_URL = "https://api.calorieninjas.com/";

    public static Retrofit getRetrofitInstance() {
            if (retrofit == null) {
                retrofit = new Retrofit.Builder()
                        .baseUrl(BASE_URL)
                        .addConverterFactory(GsonConverterFactory.create())
                        .build();
            }
            return retrofit;
        }

}
