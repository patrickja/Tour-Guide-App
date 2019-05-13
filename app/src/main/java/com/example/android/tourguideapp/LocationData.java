package com.example.android.tourguideapp;

import java.util.ArrayList;

public class LocationData {

    private static ArrayList<LocationArray> mLocData;

    private LocationData() {
    }

    static {
        mLocData = new ArrayList<>();

        mLocData.add(new LocationArray(R.string.artMain, R.string.miaAddress,
                R.string.driving_info, R.drawable.mia_map_0,
                R.string.driving_info_1, R.drawable.mia_map_3));
    }

    public static ArrayList<LocationArray> getData() {
        return mLocData;
    }
}
