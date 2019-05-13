package com.example.android.tourguideapp;

public class LocationArray {

    private int mLocationOneText;
    private int mLocationTwoText;

    private int mLocationDriveText;
    private int mLocationDriveImage;

    private int mLocationParkText;
    private int mLocationParkImage;

    public LocationArray(int LocationOneText, int LocationTwoText,
                         int LocationDriveText, int LocationDriveImage,
                         int LocationParkText, int LocationParkImage) {
        mLocationOneText = LocationOneText;
        mLocationTwoText = LocationTwoText;

        mLocationDriveText = LocationDriveText;
        mLocationDriveImage = LocationDriveImage;

        mLocationParkText = LocationParkText;
        mLocationParkImage = LocationParkImage;

    }

    public int getLocationOneText() {
        return mLocationOneText;
    }

    public int getLocationTwoText() {
        return mLocationTwoText;
    }

    public int getLocationDriveText() {
        return mLocationDriveText;
    }

    public int getLocationDriveImage() {
        return mLocationDriveImage;
    }

    public int getLocationParkText() {
        return mLocationParkText;
    }

    public int getLocationParkImage() {
        return mLocationParkImage;
    }

}
