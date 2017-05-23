package com.example.android.osloguide;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by iva on 5/15/17.
 */

public class CategoryAdapter extends FragmentPagerAdapter {

    private String categoryTitles[] = new String[] { "Top", "Culture", "Parks", "Views" };

    public CategoryAdapter (FragmentManager fm) {
        super(fm);
    }

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

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return categoryTitles[position];
    }
}
