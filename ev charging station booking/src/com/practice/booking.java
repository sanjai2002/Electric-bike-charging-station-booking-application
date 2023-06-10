package com.practice;

import java.util.*;

public class booking {
    String name;
    int stationno;
    booking(){
        Scanner in=new Scanner(System.in);
        System.out.println("enter your name");
        name=in.next();
        System.out.println("enter a station no");
        stationno=in.nextInt();

    }
    public boolean isavailable(ArrayList<booking>bookings,ArrayList<stations>station){
        int capacity=0;
        for(stations s:station){
            if(s.getStationno()==stationno)
                capacity=s.getCapacity();
        }

        int booked=0;
        for(booking b:bookings){
            if(b.stationno==stationno){
                booked++;
            }
        }
        return booked<capacity?true:false;

    }

}
