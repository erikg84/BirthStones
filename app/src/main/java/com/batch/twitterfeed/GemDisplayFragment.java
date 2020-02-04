package com.batch.twitterfeed;


import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class GemDisplayFragment extends Fragment {
    RecyclerView myRecycler;
    MyAdapter myAdapter;
    GridLayoutManager myGrid;
    public GemDisplayFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.fragment_gem_display, container, false);
        myGrid = new GridLayoutManager(container.getContext(),3);
        myRecycler = rootView.findViewById(R.id.recycle_view);
        myRecycler.setLayoutManager(new LinearLayoutManager(getActivity()));
       // String rsc = rootView.findViewById(R.string.)
        GemAPI api = new GemAPI();
        myAdapter = new MyAdapter(getActivity(), api.getList(container.getContext()),myGrid);
        myRecycler.setAdapter(myAdapter);
        myRecycler.setLayoutManager(myGrid);
        return rootView;
    }
}
