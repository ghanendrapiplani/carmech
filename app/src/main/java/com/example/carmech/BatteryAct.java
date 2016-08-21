package com.example.carmech;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;


public class BatteryAct extends FragmentActivity {
    FragmentPagerAdapter adapterViewPager;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.battery);
        ViewPager vpPager = (ViewPager) findViewById(R.id.vpPager1);
        adapterViewPager = new MyPagerAdapterBattery(getSupportFragmentManager());
        vpPager.setAdapter(adapterViewPager);
    }
}
