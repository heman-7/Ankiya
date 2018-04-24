package com.example.mak_here.holydayz;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * Created by Mak_Here on 7/7/2016.
 */
public class ViewPagerAdapter extends FragmentPagerAdapter {
    ArrayList<Fragment> fragments= new ArrayList<>();
    ArrayList<String> tabTitles = new ArrayList<>();

    //fn to initialise two array lists
    public void addFragments(Fragment fragments,String Titles)
    {
        this.fragments.add(fragments);
        this.tabTitles.add(Titles);
    }

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles.get(position);
    }
}
