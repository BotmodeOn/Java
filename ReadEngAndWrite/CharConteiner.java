package com.company;

class CharConteiner implements Comparable{
    private char c;
    private int count;

    public CharConteiner(char c) {
        this.c = c;
        count = 1;
    }

    public char getC() {
        return c;
    }

    public int getCount() {
        return count;
    }

    public void iterCount() {
        this.count++;
    }

    @Override
    public int compareTo(Object o) {
        if (o == null) {
            return -1;
        }
        CharConteiner anotherCharConteiner = (CharConteiner) o;
        return (count - anotherCharConteiner.getCount() > 0 ? -1 : 1);
    }

    @Override
    public String toString() {
        return "Char \"" + c + "\"";
    }
}