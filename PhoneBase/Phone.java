package com.company;

public class Phone {
    private long number;
    private Network network;
    private String model;

    public Phone(){
        super();
    }

    public Phone(long number, String model){
        super();
        this. number = number;
        this.model = model;
    }

    public long getNumber(){
        return number;
    }

    @Override
    public String toString(){
        return "Phone[number= " + number + ", Network= " + network.getName() + ", model= " + model +']';
    }

    public void registerInNetwork(Network network){
        network.registerPhone(this);
        this.network = network;
    }

    public void incomingCall(){
        System.out.println(this + " is ringing. Dzzzzin - Dzzzzin!");
    }

    public void call(long number){
        if(network.search(number) != null){
            network.search(number).incomingCall();
        } else{
            System.out.println("Wrong number");
        }
    }

}