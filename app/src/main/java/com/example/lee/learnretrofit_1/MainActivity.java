package com.example.lee.learnretrofit_1;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
//
//  這三個@Bind是對應layout/activity_main.xml內的三個元件
    @Bind(R.id.toolBar)
    Toolbar toolbar;

    @Bind(android.R.id.tabs)
    TabLayout tabLayout;

    @Bind(R.id.viewPager)
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        setSupportActionBar(toolbar);

        viewPager.setAdapter(new FragmentPagerAdapter() {

            @Override
            public int getCount() {
                return 6;
            }


            @Override
            public Fragment getItem(int position) {
                switch (position) {
                    case 0:
                        return new ElementaryFragment();
                    case 1:
                        return new MapFragment();
                    case 2:
                        return new ZipFragment();
                    case 3:
                        return new TokenFragment();
                    case 4:
                        return new TokenAdvancedFragment();
                    case 5:
                        return new CacheFragment();
                    default:
                        return new ElementFragment();
                }
            }

            @Override
            public CharSequence getPageTitle(int position) {
                switch (position) {
                    case 0:
                        return getString();
                    case 1:
                        return getString();
                    case 2:
                        return getString();
                    case 3:
                        return getString();
                    case 4:
                        return getString();
                    case 5:
                        return getString();
                    default:
                        return getString();
                }
            }
        });
        tabLayout.setupWithViewPager(viewPager);
    }
}
