package com.example.android.osloguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 * <p>
 * create an instance of this fragment.
 */
public class ParksFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.places_list, container, false);

        // Create a list of park locations
        final ArrayList<Location> location = new ArrayList<>();

        location.add(new Location(getString(R.string.loc_frogner_title),
                getString(R.string.loc_frogner_address), getString(R.string.loc_frogner_hours),
                getString(R.string.loc_frogner_price), getString(R.string.loc_frogner_summary),
                R.drawable.frogner_park_1));
        location.add(new Location(getString(R.string.loc_akershus_title), getString(R.string.loc_akershus_address),
                getString(R.string.loc_akershus_hours), getString(R.string.loc_akershus_price),
                getString(R.string.loc_akershus_summary), R.drawable.akershus));
        location.add(new Location(getString(R.string.loc_botanicalGarden_title),
                getString(R.string.loc_botanicalGarden_address), getString(R.string.loc_botanicalGarden_hours),
                getString(R.string.loc_botanicalGarden_price), getString(R.string.loc_botanicalGarden_summary),
                R.drawable.botanical_garden_2));
        location.add(new Location(getString(R.string.loc_tusenFryd_title),
                getString(R.string.loc_tusenFryd_address), getString(R.string.loc_tusenFryd_hours),
                getString(R.string.loc_tusenFryd_price), getString(R.string.loc_tusenFryd_summary),
                R.drawable.default_photo));
        location.add(new Location(getString(R.string.loc_ekeberg_title),
                getString(R.string.loc_ekeberg_address), getString(R.string.loc_ekeberg_hours),
                getString(R.string.loc_ekeberg_price), getString(R.string.loc_ekeberg_summary),
                R.drawable.default_photo));
        location.add(new Location(getString(R.string.loc_tjuvholmen_title),
                getString(R.string.loc_tjuvholmen_address), getString(R.string.loc_tjuvholmen_hours),
                getString(R.string.loc_tjuvholmen_price), getString(R.string.loc_tjuvholmen_summary),
                R.drawable.tjuvholmen_sculpture_park));
        location.add(new Location(getString(R.string.loc_winterPark_title),
                getString(R.string.loc_winterPark_address), getString(R.string.loc_winterPark_hours),
                getString(R.string.loc_winterPark_price), getString(R.string.loc_winterPark_summary),
                R.drawable.winter));
        location.add(new Location(getString(R.string.loc_summerPark_title),
                getString(R.string.loc_summerPark_address), getString(R.string.loc_summerPark_hours),
                getString(R.string.loc_summerPark_price), getString(R.string.loc_summerPark_summary),
                R.drawable.default_photo));
        location.add(new Location(getString(R.string.loc_hovedoya_title),
                getString(R.string.loc_hovedoya_address), getString(R.string.loc_hovedoya_hours),
                getString(R.string.loc_hovedoya_price), getString(R.string.loc_hovedoya_summary),
                R.drawable.hovedoya));
        location.add(new Location(getString(R.string.loc_reptilePark_title),
                getString(R.string.loc_reptilePark_address), getString(R.string.loc_reptilePark_hours),
                getString(R.string.loc_reptilePark_price), getString(R.string.loc_reptilePark_summary),
                R.drawable.default_photo));

        // This list item layout contains a layout of location information, that includes
        // title, address, opening hours, summary and photo of the location which the adapter will
        // set to display.
        LocationAdapter adapter = new LocationAdapter(getActivity(), location);
        // Find the {@Link ListView} object in the view hierarchy of the {@Link Activity}.
        // A {@Link ListView} with the view ID called list is declared in the places_list.xml.
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        // Make the {@link ListView} use the {@link ArrayAdapter} created above, so that the
        // {@link ListView} will display list items for each location in the list of places.
        // Call the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
        listView.setAdapter(adapter);

        // Set a click listener to play the audio when the list item is clicked on.
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // Send intent to new {@Link LocationDetailActivity} with details for the current selected
                // location. Currently not working.
                // TODO: make the detail activity work dynamically for each selected location.
                Intent intent = new Intent(getActivity(), LocationDetailActivity.class);
                startActivity(intent);
            }
        });

        return rootView;
    }
}
