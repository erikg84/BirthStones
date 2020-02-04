package com.batch.twitterfeed;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<GemHolder> {

    Context context;
    ArrayList<GemModel> models;
    GridLayoutManager myGrid;
    public MyAdapter(Context context, ArrayList<GemModel> models, GridLayoutManager grid) {
        this.context = context;
        this.models = models;
        myGrid = grid;
    }

    @NonNull
    @Override
    public GemHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_item,parent,false);
        return new GemHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GemHolder holder, int position) {
        final String name = models.get(position).getName();
        final String description = models.get(position).getDescription();
        final int imageId = models.get(position).getImageId();

        holder.myImage.setImageResource(imageId);

        //
        holder.relative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putString("name",name);
                bundle.putString("description",description);
                bundle.putInt("imageId",imageId);
                GemDetailViewFragment gemDetailViewFragment = new GemDetailViewFragment();
                gemDetailViewFragment.setArguments(bundle);
                ((AppCompatActivity) context).getSupportFragmentManager().beginTransaction().replace(R.id.fragment_manager,gemDetailViewFragment).addToBackStack(null).commit();
            }
        });
    }

    @Override
    public int getItemCount() {
        return models.size();
    }
}
