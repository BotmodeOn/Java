package com.company;

public class SingleThread implements Runnable {

    private int start;
    private int end;
    private Thread thr;
    private String from;
    private String to;

    public SingleThread(int start, int end, String from, String to) { // threads constructor
        super();
        this.start = start;
        this.end = end;
        thr = new Thread(this);
        this.from = from;
        this.to = to;
        thr.start();
    }

    public Thread getThr() {
        return thr;
    }

    @Override
    public void run() {
        CopyFilesByThreads.copyFiles(start, end, from, to); // executing method in threads
    }
}
