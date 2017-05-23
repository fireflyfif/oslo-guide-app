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
public class TopFragment extends Fragment {


    public TopFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.places_list, container, false);

        // Create a list of top locations
        final ArrayList<Location> location = new ArrayList<>();

        location.add(new Location(getString(R.string.loc_vikingShip_title),
                getString(R.string.loc_vikingShip_address), getString(R.string.loc_vikingShip_hours),
                getString(R.string.loc_vikingShip_price), getString(R.string.loc_vikingShip_summary), R.drawable.viking_ship_2));
        location.add(new Location(getString(R.string.loc_opera_title), getString(R.string.loc_opera_address),
                getString(R.string.loc_opera_hours), getString(R.string.loc_opera_price),
                getString(R.string.loc_opera_summary), R.drawable.opera_2));
        location.add(new Location(getString(R.string.loc_folkMuseum_title),
                getString(R.string.loc_folkMuseum_address), getString(R.string.loc_folkMuseum_hours),
                getString(R.string.loc_folkMuseum_price), getString(R.string.loc_folkMuseum_summary), R.drawable.folk_museum_4));
        location.add(new Location(getString(R.string.loc_munch_title),
                getString(R.string.loc_munch_address), getString(R.string.loc_munch_hours),
                getString(R.string.loc_munch_price), getString(R.string.loc_munch_summary), R.drawable.munch));
        location.add(new Location(getString(R.string.loc_fram_title),
                getString(R.string.loc_fram_address), getString(R.string.loc_fram_hours),
                getString(R.string.loc_fram_price), getString(R.string.loc_fram_summary), R.drawable.oslo_01));
        location.add(new Location(getString(R.string.loc_holmenkollen_title),
                getString(R.string.loc_holmenkollen_address), getString(R.string.loc_holmenkollen_hours),
                getString(R.string.loc_holmenkollen_price), getString(R.string.loc_holmenkollen_summary),
                R.drawable.holmenkollen_ski_jump_2));
        location.add(new Location(getString(R.string.loc_konTiki_title),
                getString(R.string.loc_konTiki_address), getString(R.string.loc_konTiki_hours),
                getString(R.string.loc_konTiki_price), getString(R.string.loc_konTiki_summary), R.drawable.oslo_01));
        location.add(new Location(getString(R.string.loc_astrup_title),
                getString(R.string.loc_astrup_address), getString(R.string.loc_astrup_hours),
                getString(R.string.loc_astrup_price), getString(R.string.loc_astrup_summary), R.drawable.astrup_fearnely_1));


        LocationAdapter adapter = new LocationAdapter(getActivity(), location);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent(getActivity(), LocationDetailActivity.class);
                startActivity(intent);

            }
        });


        return rootView;
    }


}
