package com.company;

import java.io.Serializable;

public class Student extends Human implements Serializable  {
    private String faculty;
    private String group;
    private static final long serialVersionUID = 1L;

    public Student(String firstName, String secondName, String gender, int age, String faculty, String group) {
        super(firstName, secondName, gender, age);
        this.faculty = faculty;
        this.group = group;
    }

    public Student(Human human, String faculty, String group) {
        super(human.getFirstName(), human.getSecondName(), human.getGender(), human.getAge());
        this.faculty = faculty;
        this.group = group;
    }

    public Student() {
        super();
    }

    @Override
    public String getFirstName() {
        return super.getFirstName();
    }

    @Override
    public void setFirstName(String firstName) {
        super.setFirstName(firstName);
    }

    @Override
    public String getSecondName() {
        return super.getSecondName();
    }

    @Override
    public void setSecondName(String secondName) {
        super.setSecondName(secondName);
    }

    @Override
    public String getGender() {
        return super.getGender();
    }

    @Override
    public void setGender(String gender) {
        super.setGender(gender);
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public void setAge(int age) {
        super.setAge(age);
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Student [firstName=" + getFirstName() + ", secondName=" + getSecondName() + ", gender=" + getGender()
                + ", age=" + getAge() + ", faculty=" + faculty + ", group=" + group + "]";
    }
}