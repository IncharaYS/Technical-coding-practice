package com.xworkz;

import java.util.Scanner;

public class HarshadNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to check if it's a harshad no");
        //divisible by the sum of its digits
        int num=sc.nextInt();

        if(num<=0) System.out.println("Enter a positive number");

        else {
            if (checkHarshadNo(num)) System.out.println("Entered number " + num + " is a harshad no");
            else System.out.println("Entered number " + num + " is not a harshad no");
        }
    }

    public static boolean checkHarshadNo(int num){
        int digit;
        int sum=0;
        int temp=num;

        while(temp>0){
            digit=temp%10;
            sum=sum+digit;
            temp=temp/10;
        }
        return num%sum==0;
    }
}
