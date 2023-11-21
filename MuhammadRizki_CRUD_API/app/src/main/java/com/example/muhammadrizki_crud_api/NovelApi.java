package com.example.muhammadrizki_crud_api;

import retrofit2.Call;
import retrofit2.http.GET;

public interface NovelApi {
    @GET("perpustakaan.json")
    Call<NovelResponse<NovelItem>> getNovel();
}
