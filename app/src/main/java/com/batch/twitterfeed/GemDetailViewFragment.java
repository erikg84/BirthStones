package com.batch.twitterfeed;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class GemDetailViewFragment extends Fragment {

    ImageView imageView;
    TextView nameView;
    TextView descView;
    String name, description;
    int imageId;

    public GemDetailViewFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_gem_detail_view, container, false);


        imageView = rootView.findViewById(R.id.detail_image);
        nameView = rootView.findViewById(R.id.detail_name);
        descView = rootView.findViewById(R.id.detail_description);

        Bundle bundle = this.getArguments();
        name = bundle.getString("name");
        description = bundle.getString("description");
        imageId = bundle.getInt("imageId",0);

        imageView.setImageResource(imageId);
        nameView.setText(name);
        descView.setText(description);

        return rootView;
    }

}
