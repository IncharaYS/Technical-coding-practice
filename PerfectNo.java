package com.xworkz;

import java.util.Scanner;

public class PerfectNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to check if it's a perfect number");
        int num=sc.nextInt();

        if(num<=0) System.out.println("Enter a positive number");

        else {
            if(checkPerfectNo(num)) System.out.println(num+ " is a perfect number");
            else System.out.println(num+" is not a perfect number");
        }
    }


    public static boolean checkPerfectNo(int num){
        int sum=0;
        for(int i=1;i<=num/2;i++){
            if(num%i==0)  sum=sum+i;
        }
        return sum==num;
    }
}
