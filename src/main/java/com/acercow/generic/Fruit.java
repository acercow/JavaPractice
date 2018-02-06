package com.acercow.generic;

public class Fruit {

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }

    protected void prof() {
        System.out.println("fruit");
    }
}
