package com.scarlatti.thingable3;

/**
 * ______    __                         __           ____             __     __  __  _
 * ___/ _ | / /__ ___ ___ ___ ____  ___/ /______    / __/______ _____/ /__ _/ /_/ /_(_)
 * __/ __ |/ / -_|_-<(_-</ _ `/ _ \/ _  / __/ _ \  _\ \/ __/ _ `/ __/ / _ `/ __/ __/ /
 * /_/ |_/_/\__/___/___/\_,_/_//_/\_,_/_/  \___/ /___/\__/\_,_/_/ /_/\_,_/\__/\__/_/
 * Tuesday, 8/7/2018
 */
public class BasicThingable implements Thingable {

    private String name;

    public BasicThingable(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("BasicThingable.run() " + name);
    }

    @Override
    public void hide() {
        System.out.println("BasicThingable.hide() " + name);
    }

    @Override
    public void kite() {
        System.out.println("BasicThingable.kite() " + name);
    }
}
