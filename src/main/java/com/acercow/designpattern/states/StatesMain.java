package com.acercow.designpattern.states;

public class StatesMain {
    public static void main(String[] args) {
        Context context = new Context();
        context.setLifeState(Context.sCloseState);
        context.stop();
        context.run();
        context.open();
        context.stop();
        context.open();
        context.close();
        context.stop();
    }
}
