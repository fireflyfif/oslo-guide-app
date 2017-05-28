package com.example.android.osloguide;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * {@link CategoryAdapter} is a {@link FragmentPagerAdapter} that can provide the layout for
 * each list item based on a data source which is a list of {@link Location} objects.
 */

public class CategoryAdapter extends FragmentPagerAdapter {

    private String categoryTitles[] = new String[]{"Top", "Culture", "Parks", "Views"};

    /**
     * Create a new {@link CategoryAdapter} object.
     *
     * @param fm is the fragment manager that will keep each fragment's state in the adapter
     *           across swipes.
     */
    public CategoryAdapter(FragmentManager fm) {
        super(fm);
    }

    /**
     * Return the {@link Fragment} that should be displayed for the given page number.
     */
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new TopFragment();
        } else if (position == 1) {
            return new CultureFragment();
        } else if (position == 2) {
            return new ParksFragment();
        } else {
            return new ViewsFragment();
        }
    }

    /**
     * Return the total number of pages.
     */
    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return categoryTitles[position];
    }
}
