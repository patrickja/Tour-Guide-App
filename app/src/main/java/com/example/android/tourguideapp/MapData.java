package com.example.android.tourguideapp;

import java.util.ArrayList;

public class MapData {

    private static ArrayList<MapArray> mMapData;

    private MapData() {
    }

    static {
        mMapData = new ArrayList<>();

        mMapData.add(new MapArray(R.drawable.mia_floor_1_1, R.string.floor_one,
                R.drawable.mia_floor_2_1, R.string.floor_two,
                R.drawable.mia_floor_3_1, R.string.floor_three));
    }

    public static ArrayList<MapArray> getData() {
        return mMapData;
    }
}
