package com.example.muhammadrizki_crud_api;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    MyNovel myNovel;
    NovelAdapter adapter;
    RecyclerView rv_novel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rv_novel = findViewById(R.id.rv_novell);
        myNovel = new MyNovel(this);
        rv_novel.setHasFixedSize(true);
        rv_novel.setLayoutManager(new LinearLayoutManager(this));
        adapter = new NovelAdapter(myNovel);
        rv_novel.setAdapter(adapter);
        getDataNovel();
    }
    public void getDataNovel(){
        myNovel.getInstance().getNovel().enqueue(new Callback<NovelResponse<NovelItem>>() {
            @Override
            public void onResponse(Call<NovelResponse<NovelItem>> call, Response<NovelResponse<NovelItem>> response) {
                NovelResponse<NovelItem> resp = response.body();
                if (resp.getResult() != null && resp.getResult().size() > 0){
                    adapter = new NovelAdapter(resp.getResult(),MainActivity.this);
                    rv_novel.setAdapter(adapter);
                }
            }
            @Override
            public void onFailure(Call<NovelResponse<NovelItem>> call, Throwable t) {
                Toast.makeText(MainActivity.this, t.getMessage(),Toast.LENGTH_SHORT).show();
            }
        });
    }
}