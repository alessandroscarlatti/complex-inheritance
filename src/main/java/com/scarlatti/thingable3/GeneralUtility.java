package com.scarlatti.thingable3;

import java.util.Arrays;
import java.util.List;

/**
 * ______    __                         __           ____             __     __  __  _
 * ___/ _ | / /__ ___ ___ ___ ____  ___/ /______    / __/______ _____/ /__ _/ /_/ /_(_)
 * __/ __ |/ / -_|_-<(_-</ _ `/ _ \/ _  / __/ _ \  _\ \/ __/ _ `/ __/ / _ `/ __/ __/ /
 * /_/ |_/_/\__/___/___/\_,_/_//_/\_,_/_/  \___/ /___/\__/\_,_/_/ /_/\_,_/\__/\__/_/
 * Wednesday, 5/2/2018
 */
public class GeneralUtility implements Runnable {
    public static void main(String[] args) {
        new GeneralUtility().run();
    }

    @Override
    public void run() {
        for (Thingable thingable : thingables()) {
            System.out.println(thingable.getClass().getName());
            thingable.run();
            thingable.hide();
            thingable.kite();
        }
    }

    private List<Thingable> thingables() {
        return Arrays.asList(
            new BasicThingable("phil"),
            new MiddleThingable1("annie"),
            new MiddleThingable2("sophie"),
            new OtherThingable("lewis")
        );
    }
}
