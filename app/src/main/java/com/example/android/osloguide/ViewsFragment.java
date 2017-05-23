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
public class ViewsFragment extends Fragment {


    public ViewsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.places_list, container, false);

        // Create a list of top locations
        final ArrayList<Location> location = new ArrayList<>();

        location.add(new Location(getString(R.string.loc_grefsenkollen_title),
                getString(R.string.loc_grefsenkollen_address), getString(R.string.loc_grefsenkollen_hours),
                getString(R.string.loc_grefsenkollen_price), getString(R.string.loc_grefsenkollen_summary),
                R.drawable.grefsenkollen));
        location.add(new Location(getString(R.string.loc_holmenArena_title),
                getString(R.string.loc_holmenkollen_address), getString(R.string.loc_holmenArena_hours),
                getString(R.string.loc_holmenArena_price), getString(R.string.loc_holmenArena_summary),
                R.drawable.holemnkollen_view));
        location.add(new Location(getString(R.string.loc_opera_title),
                getString(R.string.loc_opera_address), getString(R.string.loc_opera_hours),
                getString(R.string.loc_opera_price), getString(R.string.loc_opera_summary),
                R.drawable.opera_2));
        location.add(new Location(getString(R.string.loc_akershus_title),
                getString(R.string.loc_akershus_address), getString(R.string.loc_akershus_hours),
                getString(R.string.loc_akershus_price), getString(R.string.loc_akershus_summary),
                R.drawable.akershus));
        location.add(new Location(getString(R.string.loc_sneakPeak_title),
                getString(R.string.loc_sneakPeak_address), getString(R.string.loc_sneakPeak_hours),
                getString(R.string.loc_sneakPeak_price), getString(R.string.loc_sneakPeak_summary),
                R.drawable.sneak_peak_2));
        location.add(new Location(getString(R.string.loc_vettakollen_title),
                getString(R.string.loc_vettakollen_address), getString(R.string.loc_vettakollen_hours),
                getString(R.string.loc_vettakollen_price), getString(R.string.loc_vettakollen_summary),
                R.drawable.holmenkollen_ski_jump_2));


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
