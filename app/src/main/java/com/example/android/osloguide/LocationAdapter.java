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

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by iva on 5/16/17.
 */

public class LocationAdapter extends ArrayAdapter<Location> {

    // Check if the existing view is being reused, otherwise inflate the view
    public LocationAdapter(Activity context, ArrayList<Location> locations) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for several TextViews and an ImageView, the adapter
        // is not going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, locations);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder holder;

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
            holder = new ViewHolder(listItemView);
            listItemView.setTag(holder);
        } else {
            holder = (ViewHolder) listItemView.getTag();
        }

        // Get the {@Link Location} object located at this position in the list
        Location currentLocation = getItem(position);

        // Get the version name from the current Place object and
        // set this text on the name TextView
        holder.titleTextView.setText(currentLocation.getTitle());

        // Get the version name from the current Place object and
        // set this text on the name TextView
        holder.addressTextView.setText(currentLocation.getAddress());

        // Get the version name from the current Place object and
        // set this text on the name TextView
        holder.openingHoursTextView.setText(currentLocation.getOpeningHours());

        // Get the version name from the current Place object and
        // set this text on the name TextView
        holder.priceTextView.setText(currentLocation.getPrice());

        // Get the version name from the current Place object and
        // set this text on the name TextView
        holder.summaryTextView.setText(currentLocation.getSummary());

        if (currentLocation.hasPhoto()) {
            // Set the ImageView to the image resource specified in the current Location
            holder.photoOfThePlace.setImageResource(currentLocation.getPhotoResourceId());

            // Make sure the view is visible
            holder.photoOfThePlace.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to Invisible)
            holder.photoOfThePlace.setVisibility(View.INVISIBLE);
        }

        return listItemView;
    }

    static class ViewHolder {
        @BindView(R.id.title_text_view)
        TextView titleTextView;
        @BindView(R.id.address_text_view)
        TextView addressTextView;
        @BindView(R.id.open_hours_text_view)
        TextView openingHoursTextView;
        @BindView(R.id.price_text_view)
        TextView priceTextView;
        @BindView(R.id.summary)
        TextView summaryTextView;
        @BindView(R.id.image_of_place)
        ImageView photoOfThePlace;

        public ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }
}
