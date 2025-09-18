package com.xworkz;

import java.util.Scanner;

public class ArmstrongNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number to check if it a armstrong number");
        int num=sc.nextInt();

        if(checkArmstrong(num)) System.out.println(num+" is a armstrong number");
        else System.out.println(num+" is not a armstrong number");
    }


    public static int countDigits(int num){
        int digits=0;
        while(num>0) {
            digits++;
            num/= 10;
        }
        return digits;
    }

    public static boolean checkArmstrong(int num){
        if(num<0) return false;
        if(num==0) return true;
        int digits=countDigits(num);
        int sum=0;
        int temp=num;
        while(temp>0){
            int digit=temp%10;
            sum+=Math.pow(digit,digits);
            temp/=10;
        }
        return num==sum;
    }
}

