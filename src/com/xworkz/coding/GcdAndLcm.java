package com.xworkz;

import java.util.Scanner;
import java.lang.Math;

public class GcdAndLcm {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers to find their lcm and gcd");
        int num1=sc.nextInt();
        int num2=sc.nextInt();

        if(num1<0||num2<0) System.out.println("Cannot find lcm and gcd of negative numbers");

        else {
            System.out.println("LCM of " + num1 + " and " + num2 + " is:" + findLcm(num1, num2));
            System.out.println("GCD of " + num1 + " and " + num2 + " is:" + findHcf(num1, num2));
        }
    }


    public static int findLcm(int num1,int num2){
        int num=Math.max(num1, num2);
        while(true){
            if(num%num1==0&&num%num2==0) {
                return num;
            }
            num++;
        }
        //return (num1*num2)/findHch(num1,num2);
    }

    public static int findHcf(int num1,int num2){
        if (num2==0) return num1;
        return findHcf(num2,num1%num2);
    }
}
