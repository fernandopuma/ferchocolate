package com.tutsplus.zoo.utils;

import com.tutsplus.zoo.models.Pin;

import java.util.List;

import retrofit.Callback;
import retrofit.http.GET;

public interface PinsApiInterface {

    @GET("/Pins")
    void getStreams(Callback<List<Pin>> callback);
}
