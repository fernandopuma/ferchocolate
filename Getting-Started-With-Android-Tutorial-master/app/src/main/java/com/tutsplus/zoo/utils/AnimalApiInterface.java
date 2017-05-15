package com.tutsplus.zoo.utils;

import com.tutsplus.zoo.models.Animal;
import java.util.List;
import retrofit.Callback;
import retrofit.http.GET;

public interface AnimalApiInterface {

    @GET("/Exhibits")
    void getStreams(Callback<List<Animal>> callback);
}
