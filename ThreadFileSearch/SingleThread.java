package com.company;

public class SingleThread implements Runnable {

    private int begin;
    private int end;
    private String folder;
    private String file;
    private FileSearch fs;
    private Thread thr;

    public SingleThread(FileSearch fs, String folder, String file, int begin, int end) {
        this.begin = begin;
        this.end = end;
        this.folder = folder;
        this.file = file;
        this.fs = fs;
        thr = new Thread(this);
        thr.start();
    }

    public Thread getThr() {
        return thr;
    }

    public void run() {
        fs.search(folder, file, begin, end);
    }
}