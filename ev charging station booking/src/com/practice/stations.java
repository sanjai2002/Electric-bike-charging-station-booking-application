package com.practice;

public class stations {
    private int stationno;
    private int capacity;//get and set

    stations(int stationno,int capacity){
        this.stationno=stationno;
        this.capacity=capacity;

    }

    public int getCapacity(){
        return capacity;
    }

    public void setCapacity(int cap){
        capacity=cap;
    }

    public int  getStationno(){
        return stationno;
    }
    public void setStationno(int  no){
        stationno=no;
    }
    public void displaystationinfo(){
        System.out.println("staion no : "+stationno+" total capacity: "+capacity);
    }

}
