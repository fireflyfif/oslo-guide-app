package com.example.android.osloguide;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView mDrawerList;
    private ArrayAdapter<String> mAdapter;

    private ActionBarDrawerToggle mDrawerToggle;
    private DrawerLayout mDrawerLayout;
    private String mActivityTitle;

    private Context mMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mDrawerList = (ListView) findViewById(R.id.navList);
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        mActivityTitle = getTitle().toString();

        addDrawerItems();
        setupDrawer();

        // Show hamburger icon on the Action Bar
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);

        // Find the view pager that will allow the user to swipe between fragments
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);

        // Create an adapter that knows which fragment should be shown on each page
        CategoryAdapter adapter = new CategoryAdapter(getSupportFragmentManager(), this);

        // Set the adapter onto the view pager
        viewPager.setAdapter(adapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.sliding_tabs);
        tabLayout.setupWithViewPager(viewPager);

        // Helper to start new intent
        mMain = this;
    }

    private void addDrawerItems() {
        String[] navArray = {getString(R.string.city_map), getString(R.string.facts),
                getString(R.string.favorites)};
        mAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, navArray);
        mDrawerList.setAdapter(mAdapter);

        View headerView = View.inflate(this, R.layout.header_nav_drawer, null);
        ((ImageView) headerView.findViewById(R.id.image_nav_drawer)).setImageResource(R.drawable.oslo);
        ((TextView) headerView.findViewById(R.id.title_nav_drawer))
                .setText(getString(R.string.city_title_drawer));
        mDrawerList.addHeaderView(headerView);

        mDrawerList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // Make an Intent to the Main Activity
                // Show a short Toast message for the main screen
                if (position == 0) {
                    Intent intent = new Intent(mMain, MainActivity.class);
                    startActivity(intent);
                    Toast.makeText(MainActivity.this, getString(R.string.toast_locations),
                            Toast.LENGTH_SHORT).show();
                }
                // Make an Intent to the City Map Activity
                // Show a short Toast message for the main screen
                if (position == 1) {
                    Intent intent = new Intent(mMain, MapActivity.class);
                    startActivity(intent);
                    Toast.makeText(MainActivity.this, getString(R.string.toast_cityMap),
                            Toast.LENGTH_SHORT).show();
                }
                // Make an Intent to the Facts Activity
                // Show a short Toast message for the main screen
                if (position == 2) {
                    Intent intent = new Intent(mMain, Facts.class);
                    startActivity(intent);
                    Toast.makeText(MainActivity.this, getString(R.string.toast_facts),
                            Toast.LENGTH_SHORT).show();
                }
                // Make an Intent to the Favorites Activity
                // Show a short Toast message for the main screen
                if (position == 3) {
                    Intent intent = new Intent(mMain, Favorites.class);
                    startActivity(intent);
                    Toast.makeText(MainActivity.this, getString(R.string.toast_favorites),
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void setupDrawer() {
        mDrawerToggle = new ActionBarDrawerToggle(this, mDrawerLayout, R.string.drawer_open,
                R.string.drawer_close) {

            /**
             * Called when a drawer has settled in a completely open state.
             */
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);
                getSupportActionBar().setTitle(getString(R.string.navigation));
                invalidateOptionsMenu(); // creates call to onPrepareOptionsMenu()
            }

            /**
             * Called when a drawer has settled in a completely closed state.
             */
            public void onDrawerClosed(View view) {
                super.onDrawerClosed(view);
                getSupportActionBar().setTitle(mActivityTitle);
                invalidateOptionsMenu(); // creates call to onPrepareOptionsMenu()
            }
        };

        mDrawerToggle.setDrawerIndicatorEnabled(true);
        mDrawerLayout.addDrawerListener(mDrawerToggle);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        // Activate the navigation drawer toggle
        if (mDrawerToggle.onOptionsItemSelected(item)) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        mDrawerToggle.syncState();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        mDrawerToggle.onConfigurationChanged(newConfig);
    }
}
