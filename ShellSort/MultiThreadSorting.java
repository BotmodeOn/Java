package com.company;

public class MultiThreadSorting {


    static void sort(int[] array, int threadNumber) {
        SortingShellsMethod[] threadArray = new SortingShellsMethod[threadNumber];
        for (int i = 0; i < threadArray.length; i++) {
            int size = array.length / threadNumber;
            int begin = size * i; int end = ((i + 1) * size);
            if ((array.length - end) < size) {
                end = array.length;
            }
            threadArray[i] = new SortingShellsMethod(array, begin, end);
        }
        for (int i = 0; i < threadArray.length; i++) {
            try {
                threadArray[i].getThr().join();
            } catch (InterruptedException e) {
                System.out.println(e);
            }

        } System.arraycopy(mergeArrays(array, threadArray), 0, array, 0, array.length);
    }

    private static int[] mergeArrays(int[] array, SortingShellsMethod[] threadarray) {
        int[] arr = new int[array.length];
        for (int i = 0; i < arr.length; i++) {
            int min = Integer.MAX_VALUE;
            int k = -1;
            for (int j = 0; j < threadarray.length; j++) {
                if (!threadarray[j].isStop() && min > threadarray[j].peekElement()) {
                    min = threadarray[j].peekElement();
                    k = j;
                }
            } if (k != -1) {
                arr[i] = threadarray[k].pollElement();
            }
        }
        return arr;
    }


}