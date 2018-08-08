package com.scarlatti.thingable2;

/**
 * ______    __                         __           ____             __     __  __  _
 * ___/ _ | / /__ ___ ___ ___ ____  ___/ /______    / __/______ _____/ /__ _/ /_/ /_(_)
 * __/ __ |/ / -_|_-<(_-</ _ `/ _ \/ _  / __/ _ \  _\ \/ __/ _ `/ __/ / _ `/ __/ __/ /
 * /_/ |_/_/\__/___/___/\_,_/_//_/\_,_/_/  \___/ /___/\__/\_,_/_/ /_/\_,_/\__/\__/_/
 * Tuesday, 8/7/2018
 */
public class MiddleThingable1 implements Thingable {

    private Run run = new Run();

    @Override
    public void run() {
        run.run();
    }

    @Override
    public void hide() {
        System.out.println("BasicThingable.hide() will not hide");
    }

    @Override
    public void kite() {
        System.out.println("BasicThingable.kite() ");
    }

    public static class Run implements Runnable {
        @Override
        public void run() {
            System.out.println("BasicThingable.run() will not run");
        }
    }
}
