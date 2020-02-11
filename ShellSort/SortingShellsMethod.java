package com.company;

public class SortingShellsMethod implements Runnable {

    private int[] array;
    private int begin;
    private int end;
    private Thread thr;
    private int index;
    private boolean stop = false;


    public SortingShellsMethod(int[] array, int begin, int end){
        super();
        this.array = array;
        this.begin = begin;
        this.end = end;
        thr = new Thread(this);
        thr.start();
        this.index = begin;

    }


    public Thread getThr() {
        return thr;
    }

    public int peekElement() {
        return array[index];
    }
    public int pollElement() {
        int temp = array[index];
        check();
        return temp;
    }
    public boolean isStop() {
        return stop;
    }



    @Override
    public void run() {


        int step = array.length / 2;
        while (step > 0)
        {
            for (int i = 0; i < (array.length - step); i++) {
                int j = i;
                while (j >= 0 && array[j] > array[j + step])
                {

                    int temp = array[j];
                    array[j] = array[j + step];
                    array[j + step] = temp;
                    j--;
                }
            }
            step = step / 2;
        }

    }

    private void check() {
        this.index++;
        if (this.index >= this.end) {
            this.stop = true;
        }
    }

}