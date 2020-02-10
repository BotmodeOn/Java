package com.company;

public class A {
    private int value;

    public A(int value) {
        super();
        this.value = value;
    }

    public A() {
        super();
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "A [value=" + value + "]";
    }
}
