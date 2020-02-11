package com.company;

public class Ship implements Runnable {
    private String name;
    private int numOfBoxes;
    private Dock [] docks;

    public Ship(String name,int numOfBoxes,Dock [] docks){
        super();
        this.docks = docks;
        this.name = name;
        this.numOfBoxes = numOfBoxes;
    }
    public Ship(){
        super();
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getNumOfBoxes(){
        return numOfBoxes;
    }
    public void setNumOfBoxes(int numOfBoxes){
        this.numOfBoxes = numOfBoxes;
    }
    public Dock[] getDocks(){
        return docks;
    }

    public void setDocks(Dock[] docks) {
        this.docks = docks;
    }
    @Override
    public String toString(){
        return "Ship [name = " + name + ", numberOfBoxes = " + numOfBoxes + "]";
    }
    @Override
    public void run(){
        Thread thr = Thread.currentThread();
        int indexOfDock = Integer.parseInt("" + thr.getName().charAt(thr.getName().length() - 1));
        System.out.println(name + "entered to the " + docks[indexOfDock - 1] + ".");
        for (; numOfBoxes > 0;) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException x) {
                x.printStackTrace();
            }
            numOfBoxes -= 1;
            docks[indexOfDock - 1].setNumberOfBoxes(docks[indexOfDock - 1].getNumberOfBoxes() + 1);
        }

        System.out.println(name + " was unloaded in the " + docks[indexOfDock - 1] + ".");
        System.out.println(name + " left the " + docks[indexOfDock - 1] + ".");
    }
}
