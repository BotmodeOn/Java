package com.company;
import java.io.Serializable;

public class Human implements Serializable {
    private String firstName;
    private String secondName;
    private String gender;
    private int age;
    private static final long serialVersionUID = 1L;

    public Human(String firstName, String secondName, String gender, int age) {
        super();
        this.firstName = firstName;
        this.secondName = secondName;
        this.gender = gender;
        this.age = age;
    }

    public Human() {
        super();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Human [firstName=" + firstName + ", secondName=" + secondName + ", gender=" + gender + ", age=" + age
                + "]";
    }
}