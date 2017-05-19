package com.example.android.osloguide;

import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;

import com.ms.square.android.expandabletextview.ExpandableTextView;

public class Facts extends AppCompatActivity {

    private CollapsingToolbarLayout collapsingToolbarLayout;

    ExpandableTextView expandableTextView;
//    ExpandableTextView expandableTextView2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facts);

        expandableTextView = (ExpandableTextView) findViewById(R.id.expandable_view);
        expandableTextView.setText(getString(R.string.facts_shopping_about));

//        expandableTextView2 = (ExpandableTextView) findViewById(R.id.expandable_view2);
//        expandableTextView2.setText(getString(R.string.facts_osloPass_about));

    }
}
