package com.company;


public class Quadrangle extends Shape {
    private Point a;
    private Point b;
    private Point c;
    private Point d;

    public Quadrangle(){
    }

    public Quadrangle(Point a,Point b,Point c,Point d){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
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
    public Point getD(){
        return d;
    }
    public void setA(Point a){
        this.a = a;
    }
    public void setB(Point b){
        this.b = b;
    }
    public void  setC(Point c){
        this.c = c;
    }
    public void  setD(Point d){
        this.d = d;
    }
    @Override
    public String toString(){
        return "Quadrangle{" + "a = " + a + ", b = " + b +
                ", c = "+ c + ", d = "+ d + '}';
    }
    @Override
    public double getPerimetr(){
        return Point.calculationDistance(a,b) + Point.calculationDistance(b,c)
                + Point.calculationDistance(c,d) + Point.calculationDistance(d,a);
    }
    @Override
    public double getArea(){
        double p = this.getPerimetr()/2;
        return Math.sqrt((p -Point.calculationDistance(a,b))* (p - Point.calculationDistance(b,c))
        *(p - Point.calculationDistance(c,d)) * (p - Point.calculationDistance(d,a)));
    }

}

