package com.acercow.designpattern;

import com.acercow.generic.Fruit;

public class Test {
    public void start() {
        Fruit fruit = new Fruit() {
            @Override
            protected void prof() {
                super.prof();
            }

            @Override
            public String toString() {
                prof();
                return super.toString();
            }
        };
    }
}
