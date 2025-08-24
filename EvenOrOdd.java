package com.xworkz;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to check even or odd");
        int num=sc.nextInt();

        if(checkEvenOrOdd(num)) System.out.println(num+" is an even number");
        else System.out.println(num+" is an odd num");
    }


    public static boolean checkEvenOrOdd(int num){
        return num%2==0;
    }
}

