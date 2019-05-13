package com.example.android.tourguideapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ExhibitAdapter extends ArrayAdapter<ExhibitArray> {

    public ExhibitAdapter(Activity context, ArrayList<ExhibitArray> Exhibits) {

        super(context, 0, Exhibits);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.fragment_second, parent, false);
        }

        ExhibitArray currentExhibitArray = getItem(position);

        TextView exhibitOneTextView = listItemView.findViewById(R.id.exhibitText1);
        exhibitOneTextView.setText(currentExhibitArray.getExhibitOneText());

        TextView exhibitDateOneTextView = listItemView.findViewById(R.id.exhibitOneDate);
        exhibitDateOneTextView.setText(currentExhibitArray.getExhibitOneDate());

        ImageView imageOneImageView = listItemView.findViewById(R.id.exhibitImage1);
        imageOneImageView.setImageResource(currentExhibitArray.getExhibitOneImage());

        TextView exhibitTwoTextView = listItemView.findViewById(R.id.exhibitText2);
        exhibitTwoTextView.setText(currentExhibitArray.getExhibitTwoText());

        TextView exhibitDateTwoTextView = listItemView.findViewById(R.id.exhibitTwoDate);
        exhibitDateTwoTextView.setText(currentExhibitArray.getExhibitTwoDate());

        ImageView imageTwoImageView = listItemView.findViewById(R.id.exhibitImage2);
        imageTwoImageView.setImageResource(currentExhibitArray.getExhibitTwoImage());

        TextView exhibitThreeTextView = listItemView.findViewById(R.id.exhibitText3);
        exhibitThreeTextView.setText(currentExhibitArray.getExhibitThreeText());

        TextView exhibitDateThreeTextView = listItemView.findViewById(R.id.exhibitThreeDate);
        exhibitDateThreeTextView.setText(currentExhibitArray.getExhibitThreeDate());

        ImageView imageThreeImageView = listItemView.findViewById(R.id.exhibitImage3);
        imageThreeImageView.setImageResource(currentExhibitArray.getExhibitThreeImage());

        TextView exhibitFourTextView = listItemView.findViewById(R.id.exhibitText4);
        exhibitFourTextView.setText(currentExhibitArray.getExhibitFourText());

        TextView exhibitDateFourTextView = listItemView.findViewById(R.id.exhibitFourDate);
        exhibitDateFourTextView.setText(currentExhibitArray.getExhibitFourDate());

        ImageView imageFourImageView = listItemView.findViewById(R.id.exhibitImage4);
        imageFourImageView.setImageResource(currentExhibitArray.getExhibitFourImage());

        return listItemView;
    }
}