package org.bsc.com.bsc;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by sanjit on 08/10/18.
 */

public class MyPagerAdapter extends FragmentStatePagerAdapter {

    private String[] tabTitles = new String[]{"PPT", "Demo"};

    public MyPagerAdapter(FragmentManager fm){
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0: return new PPTFragment();
            case 1: return new ViedoFragment();
        }
        return null;
    }


    @Override
    public int getCount() {
        return 2;
    }
    // This determines the title for each tab
    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        switch (position) {
            case 0:
                return tabTitles[0];
            case 1:
                return tabTitles[1];
            default:
                return null;
        }
    }

}
