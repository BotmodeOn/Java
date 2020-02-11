package com.company;


public class Triangle extends Shape {
    private Point a;
    private Point b;
    private Point c;

    public Triangle(){
    }
    public Triangle(Point a,Point b,Point c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public Point getA(){
        return a;
    }
    public Point getB(){
        return b;
    }
    public Point getC(){
        return c;
    }
    public void setA(Point a){
        this.a = a;
    }
    public void setB(Point b){
        this.b = b;
    }
    public void setC(Point c){
        this.a = c;
    }
    @Override
    public double getArea(){
        double p = getPerimetr()/2.0;
        return Math.sqrt(p*(p - Point.calculationDistance(a,b)) *
                (p - Point.calculationDistance(b,c))
        *(p - Point.calculationDistance(c,a)));
    }
    @Override
    public double getPerimetr(){
        return Point.calculationDistance(a,b) + Point.calculationDistance(a,c) + Point.calculationDistance(c,b);
    }
    @Override
    public String toString(){
        return "Triangular {" + "a = " + a + ", b = " + b + ", c = " + c + '}';

    }
}
