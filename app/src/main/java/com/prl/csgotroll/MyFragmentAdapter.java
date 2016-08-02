package com.prl.csgotroll;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Pearl on 3/4/2016.
 */
public class MyFragmentAdapter extends FragmentPagerAdapter {

    public MyFragmentAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        switch (i) {
            case 0:
                // The first section of the app is the most interesting -- it offers
                // a launchpad into the other demonstrations in this example application.
                return new FirstFragment();
//            case 1:
//                return new SecondFragment();

            default:
                Fragment fragment = new SecondFragment();
                Bundle args = new Bundle();
                args.putInt(SecondFragment.ARG_SECTION_NUMBER, i + 1);
                fragment.setArguments(args);
                return fragment;

        }
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0){
            return "RUSKI KID";
        }
        else{
            return "RUSKI ADULT";
        }
    }
}
