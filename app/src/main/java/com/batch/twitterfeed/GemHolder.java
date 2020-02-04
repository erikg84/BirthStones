package com.batch.twitterfeed;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class GemHolder extends RecyclerView.ViewHolder{
    ImageView myImage;
    RelativeLayout relative;

    public GemHolder(@NonNull View itemView) {
        super(itemView);
        myImage = itemView.findViewById(R.id.image_view);
        relative = itemView.findViewById(R.id.relative);
    }

}
