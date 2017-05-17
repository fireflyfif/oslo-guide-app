package com.example.android.osloguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.places_list, container, false);

        // Create a list of top locations
        final ArrayList<Location> top = new ArrayList<>();
        top.add(new Location(getString(R.string.loc_vikingShip_title),
                getString(R.string.loc_vikingShip_address), getString(R.string.loc_vikingShip_hours),
                getString(R.string.loc_vikingShip_price), R.drawable.oslo_01));
        top.add(new Location(getString(R.string.loc_opera_title), getString(R.string.loc_opera_address),
                getString(R.string.loc_opera_hours), getString(R.string.loc_opera_price),
                R.drawable.astrup));
        top.add(new Location(getString(R.string.loc_folkMuseum_title),
                getString(R.string.loc_folkMuseum_address), getString(R.string.loc_folkMuseum_hours),
                getString(R.string.loc_folkMuseum_price), R.drawable.oslo_01));
        top.add(new Location(getString(R.string.loc_munch_title),
                getString(R.string.loc_munch_address), getString(R.string.loc_munch_hours),
                getString(R.string.loc_munch_price), R.drawable.oslo_01));
        top.add(new Location(getString(R.string.loc_fram_title),
                getString(R.string.loc_fram_address), getString(R.string.loc_fram_hours),
                getString(R.string.loc_fram_price), R.drawable.oslo_01));
        top.add(new Location(getString(R.string.loc_holmenkollen_title),
                getString(R.string.loc_holmenkollen_address), getString(R.string.loc_holmenkollen_hours),
                getString(R.string.loc_holmenkollen_price), R.drawable.oslo_01));
        top.add(new Location(getString(R.string.loc_konTiki_title),
                getString(R.string.loc_konTiki_address), getString(R.string.loc_konTiki_hours),
                getString(R.string.loc_konTiki_price), R.drawable.oslo_01));
        top.add(new Location(getString(R.string.loc_astrup_title),
                getString(R.string.loc_astrup_address), getString(R.string.loc_astrup_hours),
                getString(R.string.loc_astrup_price), R.drawable.oslo_01));


        LocationAdapter adapter = new LocationAdapter(getActivity(), top);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);


        return rootView;
    }

}
