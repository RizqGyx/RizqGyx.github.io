package com.example.muhammadrizki_crud_api;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class NovelAdapter extends RecyclerView.Adapter<NovelAdapter.ViewHolder> {
    List<NovelItem> result;
    Activity activity;
    public NovelAdapter(List<NovelItem> result, Activity activity){
        this.result = result;
        this.activity = activity;
    }

    public NovelAdapter(MyNovel myNovel) {

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_novel, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.bind(result.get(position));
    }

    @Override
    public int getItemCount() {
        return result != null ? result.size() : 0;
    }
    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tv_idNovel, tv_judul, tv_pengarang, tv_tahunTerbit, tv_halaman;
        ImageView sampulView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_idNovel = itemView.findViewById(R.id.tv_idnovel);
            tv_judul = itemView.findViewById(R.id.tv_judul);
            tv_pengarang = itemView.findViewById(R.id.tv_pengarang);
            tv_tahunTerbit = itemView.findViewById(R.id.tv_tahun_terbit);
            tv_halaman = itemView.findViewById(R.id.tv_halaman);
            sampulView = itemView.findViewById(R.id.sampulView);
        }
        public void bind(NovelItem novelItem) {
            tv_idNovel.setText(novelItem.ID_Buku);
            tv_judul.setText(novelItem.Judul);
            tv_pengarang.setText(novelItem.Pengarang);
            tv_tahunTerbit.setText(novelItem.Tahun_Terbit);
            tv_halaman.setText(novelItem.Halaman);
            Glide.with(activity).load(novelItem.getSampul()).into(sampulView);
        }
    }
}
