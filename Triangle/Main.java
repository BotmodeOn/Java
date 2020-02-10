package com.company;

public class Main {

    public static void main(String[] args) {
	/*Описать класс «Triangle». В качестве свойств возьмите длины сторон
треугольника. Реализуйте метод, который будет возвращать площадь этого
треугольника. Создайте несколько объектов этого класса и протестируйте их.
*/
Triangle one = new Triangle(3,4,5);

            System.out.println("Triangle one squre is : "+ one.GetArea());
 Triangle two = new Triangle(3.3,4.3,1.2);

             System.out.println("Triangle two squre is : "+ two.GetArea());


    }
}
