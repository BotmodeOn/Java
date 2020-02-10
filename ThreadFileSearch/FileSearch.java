package com.company;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class FileSearch {

    private static ArrayList<String> folderArrList = new ArrayList<>();
    private static ArrayList<String> fileArrList = new ArrayList<>();

    public static void folderList(String folder) throws NullPointerException, IOException {

        File folder1 = new File(folder);
        if (folder1.isDirectory()) {
            File[] folders = folder1.listFiles();
            for (int x = 0; x < folders.length; x++) {
                File folder2 = new File(folders[x].getAbsolutePath());
                if (folder2.isDirectory() && (!folder2.getName().contains("$"))) {
                    folderArrList.add(folder2.toString());
                    folderList(folder2.toString());
                }
            }
        }
    }

    public void fileList(String folder, String file) throws NullPointerException, IOException {
        File file1 = new File(folder);
        if (file1.isDirectory()) {
            File[] folders = file1.listFiles();
            for (int x = 0; x < folders.length; x++) {
                File file2 = new File(folders[x].getAbsolutePath());
                if (file2.isFile()) {
                    if (file2.getName().equals(file))
                        fileArrList.add(file2.getAbsolutePath());
                }
            }
        }
    }

    public void search(String folder, String file, int begin, int end) {
        if (folderArrList.size() > 0) {
            for (int x = begin; x < end; x++) {
                try {
                    fileList(folderArrList.get(x), file);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void threads(String folder, String file, int threads) {

        try {
            folderList(folder);
        } catch (IOException e) {
            e.printStackTrace();
        }

        SingleThread[] thr = new SingleThread[threads];
        int length = folderArrList.size() / threads;
        for (int x = 0; x < thr.length; x++) {
            int begin = length * x;
            int end = length * (x + 1);
            if (x == threads - 1) {
                end = folderArrList.size();
            }
            FileSearch fs = new FileSearch();
            thr[x] = new SingleThread(fs, folder, file, begin, end);
        }

        for (SingleThread x : thr)
            try {
                x.getThr().join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        if (fileArrList.size() > 0) {
            System.out.println("Following files was found: ");
            for (int x = 0; x < fileArrList.size(); x++) {
                System.out.println(fileArrList.get(x));
            }
        } else {
            System.out.println("File not found.");
        }
    }
}