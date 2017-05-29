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
 */
public class CultureFragment extends Fragment {


    public CultureFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.places_list, container, false);

        // Create a list of culture locations
        final ArrayList<Location> location = new ArrayList<>();
        location.add(new Location(getString(R.string.loc_royalPalace_title),
                getString(R.string.loc_royalPalace_address), getString(R.string.loc_royalPalace_hours),
                getString(R.string.loc_royalPalace_price), getString(R.string.loc_royalPalace_summary),
                R.drawable.royal_palace));
        location.add(new Location(getString(R.string.loc_storting_title),
                getString(R.string.loc_storting_address), getString(R.string.loc_storting_hours),
                getString(R.string.loc_storting_price), getString(R.string.loc_storting_summary),
                R.drawable.storting));
        location.add(new Location(getString(R.string.loc_vikingShip_title),
                getString(R.string.loc_vikingShip_address), getString(R.string.loc_vikingShip_hours),
                getString(R.string.loc_vikingShip_price), getString(R.string.loc_vikingShip_summary),
                R.drawable.viking_ship));
        location.add(new Location(getString(R.string.loc_opera_title), getString(R.string.loc_opera_address),
                getString(R.string.loc_opera_hours), getString(R.string.loc_opera_price),
                getString(R.string.loc_opera_summary), R.drawable.opera));
        location.add(new Location(getString(R.string.loc_folkMuseum_title),
                getString(R.string.loc_folkMuseum_address), getString(R.string.loc_folkMuseum_hours),
                getString(R.string.loc_folkMuseum_price), getString(R.string.loc_folkMuseum_summary),
                R.drawable.folk_museum));
        location.add(new Location(getString(R.string.loc_munch_title),
                getString(R.string.loc_munch_address), getString(R.string.loc_munch_hours),
                getString(R.string.loc_munch_price), getString(R.string.loc_munch_summary), R.drawable.munch));
        location.add(new Location(getString(R.string.loc_natGallery_title),
                getString(R.string.loc_natGallery_address), getString(R.string.loc_natGallery_hours),
                getString(R.string.loc_natGallery_price), getString(R.string.loc_natGallery_summary),
                R.drawable.national_gallery));
        location.add(new Location(getString(R.string.loc_nobel_title),
                getString(R.string.loc_nobel_address), getString(R.string.loc_nobel_hours),
                getString(R.string.loc_nobel_price), getString(R.string.loc_nobel_summary),
                R.drawable.nobel_museum_2));
        location.add(new Location(getString(R.string.loc_holmenkollen_title),
                getString(R.string.loc_holmenkollen_address), getString(R.string.loc_holmenkollen_hours),
                getString(R.string.loc_holmenkollen_price), getString(R.string.loc_holmenkollen_summary),
                R.drawable.holmenkollen_ski_jump_1));
        location.add(new Location(getString(R.string.loc_fram_title),
                getString(R.string.loc_fram_address), getString(R.string.loc_fram_hours),
                getString(R.string.loc_fram_price), getString(R.string.loc_fram_summary), R.drawable.default_photo));
        location.add(new Location(getString(R.string.loc_konTiki_title),
                getString(R.string.loc_konTiki_address), getString(R.string.loc_konTiki_hours),
                getString(R.string.loc_konTiki_price), getString(R.string.loc_konTiki_summary), R.drawable.default_photo));
        location.add(new Location(getString(R.string.loc_astrup_title),
                getString(R.string.loc_astrup_address), getString(R.string.loc_astrup_hours),
                getString(R.string.loc_astrup_price), getString(R.string.loc_astrup_summary),
                R.drawable.astrup_fearnely));
        location.add(new Location(getString(R.string.loc_vigelandMuseum_title),
                getString(R.string.loc_vigelandMuseum_address), getString(R.string.loc_vigelandMuseum_hours),
                getString(R.string.loc_vigelandMuseum_price), getString(R.string.loc_vigelandMuseum_summary),
                R.drawable.vigeland_museum));
        location.add(new Location(getString(R.string.loc_historyMuseum_title),
                getString(R.string.loc_historyMuseum_address), getString(R.string.loc_historyMuseum_hours),
                getString(R.string.loc_historyMuseum_price), getString(R.string.loc_historyMuseum_summary),
                R.drawable.architecture));
        location.add(new Location(getString(R.string.loc_ibsen_title),
                getString(R.string.loc_ibsen_address), getString(R.string.loc_ibsen_hours),
                getString(R.string.loc_ibsen_price), getString(R.string.loc_ibsen_summary),
                R.drawable.ibsen));
        location.add(new Location(getString(R.string.loc_contemporaryArt_title),
                getString(R.string.loc_contemporaryArt_address), getString(R.string.loc_contemporaryArt_hours),
                getString(R.string.loc_contemporaryArt_price), getString(R.string.loc_contemporaryArt_summary),
                R.drawable.contemporary_museum));
        location.add(new Location(getString(R.string.loc_henieKunst_title),
                getString(R.string.loc_henieKunst_address), getString(R.string.loc_henieKunst_hours),
                getString(R.string.loc_henieKunst_price), getString(R.string.loc_henieKunst_summary),
                R.drawable.henie_onstad_1));

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
