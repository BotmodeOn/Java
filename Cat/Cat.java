package com.company;

public class Cat {
    //Описание свойст и методов работы класса Cat
   private String name;
   private String color;
   private int age;
   private int voiceVolume;
   private String mood;
   private double height;


    public Cat(String name, String mood, int age, int voiceVolume, String color,double heigth) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.mood = mood;
        this.voiceVolume = voiceVolume;
        this.height = heigth;
    }

    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge() {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor() {
        this.color = color;
    }

    public String getMood() {
        return mood;
    }

    public void setMood() {
        this.mood = mood;
    }
    public double getHeigth() {
        return height;
    }

    public void setHeight() {
        this.height = height;
    }

    public int getVoiceVolume() {
        return voiceVolume;
    }

    public void setVoiceVolume() {
        this.voiceVolume = voiceVolume;
    }
    public void jump(double a) {
        double jumpHigh = height + a;
        System.out.println("High of jump:" + jumpHigh);
    }


        @Override
        public String toString () {
            return "Cat" +
                    "name= " + name + "," +
                    " color= " + color + "," +
                    " age= " + age + "," + "voiceVolume = "+ voiceVolume +
                    ", mood= " + mood ;

        }


    }








