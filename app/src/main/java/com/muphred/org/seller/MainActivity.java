package com.muphred.org.seller;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_listing);
//        Button button;
//        button =(Button) findViewById(R.id.button);


//        button.setOnClickListener(new View.OnClickListener() {

//            public void onClick(View v) {
              //  Intent intent = new Intent(MainActivity.class,TestRecyclerMain.class);
               // startActivity(intent);
//            }
//        });




        setContentView(R.layout.activity_main_listing);
        Toolbar toolbar = (Toolbar)findViewById(R.id.tool_bar);
        setSupportActionBar(toolbar);
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        tabLayout.addTab(tabLayout.newTab().setText("  QC  ")); //Home - upcoming // QC
        tabLayout.addTab(tabLayout.newTab().setText(" Instock ")); //about - pending  // INSTOCK
        tabLayout.addTab(tabLayout.newTab().setText("Out of Stock")); //ship - contact      // OUT OF STOCK
        tabLayout.addTab(tabLayout.newTab().setText(" Inactive ")); //  completed             //INACTIVE

        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
        tabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);

        final ViewPager viewPager =(ViewPager)findViewById(R.id.view_pager);
        ListingTabsAdapterFragment tabsAdapter = new ListingTabsAdapterFragment(getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(tabsAdapter);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }
            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }
            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }
}