package com.company;

public class Board {
    private Shape[] parts = new Shape[4];

    public Board(){
    }

    public Shape[] getParts(){
        return parts;
    }
    public void addShape(Shape shape,int part){   //добавит фигуру в указанную часть
        if (part > 0 && part < 5){
            if (parts[part - 1] == null){
                parts[part - 1] = shape;
                System.out.println("В часть доски № "+ (part) + "добавленна фигура : " + shape);
            }
            else
                System.out.println("Нельзя добавить фигуру,требуемя часть доски занята");
            }
            else System.out.println("Введите верный номер части доски от 1 до 4");
            }


            public void addShape(Shape shape){ //добавит фигуру на любое свободное место
        boolean add = false;
        for (int i = 0; i < parts.length;i++){
            if(parts[i] == null){
                parts[i] = shape;
                add = true;
                System.out.println("На доску добавлена фигура : " + shape);
                break;
            }
        }
    if(!add) System.out.println("Свободного места нет,удалите одно из фигур");
    }
    public void delShape(int part){ //удление фигуры из указаной части
        if(part > 0 && part < 5){
            if(parts[part - 1] != null){
                parts[part - 1] = null;
                System.out.println("Часть доски № : " + (part) + " очищенна");
            }
            else System.out.println("В указаной части нечего удалять");
        }
        else System.out.println("Введите номер часть доски от 1 до 4");
    }
    public void info(){
        double p = 0;
        for (int i = 0; i < parts.length; i ++){
            if (parts[i] != null){
                p += parts[i].getArea();
                System.out.println("В части доски №   " + (i+1)+ "лежит фигура" + parts[i]);
            }
            else  System.out.println("часть доски №   " + (i+1)+ "пуста");
        }
        System.out.println();
        System.out.println("Cуммарная площадь фигур на доске" + p);
    }
}
