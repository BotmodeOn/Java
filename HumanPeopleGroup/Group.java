package com.company;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;

public class Group implements Serializable {
    private String groupName;
    private Student[] group = new Student[0];
    private static final long serialVersionUID = 1L;

    public Group(String groupName, Student[] group) {
        super();
        this.groupName = groupName;
        this.group = group;
    }

    public Group() {
        super();
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Student[] getGroup() {
        return group;
    }

    public void setGroup(Student[] students) {
        this.group = students;
    }

    public void addStudent(Student student) {
        Student[] tmpGroup = new Student[group.length + 1];
        System.arraycopy(group, 0, tmpGroup, 0, group.length);
        tmpGroup[tmpGroup.length - 1] = student;
        group = tmpGroup;
    }

    public void deleteStudent(int positionNum) {
        if ((positionNum < 1) && (positionNum > group.length)) {
            return;
        }
        System.out.println("" + group[positionNum - 1] + " deleted from position " + positionNum + ".");
        group[positionNum - 1] = null;
        Student[] tmpGroup = new Student[group.length - 1];
        int j = 0;
        for (int i = 0; i < group.length; i++) {
            if (group[i] != null) {
                tmpGroup[j] = group[i];
                j += 1;
            }
        }
        group = tmpGroup;
    }

    public File saveToFile(String fileName) {
        File file = new File(fileName);
        try (ObjectOutputStream OOS = new ObjectOutputStream(new FileOutputStream(file))) {
            OOS.writeObject(this);
        } catch (IOException e) {
            System.out.println("ERROR save group !!!");
        }
        return file;
    }

    public static Group restoreFromFile(String fileName) {
        Group gr = new Group();
        File file = new File(fileName);
        try (ObjectInputStream OIS = new ObjectInputStream(new FileInputStream(file))) {
            gr = (Group) OIS.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("ERROR load group !!!");
        }
        gr.setGroupName("restored" + gr.getGroupName());
        return gr;
    }

    public void printgroup() {
        System.out.println("Group: " + groupName);
        for (Student student : group) {
            System.out.println(student);
        }
    }

    @Override
    public String toString() {
        return "Group [students=" + Arrays.toString(group) + "]";
    }
}