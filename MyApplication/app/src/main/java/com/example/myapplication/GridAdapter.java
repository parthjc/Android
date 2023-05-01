package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class GridAdapter extends BaseAdapter {

    private String name [];
    private int images [];
    Context context;

    public GridAdapter(String[] name, int[] images, Context context) {
        this.name = name;
        this.images = images;
        this.context = context;
    }

    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        LayoutInflater layoutInflater = (LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        view = layoutInflater.inflate(R.layout.single_frame,null);

        ImageView img = (ImageView) view.findViewById(R.id.iconimg);
        TextView tv = (TextView) view.findViewById(R.id.textdata);

        img.setImageResource(images[i]);
        tv.setText(name[i]);

        return view;
    }
}
