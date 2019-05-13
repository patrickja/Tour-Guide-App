package com.example.android.tourguideapp;

public class MapArray {

    private int mMapOneText;
    private int mMapOneImage;

    private int mMapTwoText;
    private int mMapTwoImage;

    private int mMapThreeText;
    private int mMapThreeImage;


    public MapArray(int MapOneImage, int MapOneText,
                    int MapTwoImage, int MapTwoText,
                    int MapThreeImage, int MapThreeText) {
        mMapOneText = MapOneText;
        mMapOneImage = MapOneImage;

        mMapTwoText = MapTwoText;
        mMapTwoImage = MapTwoImage;

        mMapThreeText = MapThreeText;
        mMapThreeImage = MapThreeImage;
    }

    public int getMapOneText() {
        return mMapOneText;
    }

    public int getMapOneImage() {
        return mMapOneImage;
    }

    public int getMapTwoText() {
        return mMapTwoText;
    }

    public int getMapTwoImage() {
        return mMapTwoImage;
    }

    public int getMapThreeText() {
        return mMapThreeText;
    }

    public int getMapThreeImage() {
        return mMapThreeImage;
    }

}

