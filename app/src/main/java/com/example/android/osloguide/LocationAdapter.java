package com.example.android.osloguide;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by iva on 5/16/17.
 */

public class LocationAdapter extends ArrayAdapter<Location> {

    public LocationAdapter(Activity context, ArrayList<Location> locations) {
        super(context, 0, locations);

    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        // Get the {@Link Location} object located at this position in the list
        Location currentLocation = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView titleTextView = (TextView) listItemView.findViewById(R.id.title_text_view);
        // Get the version name from the current Place object and
        // set this text on the name TextView
        titleTextView.setText(currentLocation.getTitle());

        TextView addressTextView = (TextView) listItemView.findViewById(R.id.address_text_view);
        addressTextView.setText(currentLocation.getAddress());

        TextView openingHoursTextView = (TextView) listItemView.findViewById(R.id.open_hours_text_view);
        openingHoursTextView.setText(currentLocation.getOpeningHours());

        TextView priceTextView = (TextView) listItemView.findViewById(R.id.price_text_view);
        priceTextView.setText(currentLocation.getPrice());

        TextView summaryTextView = (TextView) listItemView.findViewById(R.id.summary);
        summaryTextView.setText(currentLocation.getSummary());

        ImageView photoOfThePlace = (ImageView) listItemView.findViewById(R.id.image_of_place);
        photoOfThePlace.setImageResource(currentLocation.getPhotoResourceId());




        return listItemView;
    }

}
