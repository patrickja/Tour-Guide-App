package com.example.android.tourguideapp;

import java.util.ArrayList;

public class ExhibitData {

    private static ArrayList<ExhibitArray> mExData;

    private ExhibitData() {
    }

    static {
        mExData = new ArrayList<>();

        mExData.add(new ExhibitArray(R.string.exhibitOne, R.string.exhibitOneDate, R.drawable.mia_exhibit_1,
                R.string.exhibitTwo, R.string.exhibitTwoDate, R.drawable.mia_exhibit_2,
                R.string.exhibitThree, R.string.exhibitThreeDate, R.drawable.mia_exhibit_3_alt,
                R.string.exhibitFour, R.string.exhibitFourDate, R.drawable.mia_exhibit_4));
    }

    public static ArrayList<ExhibitArray> getData() {
        return mExData;
    }
}

