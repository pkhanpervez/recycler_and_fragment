package com.muphred.org.seller;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class ListingTabsAdapterFragment extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public ListingTabsAdapterFragment(FragmentManager fm, int NoofTabs){
        super(fm);
        this.mNumOfTabs = NoofTabs;
    }
    @Override
    public int getCount() {
        return mNumOfTabs;
    }
    @Override
    public Fragment getItem(int position){
        switch (position){
            case 0:
                QCFragment qcFragment = new QCFragment();
                return qcFragment;
            case 1:
                InstockFragment instockFragment=new InstockFragment();
                return instockFragment;
            case 2:
                OutofstockFragment outofstockFragment=new OutofstockFragment();
                return outofstockFragment;
            case 3:
                InactiveFragment inactiveFragment = new InactiveFragment();
                return inactiveFragment;
            default:
                return null;
        }
    }
}