package com.company;

public class Vector {
    private double a;
    private double b;
    private double c;
 public  Vector(){
     super();
 }
 public Vector(double a,double b,double c){
     this.a = a;
     this.b = b;
     this.c = c;
 }
 public double getA(){
     return a;
 }
 public double getB(){
     return b;
 }
 public double getC(){
     return c;
 }
 public void setA(double a ){
     this.a = a;
 }
 public void setB(double b){
     this.b = b;
 }
 public void setC(double c){
     this.c = c;
 }
 public static Vector addition(Vector a,Vector b){
     return new Vector(a.getA() + b.getA(), a.getB() + b.getB(), a.getC() + b.getC() );
 }
 public static double scalarProduct(Vector a,Vector b){
     return a.getA() * b.getA() + a.getB() * b.getB() + a.getC() * b.getC();
 }
 public static Vector vectorProduct(Vector a,Vector b){
     return new Vector(a.getB() * b.getC() - a.getC() * b.getB(), a.getC() * b.getA() - a.getA() * b.getC(), a.getA() * b.getB() - a.getB() * b.getA());
 }
 @Override
    public String toString(){
     return "Vector[" +
             "a = " + a +
             "b = " + b +
             "c = " + c +
             ']';
 }
}
