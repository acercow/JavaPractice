package com.acercow.designpattern.states;

public class Context {

    public final static LifeState sCloseState = new CloseState();
    public final static LifeState sOpenState = new OpenState();
    public final static LifeState sRunState = new RunState();
    public final static LifeState sStopState = new StopState();

    private LifeState mLifeState;


    public void setLifeState(LifeState state) {
        mLifeState = state;
        mLifeState.setContext(this);

    }

    public LifeState getLifeState() {
        return mLifeState;
    }

    public void close() {
        mLifeState.close();
    }

    public void open() {
        mLifeState.open();
    }

    public void run() {
        mLifeState.run();
    }

    public void stop() {
        mLifeState.stop();
    }

}
