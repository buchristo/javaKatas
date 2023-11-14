package com.buchristo.kataCollection.dragonhero;

public class DragonHero {

    /* A hero is on his way to the castle to complete his mission.
     However, he's been told that the castle is surrounded with a couple of powerful dragons!
     Each dragon takes 2 bullets to be defeated, our hero has no idea how many bullets he should carry.
     Assuming he's going to grab a specific given number of bullets and move forward to fight another specific given number of dragons, will he survive?

     Return true if yes, false otherwise! */

    public boolean hero(int bullets, int dragons) {
        return bullets - (2 * dragons) >= 0;
    }
}
