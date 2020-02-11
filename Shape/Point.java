package com.company;

public class Point {
    private double x;
     private double y;

    public Point(){
    }
    Point(double x, double y){
        this.x = x;
        this.y = y;
    }
    public double getX(){
        return x;
    }
    public  double getY(){
        return y;
    }
    public void setX(double x){
        this.x = x;
    }
    public void setY(){
        this.y = y;
    }
    @Override
    public String toString(){
        return "Point{ " +"x = " + x +", y = " + y + '}';
    }
    public static double calculationDistance(Point a,Point b){
        return Math.sqrt((a.x - b.x) * (a.x - b.x) + (a.y - b.y) * (a.y - b.y));
    }
}
