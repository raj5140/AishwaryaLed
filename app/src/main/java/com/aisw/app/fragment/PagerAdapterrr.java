package com.aisw.app.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class PagerAdapterrr extends FragmentStatePagerAdapter {
    int mNumOfTabs;

    public PagerAdapterrr(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                Welcome_Slide1 tab1 = new Welcome_Slide1();
                return tab1;
            case 1:
                Welcome_Slide2 tab2 = new Welcome_Slide2();
                return tab2;
            case 2:
                Welcome_Slide3 tab3 = new Welcome_Slide3();

                return tab3;
            case 3:
                Welcome_Slide4 tab4 = new Welcome_Slide4();
                return tab4;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}