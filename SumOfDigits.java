package com.xworkz;

import java.util.Scanner;
import java.lang.Math;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to find sum of it's digits");
        int num=sc.nextInt();

        int sum=findSumOfDigits(num);
        System.out.println("Sum of digits of "+num+" is:"+sum);
    }


    public static int findSumOfDigits(int num){
        int sum=0;
        int digit;
        num=Math.abs(num);
        while(num>0){
           digit=num%10;
           sum+=digit;
           num=num/10;
        }
        return sum;
    }
}
