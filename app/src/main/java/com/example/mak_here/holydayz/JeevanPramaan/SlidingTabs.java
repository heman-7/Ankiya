package com.example.mak_here.holydayz.JeevanPramaan;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.example.mak_here.holydayz.R;
import com.example.mak_here.holydayz.Tab2;
import com.example.mak_here.holydayz.Tab3;
import com.example.mak_here.holydayz.ViewPagerAdapter;

public class SlidingTabs extends AppCompatActivity{
    // variables for different stuff
    Toolbar toolbar;
    TabLayout tabLayout;
    ViewPager viewPager;
    ViewPagerAdapter viewPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sliding_tabs);

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
        viewPagerAdapter.addFragments(new Tab1(), "Description");
        viewPagerAdapter.addFragments(new Tab2(), "User Steps");
        viewPagerAdapter.addFragments(new Tab3(), "What's New");
        //viewPagerAdapter.addFragments(new Tab4(),"Recent Feed");
        viewPager.setAdapter(viewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);

    }

};

