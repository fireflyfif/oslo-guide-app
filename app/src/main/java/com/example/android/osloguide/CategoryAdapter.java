package com.example.android.osloguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * {@link CategoryAdapter} is a {@link FragmentPagerAdapter} that can provide the layout for
 * each list item based on a data source which is a list of {@link Location} objects.
 */

public class CategoryAdapter extends FragmentPagerAdapter {

    final int PAGE_COUNT = 4;
    Context context;

    /**
     * Create a new {@link CategoryAdapter} object.
     *
     * @param fm is the fragment manager that will keep each fragment's state in the adapter
     *           across swipes.
     */
    public CategoryAdapter(FragmentManager fm, Context nContext) {
        super(fm);
        context = nContext;
    }

    /**
     * Return the {@link Fragment} that should be displayed for the given page number.
     */
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new TopFragment();
            case 1:
                return new CultureFragment();
            case 2:
                return new ParksFragment();
            case 3:
                return new ViewsFragment();
            default:
                return null;
        }
    }

    /**
     * Return the total number of pages.
     */
    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    /**
     * Return the titles of the pages.
     */
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return context.getString(R.string.category_top);
            case 1:
                return context.getString(R.string.category_culture);
            case 2:
                return context.getString(R.string.category_parks);
            case 3:
                return context.getString(R.string.category_views);
            default:
                return null;
        }
    }
}
