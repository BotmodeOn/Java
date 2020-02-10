package com.company;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

 public class Translation {

    private HashMap<String, String> dictionary = new HashMap<>();
    private ArrayList<String> input = new ArrayList<>();
    private String output;

    public void loadDictionaryFromFile(String fileName) {
        File file = new File(fileName);
        if (!file.exists() || file.isDirectory()) {
            return;
        }
        try (BufferedReader bfr = new BufferedReader(new FileReader(file))) {
            String text = "";
            for (; (text = bfr.readLine()) != null;) {
                String[] let = text.split("\t");
                dictionary.put(let[0], let[1]);
            }
            System.out.println("Dictionary loaded!");
            System.out.println();

        } catch (IOException e) {
            System.out.println(e);
        } catch (ArrayIndexOutOfBoundsException e) {
            return;
        }
    }

    public void loadTextFromFile(String fileNameIn) {
        File fileIn = new File(fileNameIn);
        if (!fileIn.exists() || fileIn.isDirectory()) {
            return;
        }
        System.out.println("Loaded from file:");
        try (BufferedReader bfr = new BufferedReader(new FileReader(fileIn))) {
            String text = "";
            for (; (text = bfr.readLine()) != null;) {
                System.out.println(text);
                String[] let = text.split(" ");
                for (String string : let) {
                    input.add(string.toLowerCase());
                }
            }

        } catch (IOException e) {
            System.out.println(e);
        } catch (ArrayIndexOutOfBoundsException e) {
            return;
        }
        System.out.println();
    }

    public void Translation() {
        StringBuilder sb = new StringBuilder();
        for (String string : input) {
            sb.append(dictionary.get(string));
            sb.append(" ");
        }
        output = sb.toString();
        System.out.println("Translation:");
        System.out.println(output);
    }

    public void uploadTranslationInFile(String fileNameOut) {

        File fileOut = new File(fileNameOut);
        try {
            fileOut.createNewFile();
        } catch (IOException e) {
            System.out.println(e);
            ;
        }
        try (PrintWriter pw = new PrintWriter(fileNameOut)) {
            pw.println(output);
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }

    public void InputNewWordInTheDictionary(String fileName) {
        File file = new File(fileName);
        System.out.println("Input new words to the dictionary:");
        Scanner sc = new Scanner(System.in);
        try (BufferedWriter br = new BufferedWriter(new FileWriter(file, true))) {
            String temp = "";
            temp = sc.nextLine();
            for (; temp.compareTo("") != 0;) {
                br.newLine();
                br.write(temp);
                temp = sc.nextLine();
            }

        } catch (Exception e) {
            System.out.println("ERROR");
        }
        sc.close();
        System.out.println("Input of new words complete");

    }

}