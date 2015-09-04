package com.example.picasso.picassosample.fragment;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.picasso.picassosample.R;
import com.example.picasso.picassosample.Utilities;
import com.example.picasso.picassosample.adapter.ImageListAdapter;
import com.example.picasso.picassosample.model.Image;

import java.util.ArrayList;


/**
 * A placeholder fragment containing a simple view.
 */
public class ImageListFragment extends Fragment {

    private RecyclerView mRecyclerView;

    public ImageListFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_main, container, false);

        ArrayList<Image> imageArrayList = populateImage();
        mRecyclerView = (RecyclerView) view.findViewById(R.id.image_list);
        mRecyclerView.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        mRecyclerView.setLayoutManager(linearLayoutManager);
        ImageListAdapter adapter = new ImageListAdapter(getActivity(), imageArrayList);
        mRecyclerView.setAdapter(adapter);

        return view;
    }

    private ArrayList<Image> populateImage() {
        return Utilities.getImageList();
    }
}
