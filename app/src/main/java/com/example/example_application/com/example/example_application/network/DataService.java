package com.example.example_application.com.example.example_application.network;

import com.example.example_application.com.example.example_application.models.Model1;
import com.example.example_application.com.example.example_application.models.Model1.Model1Int;
import com.example.example_application.com.example.example_application.models.ResponseBody;
import com.example.example_application.com.example.example_application.models.ResponseBody.DeleteResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.PATCH;
import retrofit2.http.DELETE;
import retrofit2.http.Path;

public interface DataService {
    @GET("model1/{model1_id}")
    Call<Model1> getModel1(@Path("model1_id") int model1_id);

    @POST("model1")
    Call<ResponseBody<Model1>> postModel1(@Body Model1 model1);

    @PUT("model1/{model1_id}")
    Call<ResponseBody<Model1>> putModel1(@Body Model1 model1 ,@Path("model1_id") int model1_id);

    @PATCH("model1/{model1_id}")
    Call<ResponseBody<Model1Int>> patchModel1(@Body Model1Int model1Int ,@Path("model1_id") int model1_id);

    @DELETE("model1/{model1_id}")
    Call<DeleteResponse> deleteModel1(@Path("model1_id") int model1_id);

    @GET("model1s")
    Call<List<Model1>> getModel1s();
}


