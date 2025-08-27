package com.xworkz;

import java.util.Scanner;

public class StrongNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //sum of the factorials of its digits equals the number itself-145,40585
        System.out.println("Enter a number to check if it a strong number");
        int num=sc.nextInt();

        if(num<0) System.out.println("Negative no cannot be strong no");

        else {
            if (checkStrongNo(num)) System.out.println(num+" is a strong number");
            else System.out.println(num+" is not a strong number");
        }
    }


    public static boolean checkStrongNo(int num){
        int sum=0;
        int temp=num;
        int digit;

        if(num==0) return false;

        while(temp>0){
            digit=temp%10;
            sum=sum+findFactorial(digit);
            temp=temp/10;
        }
        return sum==num;
    }

    public static int findFactorial(int num){
        if(num==0||num==1) return 1;
        return num*findFactorial(num-1);
    }
}
