package com.company;

import java.util.Arrays;

public class BlackList {

    private Class<?>[] blackList;

    public BlackList() {
        super();
        this.blackList = new Class[0];
    }

    public Class<?>[] getBlackList() {
        return blackList;
    }

    public void setBlackList(Class<?>[] blackList) {
        this.blackList = blackList;
    }

    public void addToList(Class<?> cl) {
        Class<?>[] tmpBlackList = new Class<?>[blackList.length + 1];
        System.arraycopy(blackList, 0, tmpBlackList, 0, blackList.length);
        tmpBlackList[tmpBlackList.length - 1] = cl;
        blackList = tmpBlackList;
    }

    public boolean classInBlackList(Object obj) {
        boolean result = false;
        Class<?> objClass = obj.getClass();
        for (Class<?> cl : blackList) {
            if ((cl != null) && (objClass.equals(cl))) {
                result = true;
                System.out.println(objClass + " is in the BlackList");
                break;
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return "BlackList [blackList=" + Arrays.toString(blackList) + "]";
    }
}