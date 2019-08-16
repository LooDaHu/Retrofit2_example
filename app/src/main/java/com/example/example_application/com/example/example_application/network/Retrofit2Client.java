package com.example.example_application.com.example.example_application.network;

import android.util.Log;

import com.example.example_application.com.example.example_application.models.Model1;
import com.example.example_application.com.example.example_application.models.Model1.Model1Int;
import com.example.example_application.com.example.example_application.models.ResponseBody;
import com.example.example_application.com.example.example_application.models.ResponseBody.DeleteResponse;
import com.google.gson.Gson;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.converter.gson.GsonConverterFactory;

public class Retrofit2Client {

    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("http://127.0.0.1:8000/")
            .addConverterFactory(GsonConverterFactory.create(new Gson()))
            .build();


    public void getModel1(int model1Id) {
        DataService service = retrofit.create(DataService.class);
        Call<Model1> call = service.getModel1(model1Id);
        call.enqueue(new Callback<Model1>() {
            @Override
            public void onResponse(Call<Model1> call, Response<Model1> response) {
                Model1 model1 = response.body();
                System.out.println(model1);
            }

            @Override
            public void onFailure(Call<Model1> call, Throwable t) {
                Log.e("Error", t.toString());
            }
        });
    }


    public void getModel1s() {
        DataService service = retrofit.create(DataService.class);
        Call<List<Model1>> call = service.getModel1s();
        call.enqueue(new Callback<List<Model1>>() {
            @Override
            public void onResponse(Call<List<Model1>> call, Response<List<Model1>> response) {
                List model1s = response.body();
                System.out.println(model1s);
            }

            @Override
            public void onFailure(Call<List<Model1>> call, Throwable t) {
                Log.e("Error", t.toString());
            }
        });
    }

    public void postModel1(Model1 model1) {
        DataService service = retrofit.create(DataService.class);
        Call<ResponseBody<Model1>> call = service.postModel1(model1);
        call.enqueue(new Callback<ResponseBody<Model1>>() {
            @Override
            public void onResponse(Call<ResponseBody<Model1>> call, Response<ResponseBody<Model1>> response) {
                ResponseBody responseBody = response.body();
                System.out.println(responseBody);
            }

            @Override
            public void onFailure(Call<ResponseBody<Model1>> call, Throwable t) {
                Log.e("Error", t.toString());
            }
        });
    }

    public void putModel1(Model1 model1, int model1Id) {
        DataService service = retrofit.create(DataService.class);
        Call<ResponseBody<Model1>> call = service.putModel1(model1, model1Id);
        call.enqueue(new Callback<ResponseBody<Model1>>() {
            @Override
            public void onResponse(Call<ResponseBody<Model1>> call, Response<ResponseBody<Model1>> response) {
                ResponseBody responseBody = response.body();
                System.out.println(responseBody);
            }

            @Override
            public void onFailure(Call<ResponseBody<Model1>> call, Throwable t) {
                Log.e("Error", t.toString());
            }
        });
    }

    public void patchModel1(Model1Int model1Int, int model1Id) {
        DataService service = retrofit.create(DataService.class);
        Call<ResponseBody<Model1Int>> call = service.patchModel1(model1Int, model1Id);
        call.enqueue(new Callback<ResponseBody<Model1Int>>() {
            @Override
            public void onResponse(Call<ResponseBody<Model1Int>> call, Response<ResponseBody<Model1Int>> response) {
                ResponseBody responseBody = response.body();
                System.out.println(responseBody);
            }

            @Override
            public void onFailure(Call<ResponseBody<Model1Int>> call, Throwable t) {
                Log.e("Error", t.toString());
            }
        });
    }


    public void delModel1(int model1Id) {
        DataService service = retrofit.create(DataService.class);
        Call<DeleteResponse> call = service.deleteModel1(model1Id);
        call.enqueue(new Callback<DeleteResponse>() {
            @Override
            public void onResponse(Call<DeleteResponse> call, Response<DeleteResponse> response) {
                DeleteResponse delResponse = response.body();
                System.out.println(delResponse);
            }

            @Override
            public void onFailure(Call<DeleteResponse> call, Throwable t) {
                Log.e("Error", t.toString());
            }
        });
    }
}
