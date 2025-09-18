package com.xworkz;
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a year to check if it's a leap year or not");
        int year=sc.nextInt();

        if(year<0) System.out.println("Enter a positive number");

        else {
            if(checkLeapYear(year)) System.out.println(year+" is a Leap year");
            else System.out.println(year+" is not a leap year");
        }
    }

    public static boolean checkLeapYear(int year){
        if(year%400==0) return true;
        if(year%100==0) return false;
        if(year%4==0) return true;
        return false;
    }
}
