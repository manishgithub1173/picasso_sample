package com.example.picasso.picassosample.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.style.IconMarginSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.picasso.picassosample.R;
import com.example.picasso.picassosample.model.Image;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by manishkumar on 04/09/15.
 */
public class ImageListAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private ArrayList<Image> mImageList;
    private Context mContext;

    public ImageListAdapter(Context context, ArrayList<Image> imageList) {
        mImageList = imageList;
        mContext = context;
    }

    @Override
    public int getItemCount() {
        return mImageList.size();
    }

    public static class ImageViewHolder extends RecyclerView.ViewHolder {
        public ImageView image;

        public ImageViewHolder(View itemView) {
            super(itemView);
            image = (ImageView)itemView.findViewById(R.id.iv_image);
        }

    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.image_list_item,
                parent, false);
        ImageViewHolder imageViewHolder = new ImageViewHolder(view);
        imageViewHolder.image = (ImageView) view.findViewById(R.id.iv_image);
        return imageViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, final int position) {

        Picasso.with(mContext).load(mImageList.get(position).getUrl()).
                into(((ImageViewHolder) holder).image);
        ViewGroup.LayoutParams params = ((ImageViewHolder) holder).image.getLayoutParams();
        ((ImageViewHolder) holder).image.setLayoutParams(params);
    }
}
