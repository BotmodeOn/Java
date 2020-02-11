package com.company;

import java.io.*;
import java.util.*;

public class CharCounter {

    public static void countCharsInTextFile(String fileAdres){

        //читаем текст из файла
        String txt="";
        try(BufferedReader f =new BufferedReader(new FileReader(fileAdres))){
            while (true){
                String s = f.readLine();
                if(s == null) {
                    break;
                }
                txt = s;
            }
        }catch(IOException e){
            System.out.println(e);
        }

        char[] arr = txt.toCharArray();

        ArrayList<CharConteiner> conteinerList = new ArrayList<>();
        for (char c : arr){
            int i = isContein(conteinerList,c);
            if(i >= 0){
                conteinerList.get(i).iterCount();
            }
            else{
                conteinerList.add(new CharConteiner(c));
            }
        }

        //сортируем по убыванию
        Collections.sort(conteinerList);

        System.out.println("Char count in this text is: " + arr.length);
        for(CharConteiner c : conteinerList) {
            System.out.println(c + ", count = "+ c.getCount() +", relative frequency is: " + (float)c.getCount()/arr.length);
        }
    }

    private static int isContein(ArrayList<CharConteiner> list, char c) {
        int result = -1;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getC()==c){
                result = i;
                break;
            }
        }
        return result;
    }
}
