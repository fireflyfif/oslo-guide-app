package com.example.android.osloguide;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by iva on 5/17/17.
 */

public class LocationDetailActivity extends AppCompatActivity {

    public static final String EXTRA_IMAGE = "extra_image";
    public static final String EXTRA_TITLE = "extra_title";

    private TextView mTitleLocation;
    private ImageView mImageLocation;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location_detail);

//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        mTitleLocation = (TextView) findViewById(R.id.location_title);
        mImageLocation = (ImageView) findViewById(R.id.location_image);

//        if (getIntent() != null && getIntent().getExtras() != null) {
//            if (getIntent().getExtras().containsKey(EXTRA_IMAGE)) {
//                // No idea what is Picasso ??
////                Picasso.with(this).load(getIntent().getExtras().getString(EXTRA_IMAGE)).into(mImageLocation);
//            }
//            if (getIntent().getExtras().containsKey(EXTRA_TITLE)) {
//                mTitleLocation.setText(getIntent().getExtras().getString(EXTRA_TITLE));
//            }
//        }

    }
}
