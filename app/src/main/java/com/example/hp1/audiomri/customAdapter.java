package com.example.hp1.audiomri;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Hp1 on 27/09/2017.
 */

public class CustomAdapter extends ArrayAdapter<Item> {

    public CustomAdapter(Context context, int resource, List<Item> objects) {
        super(context, R.layout.custom_row, objects);
    }

    public View getView(int position, View convertViewm, ViewGroup parent) {
        LayoutInflater imageInflater = LayoutInflater.from(getContext());
        View cuView = imageInflater.inflate(R.layout.custom_row, parent, false);


        Item items = getItem(position);
        TextView tv1 = (TextView) cuView.findViewById(R.id.tv1);
        ImageView ig1 = (ImageView) cuView.findViewById(R.id.ig1);


        tv1.setText(items.getTv1());
        ig1.setImageResource(items.getIg1());

        return cuView;
    }

}
