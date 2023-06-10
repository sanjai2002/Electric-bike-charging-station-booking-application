package com.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<stations>station=new ArrayList<stations>();
        ArrayList<booking>bookings=new ArrayList<booking>();
        station.add(new stations(1,4));
        station.add(new stations(2,5));
        station.add(new stations(3,3));
        station.add(new stations(4,2));

        int useropt=1;
        Scanner in=new Scanner(System.in);

        for(stations s:station){
            s.displaystationinfo();
        }
        while (useropt==1) {
            System.out.println("enter 1 to book and 2 to exit");
            useropt=in.nextInt();
            if(useropt==1){
                booking book=new booking();
                if(book.isavailable(bookings,station)){
                    bookings.add(book);
                    System.out.println("your booking is conformed");
                }
                else{
                    System.out.println("sorrry..charging station is full");
                }
            }
        }
    }
}
