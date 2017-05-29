package com.example.android.osloguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.ms.square.android.expandabletextview.ExpandableTextView;

public class Facts extends AppCompatActivity {

    ExpandableTextView expandableTextView;
    ExpandableTextView expandableTextView2;
    ExpandableTextView expandableTextView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facts);

        // Find the Titles TextViews for the title from the text_expandable_item.xml.
        // The same title is used in three different views in the activity_facts.xml.
        // Set text for each view.
        ((TextView) findViewById(R.id.sample1).findViewById(R.id.fact_title)).
                setText(getString(R.string.facts_shopping_title));
        ((TextView) findViewById(R.id.sample2).findViewById(R.id.fact_title)).
                setText(getString(R.string.facts_osloPass_title));
        ((TextView) findViewById(R.id.sample3).findViewById(R.id.fact_title)).
                setText(getString(R.string.facts_emergency_title));

        // Find the expandable TextViews from the text_expandable_item.xml.
        // The same TextView is used in three different views in the activity_facts.xml
        expandableTextView = (ExpandableTextView) findViewById(R.id.sample1).
                findViewById(R.id.expandable_view);
        expandableTextView2 = (ExpandableTextView) findViewById(R.id.sample2).
                findViewById(R.id.expandable_view);
        expandableTextView3 = (ExpandableTextView) findViewById(R.id.sample3).
                findViewById(R.id.expandable_view);

        // Set text for each view.
        expandableTextView.setText(getString(R.string.facts_shopping_about));
        expandableTextView2.setText(getString(R.string.facts_osloPass_about));
        expandableTextView3.setText(getString(R.string.facts_emergency_about));
    }
}
