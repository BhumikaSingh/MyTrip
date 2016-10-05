
package com.example.sbhumika274.mytrip;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Provides the appropriate {@link Fragment} for a view pager.
 */
public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {

    public SimpleFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return super.getPageTitle(position);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new StreetsFragment();
        } else if (position == 1){
            return new MonumentFragment();
        } else if (position == 2) {
            return new RestaurantsFragment();
        } else {
            return new TemplesFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }
}