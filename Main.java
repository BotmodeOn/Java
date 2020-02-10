package com.company;

public class Main {

    public static void main(String[] args) {
	/*Описать класс «Vector3d» (т. е., он должен описывать вектор в трехмерной,
декартовой системе координат). В качестве свойств этого класса возьмите
координаты вектора. Для этого класса реализовать методы сложения, скалярного и
векторного произведения векторов. Создайте несколько объектов этого класса и
протестируйте их.*/
             Vector vector1 = new Vector(1,2,3);
             Vector vector2 = new Vector(4,4,-1);
             Vector vector3 = Vector.vectorProduct(vector1,vector2);
             System.out.println(vector3);
             System.out.println(Vector.scalarProduct(vector1,vector3));
             System.out.println(Vector.addition(vector2,vector3));
             Vector vector4 = new Vector(2,5,6);
             System.out.println(Vector.vectorProduct(vector4,vector1));

    }
}
