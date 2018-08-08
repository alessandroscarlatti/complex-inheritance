package com.scarlatti.thingable2;

/**
 * ______    __                         __           ____             __     __  __  _
 * ___/ _ | / /__ ___ ___ ___ ____  ___/ /______    / __/______ _____/ /__ _/ /_/ /_(_)
 * __/ __ |/ / -_|_-<(_-</ _ `/ _ \/ _  / __/ _ \  _\ \/ __/ _ `/ __/ / _ `/ __/ __/ /
 * /_/ |_/_/\__/___/___/\_,_/_//_/\_,_/_/  \___/ /___/\__/\_,_/_/ /_/\_,_/\__/\__/_/
 * Tuesday, 8/7/2018
 *
 * This thingable could be said to be exhibiting multiple inheritance.
 */
public class OtherThingable implements Thingable {

    /**
     * Inherit from MiddleThingable1...
     */
    @Override
    public void run() {
        System.out.println("OtherThingable.run() will not run");
    }

    /**
     * Inherit from BasicThingable...
     */
    @Override
    public void hide() {
        System.out.println("OtherThingable.hide() ");
    }

    /**
     * Inherit from MiddleThingable2...
     */
    @Override
    public void kite() {
        System.out.println("OtherThingable.kite() will not kite");
    }
}
