package com.example.android.tourguideapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ContactAdapter extends ArrayAdapter<ContactArray> {

    public ContactAdapter(Activity context, ArrayList<ContactArray> Contacts) {

        super(context, 0, Contacts);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.fragment_third, parent, false);
        }

        ContactArray currentContactArray = getItem(position);

        ImageView imageOneImageView = listItemView.findViewById(R.id.contact_image_one);
        imageOneImageView.setImageResource(currentContactArray.getContactOneImage());

        TextView contactOneTextView = listItemView.findViewById(R.id.contact_text_one);
        contactOneTextView.setText(currentContactArray.getContactOneText());

        ImageView imageTwoImageView = listItemView.findViewById(R.id.contact_image_two);
        imageTwoImageView.setImageResource(currentContactArray.getContactTwoImage());

        TextView contactTwoTextView = listItemView.findViewById(R.id.contact_text_two);
        contactTwoTextView.setText(currentContactArray.getContactTwoText());

        ImageView imageThreeImageView = listItemView.findViewById(R.id.contact_image_three);
        imageThreeImageView.setImageResource(currentContactArray.getContactThreeImage());

        TextView contactThreeTextView = listItemView.findViewById(R.id.contact_text_three);
        contactThreeTextView.setText(currentContactArray.getContactThreeText());

        TextView contactHoursTextView = listItemView.findViewById(R.id.contact_text_four);
        contactHoursTextView.setText(currentContactArray.getContactFourText());

        return listItemView;
    }
}