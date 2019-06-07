package com.example.android.tourguideapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MapAdapter extends ArrayAdapter<MapArray> {

    public MapAdapter(Activity context, ArrayList<MapArray> Maps) {

        super(context, 0, Maps);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (convertView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.fragment_fifth, parent, false);
        }

        MapArray currentMapArray = getItem(position);

        TextView mapOneTextView = listItemView.findViewById(R.id.floor_one_text);
        mapOneTextView.setText(currentMapArray.getMapOneText());

        ImageView mapOneImageView = listItemView.findViewById(R.id.floor_one_image);
        mapOneImageView.setImageResource(currentMapArray.getMapOneImage());

        TextView mapTwoTextView = listItemView.findViewById(R.id.floor_two_text);
        mapTwoTextView.setText(currentMapArray.getMapTwoText());

        ImageView mapTwoImageView = listItemView.findViewById(R.id.floor_two_image);
        mapTwoImageView.setImageResource(currentMapArray.getMapThreeImage());

        TextView mapThreeTextView = listItemView.findViewById(R.id.floor_three_text);
        mapThreeTextView.setText(currentMapArray.getMapThreeText());

        ImageView mapThreeImageView = listItemView.findViewById(R.id.floor_three_image);
        mapThreeImageView.setImageResource(currentMapArray.getMapTwoImage());

        return listItemView;
    }
}