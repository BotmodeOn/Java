package com.company;

public class Network {
    private Phone[] phones = new Phone[0];
    private  String name;

    public Network(){
        super();
    }
    public Network(String name){
        super();
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void addPhone(Phone phone){
        Phone[] temp = new Phone[phones.length + 1];
        System.arraycopy(phones,0,temp,0,phones.length);
        temp[temp.length - 1] = phone;
        this.phones = temp;
    }
    public boolean registerPhone(Phone phone){
        if(this.search(phone.getNumber()) == null){
            addPhone(phone);
            System.out.println("Your number successfully registered in network");
            return true;
        } else{
            System.out.println("Your number already registered in this network");
            return false;
        }
    }
    public Phone search(long number){
        for(int i = 0;i < phones.length;i++){
            if(number == phones[i].getNumber()){
                return phones[i];
            }
        }
        return null;
    }
}
