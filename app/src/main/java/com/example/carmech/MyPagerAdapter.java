package com.example.carmech;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class MyPagerAdapter extends FragmentPagerAdapter {
    private static int NUM_ITEMS = 11;

    public MyPagerAdapter(FragmentManager fragmentManager) {
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
                return FirstFragment.newInstance(0, "1. When you notice that your car is running on a flat tyre, you must park your car far from traffic on an even non-sloping surface to prevent the car from sliding away while you change the tyre.","tyreflat");
            case 1: // Fragment # 0 - This will show FirstFragment different title
                return FirstFragment.newInstance(1, "2. After you have parked your car you must make sure you have applied the handbrake to prevent the car from rolling away. Also, use your gearstick and put the car either on first gear or reverse gear (We do this, because if we forget to put the handbrake the car will not slide anywhere when switched on and put into gear.","hbrake");
            case 2: // Fragment # 1 - This will show SecondFragment
                return FirstFragment.newInstance(2, "3. After switching the cars ignition off, and putting it in either first or reverse gear you should make sure you do put two blocks or rocks in front and at the back of the tyre which needs replacing.","stonetyre");
            case 3: // Fragment # 0 - This will show FirstFragment
                return FirstFragment.newInstance(3, "4. After following all the steps above, go to the boot of your car and get the spare tyre and along with it also get the tools","tools");
            case 4: // Fragment # 0 - This will show FirstFragment different title
                return FirstFragment.newInstance(4, "5. You must now place the jack in the right place in order to lift the car without damaging it from the bottom. There is most likely to be a mark just behind the front wheel wells where the jack should be placed. ","changejack");
            case 5: // Fragment # 1 - This will show SecondFragment
                return FirstFragment.newInstance(5, "6. After you are done placing the jack in the correct place, now you must lift the car up by putting the metal rod which is the long metal stick with a hook on one side of it. You must place the hook in the side of the jack hole and rotate it to lift the car not off the ground but just enough so you can take out the tyre.","changingty");
            case 6: // Fragment # 0 - This will show FirstFragment
                return FirstFragment.newInstance(6, "7. Now you must loosen the nuts of the wheel from the car by rotating the metal rod counter clockwise. Use the wrench to remove the nuts from the wheels. Removing the nuts from the cars wheels can be a very hard job, so if you fail to do so with your hands, you may stomp with your entire body weight to take the nuts out.","bolts");
            case 7: // Fragment # 0 - This will show FirstFragment different title
                return FirstFragment.newInstance(7, "8. After you are done loosening the tyre of the car. Then you must lift the car off the ground and remove the tyre and place the spare tyre on the car.","spare");
            case 8: // Fragment # 1 - This will show SecondFragment
                return FirstFragment.newInstance(8, "9. Once you have placed the spare tyre, tighten the nuts onto the spare tyre with your hand, and then keep tightening them with the wrench. Until they cannot be tightened more. Then, lower the car onto the ground.","lowercar");
            case 9: // Fragment # 0 - This will show FirstFragment
                return FirstFragment.newInstance(9, "10. Remove the Jack from under the car and put it in the boot along with the flat tyre. ","kit");
            case 10: // Fragment # 0 - This will show FirstFragment different title
                return FirstFragment.newInstance(10, "11. Do not forget to take the flat tyre to the nearest mechanic. Because spare tyres also have speed limits which they cannot cross. And if crossed, might cause a lot of damage to the passengers in the car.","repairing");
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
