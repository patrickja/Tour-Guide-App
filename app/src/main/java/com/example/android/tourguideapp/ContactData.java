package com.example.android.tourguideapp;

import java.util.ArrayList;

public class ContactData {

    private static ArrayList<ContactArray> mConData;

    private ContactData() {
    }

    static {
        mConData = new ArrayList<>();

        mConData.add(new ContactArray(R.drawable.phone_1, R.string.miaContactPhone,
                R.drawable.email_1, R.string.miaContactEmail,
                R.drawable.website_1, R.string.miaContactWeb,
                R.string.miaHours));
    }

    public static ArrayList<ContactArray> getData() {
        return mConData;
    }
}

