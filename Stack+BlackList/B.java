package com.company;

public class B {
    private int value;

    public B(int value) {
        super();
        this.value = value;
    }

    public B() {
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
        return "B [value=" + value + "]";
    }
}