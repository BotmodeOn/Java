package com.company;

import java.io.IOException;
import java.util.ArrayList;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyFilesByThreads {

    private static ArrayList<String> list = new ArrayList<String>(); // creating filenames array

    private static ArrayList<String> fileList(String initFolder) { // method returns filenames array from initial folder
        File title = new File(initFolder);
        String[] titles = title.list();
        for (String x : titles) list.add(x);
        return list;
    }

    private static void copyByByte(File from, File to) throws IOException { // method to copy files by bytes
        try (FileInputStream streamIn = new FileInputStream(from);
             FileOutputStream streamOut = new FileOutputStream(to)) {
            byte[] buffer = new byte[1024];
            int reader;
            do {
                reader = streamIn.read(buffer);
                streamOut.write(reader);
            }
            while (reader > 0);
/*            for (; (read = streamIn.read(buffer)) > 0; )
            streamOut.write(buffer, 0, read);*/
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void copyFiles(int start, int end, String initFolder, String destFolder) {

        for (int i = start; i < end; i++) {
            File initFile = new File(initFolder + "/" + list.get(i));
            File destFile = new File(destFolder + "/" + list.get(i));
            try {
                copyByByte(initFile, destFile);
                System.out.println(list.get(i) + " is coping from " + initFolder + " to " + destFolder);
            } catch (IOException e) { // IOException is used in method copyByByte
                e.printStackTrace();
            }
        }
    }

    public static void Threads(String from, String to, int threads) {

        int start;
        int end;
        fileList(from);
        SingleThread[] pool = new SingleThread[threads];

        int quant = list.size() / threads;
        for (int i = 0; i < threads; i++) {
            start = quant * i;
            end = quant * (i + 1);
            if (i == threads - 1) {
                end = list.size();
            }
            pool[i] = new SingleThread(start, end, from, to);
        }

        for (int i = 0; i < pool.length; i++) {
            try {
                pool[i].getThr().join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Files has been copied from " + from + " to " + to);
    }
}