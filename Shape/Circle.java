package com.company;

import static com.company.Point.calculationDistance;

public class Circle extends Shape {
    private Point o;
    private Point a;

    public Circle(){
    }
    public Circle(Point o,Point r){
        this.o = o;
        this.a = r;
    }
    public Point getO(){
        return o;
    }
    public Point getR(){
        return a;
    }
    public void setO(){
        this.o = o;
    }
    public void setR(){
        this.a = a;
    }
    @Override
    public String toString(){
        return "Circle{" + "o = " + o + ", a = " + a + '}';
    }
    @Override
    public double getPerimetr(){
        return 2*Math.PI * Point.calculationDistance(o,a);
    }
    public double getArea(){
        return Math.PI * Math.pow(Point.calculationDistance(o,a),2);
    }


}
