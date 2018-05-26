package com.acercow.designpattern.states;

public class StopState extends LifeState {

    @Override
    void open() {
        super.context.setLifeState(Context.sOpenState);
        super.context.getLifeState().open();
    }

    @Override
    void close() {

    }

    @Override
    void run() {
        super.context.setLifeState(Context.sRunState);
        super.context.getLifeState().run();
    }

    @Override
    void stop() {
        System.out.println("Lift [STOP]");
    }
}
