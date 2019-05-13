package com.example.android.tourguideapp;

public class ContactArray {

    private int mContactOneText;
    private int mContactOneImage;

    private int mContactTwoText;
    private int mContactTwoImage;

    private int mContactThreeText;
    private int mContactThreeImage;

    private int mContactFourText;

    public ContactArray(int ContactOneImage, int ContactOneText,
                        int ContactTwoImage, int ContactTwoText,
                        int ContactThreeImage, int ContactThreeText,
                        int ContactFourText) {
        mContactOneText = ContactOneText;
        mContactOneImage = ContactOneImage;

        mContactTwoText = ContactTwoText;
        mContactTwoImage = ContactTwoImage;

        mContactThreeText = ContactThreeText;
        mContactThreeImage = ContactThreeImage;

        mContactFourText = ContactFourText;
    }

    public int getContactOneText() {
        return mContactOneText;
    }

    public int getContactOneImage() {
        return mContactOneImage;
    }

    public int getContactTwoText() {
        return mContactTwoText;
    }

    public int getContactTwoImage() {
        return mContactTwoImage;
    }

    public int getContactThreeText() {
        return mContactThreeText;
    }

    public int getContactThreeImage() {
        return mContactThreeImage;
    }

    public int getContactFourText() {
        return mContactFourText;
    }
}

