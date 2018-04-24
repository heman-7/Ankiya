package com.example.mak_here.holydayz.DigiLocker;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.example.mak_here.holydayz.R;
import com.example.mak_here.holydayz.ViewPagerAdapter;

public class DL_SlidingTabs extends AppCompatActivity {
    Toolbar toolbar;
    TabLayout tabLayout;
    ViewPager viewPager;
    ViewPagerAdapter viewPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dl__sliding_tabs);
        // adding toolbar to main activity
        toolbar=(Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        // initializing tab layout
        tabLayout=(TabLayout) findViewById(R.id.tab_layout);
        //Initialising View Pager
        viewPager=(ViewPager) findViewById(R.id.viewpager);
        //Initialising View Pager Adapter
        viewPagerAdapter= new ViewPagerAdapter(getSupportFragmentManager());
        //Adding Fragemnts aka Tab for the adapter
        viewPagerAdapter.addFragments(new com.example.mak_here.holydayz.DigiLocker.DL_Tab1(),"Description");
        viewPagerAdapter.addFragments(new com.example.mak_here.holydayz.DigiLocker.DL_Tab2(),"User Steps");
        viewPagerAdapter.addFragments(new com.example.mak_here.holydayz.DigiLocker.DL_Tab3(), "What's New");
        viewPager.setAdapter(viewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}
