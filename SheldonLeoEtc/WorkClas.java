package com.company;

import java.util.ArrayList;
import java.util.List;

public class WorkClas {

    public static List<String> createList() {
        String sheldon = "Шелдон";
        String leonard = "Леонард";
        String volovits = "Воловиц";
        String kutrapalli = "Кутрапали";
        String penny = "Пенни";
        List<String> lineList = new ArrayList<>();
        lineList.add(sheldon);
        lineList.add(leonard);
        lineList.add(volovits);
        lineList.add(kutrapalli);
        lineList.add(penny);
        return lineList;
    }

    public static List<String> createALineAfterGivingAColla(List<String> list, int numberOfColla) {
        for (int i = 0; i < numberOfColla; i++) {
            String temp = list.remove(0);
            list.add(temp);
            list.add(temp);
        }
        return list;
    }
}