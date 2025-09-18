package com.xworkz;

import java.util.Scanner;
import java.lang.Math;

public class ReverseDigitsOfNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to reverse it's digits");
        int num=sc.nextInt();

        System.out.println("Reverse of digits of number "+num+ " is:"+reverseNo(num));
    }


    public static int reverseNo(int num){
        int digit;
        int reverse=0;
        int temp=Math.abs(num);
        while(temp>0){
            digit=temp%10;
            reverse=reverse*10+digit;
            temp=temp/10;
        }
        return num>0?reverse:-reverse;
    }
}
