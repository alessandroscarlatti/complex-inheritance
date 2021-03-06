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

    private MiddleThingable1.Run run = new MiddleThingable1.Run();
    private BasicThingable.Hide hide = new BasicThingable.Hide();
    private MiddleThingable2.Kite kite = new MiddleThingable2.Kite();

    /**
     * Inherit from MiddleThingable1...
     */
    @Override
    public void run() {
        run.run();
    }

    /**
     * Inherit from BasicThingable...
     */
    @Override
    public void hide() {
        hide.run();
    }

    /**
     * Inherit from MiddleThingable2...
     */
    @Override
    public void kite() {

        kite.run();
    }
}
