package com.scarlatti.thingable4;

/**
 * ______    __                         __           ____             __     __  __  _
 * ___/ _ | / /__ ___ ___ ___ ____  ___/ /______    / __/______ _____/ /__ _/ /_/ /_(_)
 * __/ __ |/ / -_|_-<(_-</ _ `/ _ \/ _  / __/ _ \  _\ \/ __/ _ `/ __/ / _ `/ __/ __/ /
 * /_/ |_/_/\__/___/___/\_,_/_//_/\_,_/_/  \___/ /___/\__/\_,_/_/ /_/\_,_/\__/\__/_/
 * Tuesday, 8/7/2018
 */
public class BasicThingable implements Thingable {

    private InnerClassHide hide = new InnerClassHide();
    protected String name;

    public BasicThingable(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("BasicThingable.run() " + name);
    }

    /**
     * Inherited by OtherThingable
     */
    @Override
    public void hide() {
        hide.run();
    }

    @Override
    public void kite() {
        System.out.println("BasicThingable.kite() " + name);
    }

    public BasicThingable getThis() {
        return this;
    }

    /**
     * There are two options here...
     * Option 1: make this an inner class.
     * "name" will be visible, but the class can't be used from outside,
     * unless you have an enclosing instance of it...
     *
     */
    public class InnerClassHide implements Runnable {
        @Override
        public void run() {
            System.out.println("BasicThingable.hide() " + name);
        }
    }

    /**
     * There are two options here...
     * Option 2: inject the BasicThingable instance into this instance.
     * This class can now be used from the outside, but now we have to
     * inject the instance into this class a constructor.
     *
     */
    public static class Hide implements Runnable {

        private BasicThingable basicThingable;

        public Hide(BasicThingable basicThingable) {
            this.basicThingable = basicThingable;
        }

        @Override
        public void run() {
            System.out.println("BasicThingable.hide() " + basicThingable.name);
        }
    }
}
