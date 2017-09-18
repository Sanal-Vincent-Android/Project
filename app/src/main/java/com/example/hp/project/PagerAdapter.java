package com.example.hp.project;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by hp on 23-08-2017.
 */

public class PagerAdapter extends FragmentStatePagerAdapter {
    int anInt;
    public PagerAdapter(FragmentManager fm, int numoftag) {
        super(fm);
        this.anInt=numoftag;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                ImageFragment tab1 = new ImageFragment();

                return tab1;
            case 1:
                VideoFragment tab2 = new VideoFragment();

                return tab2;

            default:
                return null;
        }
    }



    @Override
    public int getCount() {
        return anInt;
    }
}

