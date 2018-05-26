package com.acercow.designpattern.states;

public class RunState extends LifeState {


    @Override
    void open() {

    }

    @Override
    void close() {

    }

    @Override
    void run() {
        System.out.println("Lift [Run]");
    }

    @Override
    void stop() {
        super.context.setLifeState(Context.sStopState);
        super.context.getLifeState().stop();
    }
}
