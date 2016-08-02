package com.prl.csgotroll;

import android.os.Build;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;



public class MainActivity extends ActionBarActivity implements ActionBar.TabListener{

    MyFragmentAdapter myAdapter;
    ViewPager mViewPager;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.prl.csgotroll.R.layout.activity_main);

        myAdapter = new MyFragmentAdapter(getSupportFragmentManager());



        // Set up the action bar.
        final ActionBar actionBar = getSupportActionBar();
      //show ads

        // Specify that the Home/Up button should not be enabled, since there is no hierarchical
        // parent.



        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            actionBar.setBackgroundDrawable(getDrawable(com.prl.csgotroll.R.color.navBarColor));
        }

        // Specify that we will be displaying tabs in the action bar.
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);


        mViewPager = (ViewPager)findViewById(com.prl.csgotroll.R.id.pager);
        mViewPager.setAdapter(myAdapter);
        mViewPager.setOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener() {
            @Override
            public void onPageSelected(int position) {
                // When swiping between different app sections, select the corresponding tab.
                // We can also use ActionBar.Tab#select() to do this if we have a reference to the
                // Tab.
                actionBar.setSelectedNavigationItem(position);
            }
        });


        // For each of the sections in the app, add a tab to the action bar.
        for (int i = 0; i < myAdapter.getCount(); i++) {
            // Create a tab with text corresponding to the page title defined by the adapter.
            // Also specify this Activity object, which implements the TabListener interface, as the
            // listener for when this tab is selected.
            actionBar.addTab(
                    actionBar.newTab()
                            .setText(myAdapter.getPageTitle(i))
                            .setTabListener(this));
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                actionBar.setStackedBackgroundDrawable(getDrawable(com.prl.csgotroll.R.color.tabColor));
            }

        }

        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayUseLogoEnabled(true);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            actionBar.setIcon(getDrawable(com.prl.csgotroll.R.drawable.myicon));
        }


//        final ActionBar actionBar = getActionBar();



//        // Specify that tabs should be displayed in the action bar.
//        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
//
//        // Create a tab listener that is called when the user changes tabs.
//        ActionBar.TabListener tabListener = new ActionBar.TabListener() {
//            public void onTabSelected(ActionBar.Tab tab, FragmentTransaction ft) {
//                // show the given tab
//            }
//
//            public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction ft) {
//                // hide the given tab
//            }
//
//            public void onTabReselected(ActionBar.Tab tab, FragmentTransaction ft) {
//                // probably ignore this event
//            }
//        };
//
//        // Add 3 tabs, specifying the tab's text and TabListener
//        for (int i = 0; i < 2; i++) {
//            actionBar.addTab(
//                    actionBar.newTab()
//                            .setText("Tab " + (i + 1))
//                            .setTabListener(tabListener));
//        }

    }





    @Override
    public void onTabSelected(ActionBar.Tab tab, android.support.v4.app.FragmentTransaction ft) {
        mViewPager.setCurrentItem(tab.getPosition());
    }

    @Override
    public void onTabUnselected(ActionBar.Tab tab, android.support.v4.app.FragmentTransaction ft) {

    }

    @Override
    public void onTabReselected(ActionBar.Tab tab, android.support.v4.app.FragmentTransaction ft) {

    }
}


