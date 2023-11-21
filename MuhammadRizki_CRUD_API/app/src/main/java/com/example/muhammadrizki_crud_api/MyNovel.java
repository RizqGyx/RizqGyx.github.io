package com.example.muhammadrizki_crud_api;

import android.content.Context;

public class MyNovel {
    NovelApi novelApi;
    public MyNovel(Context context) {
        novelApi = RetrofitBuilder
                .builder(context)
                .create(NovelApi.class);
    }
    public NovelApi getInstance() {
        return novelApi;
    }
}
