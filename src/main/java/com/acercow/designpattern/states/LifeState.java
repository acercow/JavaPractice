package com.acercow.designpattern.states;

public abstract class LifeState {


    protected Context context;

    public void setContext(Context context) {
        this.context = context;
    }


    abstract void open();
    abstract void close();
    abstract void run();
    abstract void stop();
}
