package com.acercow.designpattern.states;

public class OpenState extends LifeState {

    @Override
    void open() {
        System.out.println("Life [OPEN]");
    }

    @Override
    void close() {
        super.context.setLifeState(Context.sCloseState);
        super.context.getLifeState().close();
    }

    @Override
    void run() {

    }

    @Override
    void stop() {

    }
}
