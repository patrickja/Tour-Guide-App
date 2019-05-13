package com.example.android.tourguideapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class LocationAdapter extends ArrayAdapter<LocationArray> {

    public LocationAdapter(Activity context, ArrayList<LocationArray> Locations) {

        super(context, 0, Locations);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.fragment_fourth, parent, false);
        }

        LocationArray currentLocationArray = getItem(position);

        TextView locationOneTextView = listItemView.findViewById(R.id.location_text_one);
        locationOneTextView.setText(currentLocationArray.getLocationOneText());

        TextView locationTwoTextView = listItemView.findViewById(R.id.location_text_two);
        locationTwoTextView.setText(currentLocationArray.getLocationTwoText());

        TextView locationDriveTextView = listItemView.findViewById(R.id.location_driving_text);
        locationDriveTextView.setText(currentLocationArray.getLocationDriveText());

        ImageView locationDriveImageView = listItemView.findViewById(R.id.location_driving_image);
        locationDriveImageView.setImageResource(currentLocationArray.getLocationDriveImage());

        TextView locationParkTextView = listItemView.findViewById(R.id.location_parking_text);
        locationParkTextView.setText(currentLocationArray.getLocationParkText());

        ImageView locationParkImageView = listItemView.findViewById(R.id.location_parking_image);
        locationParkImageView.setImageResource(currentLocationArray.getLocationParkImage());

        return listItemView;
    }
}