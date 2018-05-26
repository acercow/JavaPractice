package com.acercow.designpattern.states;

public class CloseState extends LifeState {
    @Override
    void open() {
        super.context.setLifeState(Context.sOpenState);
        super.context.getLifeState().close();
    }

    @Override
    void close() {
        System.out.println("Lift [CLOSE]");
    }

    @Override
    void run() {
        super.context.setLifeState(Context.sRunState);
        super.context.getLifeState().run();
    }

    @Override
    void stop() {

    }
}
