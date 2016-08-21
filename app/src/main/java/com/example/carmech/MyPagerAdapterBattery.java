package com.example.carmech;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class MyPagerAdapterBattery extends FragmentPagerAdapter {
    private static int NUM_ITEMS = 11;

    public MyPagerAdapterBattery(FragmentManager fragmentManager) {
        super(fragmentManager);
    }

    // Returns total number of pages
    @Override
    public int getCount() {
        return NUM_ITEMS;
    }

    // Returns the fragment to display for that page
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0: // Fragment # 0 - This will show FirstFragment
                return SecondFragment.newInstance(0, "1. Park your car away from traffic, and away from heat or the sun. Make sure the cigarette lighter has been removed.","shade");
            case 1: // Fragment # 0 - This will show SecondFragment different title
                return SecondFragment.newInstance(1, "2. Open the hood of your car and use the prop rod to keep the hood open of the car.","openhood");
            case 2: // Fragment # 1 - This will show SecondFragment
                return SecondFragment.newInstance(2, "3. To remove the battery, first you need to locate the battery which should be on either side of the frame of the engine bay. The battery is a rectangular box that has two cables attached to it.","deadbat");
            case 3: // Fragment # 0 - This will show SecondFragment
                return SecondFragment.newInstance(3, "4. After locating the battery, you need to look at the cables and locate the positive and negative cable. On the battery there will be a positive symbol where the positive cable will be attached. The positive cable is most likely to be red. There will also be a negative symbol opposite of the positive symbol, the cable attached to that side will most likely be black.","batdiag");
            case 4: // Fragment # 0 - This will show SecondFragment different title
                return SecondFragment.newInstance(4, "5. After finding the above, you must disconnect the negative cable clamp with a wrench which you will find in the boot of the car. You can mark the cables if they are unmarked to make sure that you do not get confused. ","batdiag");
            case 5: // Fragment # 1 - This will show SecondFragment
                return SecondFragment.newInstance(5, "6. Remember that it is most important to remove the negative cable first, not the positive cable.  After removing the negative cable, remove the positive cable.","batdiag");
            case 6: // Fragment # 0 - This will show SecondFragment different title
                return SecondFragment.newInstance(7, "8. Now, you need to unscrew any of the screws holding the battery and pick up the battery from the battery space to remove it.","removebat");
            case 7: // Fragment # 1 - This will show SecondFragment
                return SecondFragment.newInstance(8, "9. You must now clean the cable clamps of both the negative and positive cables (Use baking soda and a Wire tooth brush). After doing this Replace the new battery on the same spot.","newb");
            case 8: // Fragment # 0 - This will show SecondFragment
                return SecondFragment.newInstance(9, "10. After replacing the battery, screw it back as the old battery was on the same amount of space. And connect both the cables to their respective sides.","newbat");
            case 9: // Fragment # 0 - This will show SecondFragment different title
                return SecondFragment.newInstance(10, "11. Tighten the cable clamps with a wrench and make sure they are tightened. Apply battery lithium grease, to prevent corrosion.","grease");
            case 10: // Fragment # 0 - This will show SecondFragment different title
                return SecondFragment.newInstance(11, "12. After completing all the steps above, close the hood of your car. And start your car, check all the electricals. If everything works well, then you are good to go.","shade");
            default:
                return null;
        }
    }

    // Returns the page title for the top indicator
    @Override
    public CharSequence getPageTitle(int position) {
        return "Page " + (position+1);
    }

}
