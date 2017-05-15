package com.tutsplus.zoo.utils;

import com.tutsplus.zoo.models.GalleryImage;

import java.util.List;
import retrofit.Callback;
import retrofit.http.GET;

public interface GalleryApiInterface {

    @GET("/Gallery")
    void getStreams(Callback<List<GalleryImage>> callback);
}
