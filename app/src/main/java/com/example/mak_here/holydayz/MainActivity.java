package com.example.mak_here.holydayz;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    private RecyclerView recyclerView;
    private AlbumsAdapter adapter;
    private List<Album> albumList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        initCollapsingToolbar();

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        albumList = new ArrayList<>();
        adapter = new AlbumsAdapter(this, albumList);

        //RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(this, 2);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(mLayoutManager);
        //recyclerView.addItemDecoration(new GridSpacingItemDecoration(2, dpToPx(10), true));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);
        /*RecyclerView.ItemAnimator itemAnimator = new DefaultItemAnimator();
        itemAnimator.setAddDuration(1000);
        itemAnimator.setRemoveDuration(1000);
        recyclerView.setItemAnimator(itemAnimator);*/


        prepareAlbums();

        try {
            Glide.with(this).load(R.drawable.cover).into((ImageView) findViewById(R.id.backdrop));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Initializing collapsing toolbar
     * Will show and hide the toolbar title on scroll
     */
    private void initCollapsingToolbar() {
        final CollapsingToolbarLayout collapsingToolbar =
                (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar);
        collapsingToolbar.setTitle(" ");
        AppBarLayout appBarLayout = (AppBarLayout) findViewById(R.id.appbar);
        appBarLayout.setExpanded(true);

        // hiding & showing the title when toolbar expanded & collapsed
        appBarLayout.addOnOffsetChangedListener(new AppBarLayout.OnOffsetChangedListener() {
            boolean isShow = false;
            int scrollRange = -1;

            @Override
            public void onOffsetChanged(AppBarLayout appBarLayout, int verticalOffset) {
                if (scrollRange == -1) {
                    scrollRange = appBarLayout.getTotalScrollRange();
                }
                if (scrollRange + verticalOffset == 0) {
                    collapsingToolbar.setTitle(getString(R.string.app_name));
                    isShow = true;
                } else if (isShow) {
                    collapsingToolbar.setTitle(" ");
                    isShow = false;
                }
            }
        });
    }

    /**
     * Adding few albums for testing
     */
    private void prepareAlbums() {
        int[] covers = new int[]{
                R.drawable.bas,
                R.drawable.digi,
                R.mipmap.esign,
                R.mipmap.ebasta,
                R.mipmap.eschol,
                R.drawable.mygov,
                R.drawable.jp,
                R.mipmap.ehospital,
                R.mipmap.egreet,
        };

        Album a = new Album("MyGov", "Citizen Engagement Platform", covers[5]);
        albumList.add(a);

        a = new Album("DigiLocker", "Online Document Storage Service", covers[1]);
        albumList.add(a);

        a = new Album("e-Sign", "Online Digital Signature Facility", covers[2]);
        albumList.add(a);

        a = new Album("e-Basta", "Digital Library For Students", covers[3]);
        albumList.add(a);

        a = new Album("e-Scholarship", "National Scholarship Portal", covers[4]);
        albumList.add(a);

        a = new Album("Biometric Attendance System","Employee Presence Record", covers[0]);
        albumList.add(a);

        a = new Album("Jeevan Pramaan", "Digital Life Certificate", covers[6]);
        albumList.add(a);

        a = new Album("e-Hospital", "Hospital Management System", covers[7]);
        albumList.add(a);

        a = new Album("e-Greetings", "Online Eco-Friendly Wishes", covers[8]);
        albumList.add(a);

        adapter.notifyDataSetChanged();
    }

    /**
     * RecyclerView item decoration - give equal margin around grid item
     */
    public class GridSpacingItemDecoration extends RecyclerView.ItemDecoration {

        private int spanCount;
        private int spacing;
        private boolean includeEdge;

        public GridSpacingItemDecoration(int spanCount, int spacing, boolean includeEdge) {
            this.spanCount = spanCount;
            this.spacing = spacing;
            this.includeEdge = includeEdge;
        }

        @Override
        public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
            int position = parent.getChildAdapterPosition(view); // item position
            int column = position % spanCount; // item column

            if (includeEdge) {
                outRect.left = spacing - column * spacing / spanCount; // spacing - column * ((1f / spanCount) * spacing)
                outRect.right = (column + 1) * spacing / spanCount; // (column + 1) * ((1f / spanCount) * spacing)

                if (position < spanCount) { // top edge
                    outRect.top = spacing;
                }
                outRect.bottom = spacing; // item bottom
            } else {
                outRect.left = column * spacing / spanCount; // column * ((1f / spanCount) * spacing)
                outRect.right = spacing - (column + 1) * spacing / spanCount; // spacing - (column + 1) * ((1f /    spanCount) * spacing)
                if (position >= spanCount) {
                    outRect.top = spacing; // item top
                }
            }
        }
    }

    /**
     * Converting dp to pixel
     */
    private int dpToPx(int dp) {
        Resources r = getResources();
        return Math.round(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, r.getDisplayMetrics()));
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_about) {
            Intent i =new Intent(getApplicationContext(),AboutUs.class);
            startActivity(i);
        }
        if (id == R.id.nav_dip) {
            Intent i =new Intent(getApplicationContext(),DigitalIndiaProgram.class);
            startActivity(i);
        }
        else if (id==R.id.nav_web){
            Intent i=new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("http://digitalindia.andcollege.du.ac.in/"));
            Intent chooser=i.createChooser(i,"Open Our Website Through");
            startActivity(chooser);}
         else if (id==R.id.nav_quiz){
            Intent i=new Intent(getApplicationContext(),Quiz.class);
            startActivity(i);
        }
        else if (id == R.id.nav_gmail) {
            //this section will send the mail regarding the queries of the user to the developer
                    String address[]={"digital-india-project-2015-16@googlegroups.com"};
                    Intent i2=new Intent(Intent.ACTION_SENDTO);
                    i2.setData(Uri.parse("mailto:"));
                    i2.putExtra(Intent.EXTRA_EMAIL, address);
                    i2.putExtra(Intent.EXTRA_SUBJECT, "Important Query");
                    i2.putExtra(Intent.EXTRA_TEXT, "Please solve my query which is");
                    if(i2.resolveActivity(getPackageManager())!=null)
                    {
                        startActivity(i2);
                    }
                }

        else if (id == R.id.nav_fb) {
            Intent i=new Intent(android.content.Intent.ACTION_VIEW);
            i.setData(Uri.parse("http://www.facebook.com/Digital-India-Challenges-Opportunities-1028897207170439/?_e_pi_=7%2CPAGE__ID10%2C6439569826"));
            Intent chooser= i.createChooser(i,"Open Facebook Page Through");
            startActivity(chooser);
        } else if (id == R.id.nav_twitter) {
            Intent i=new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("https://twitter.com/innovation_digi"));
            Intent chooser=i.createChooser(i,"Open Twitter Page Through");
            startActivity(chooser);
        }
        else if (id==R.id.nav_insta){
            Intent i=new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("https://www.instagram.com/digital_india_project/"));
            Intent chooser=i.createChooser(i,"Open Insta Page Through");
            startActivity(chooser);
        }
        else if (id==R.id.nav_blog){
            Intent i=new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("https://digitalindiaproject.wordpress.com//"));
            Intent chooser=i.createChooser(i,"Open Blog Page Through");
            startActivity(chooser);
        }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
    
}
