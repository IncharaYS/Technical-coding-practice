package com.xworkz;

import java.util.Scanner;

public class NoSwap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1=sc.nextInt();
        System.out.println("Enter the second number");
        int num2=sc.nextInt();

        System.out.println("First number before swapping is:"+num1);
        System.out.println("Second number before swapping is:"+num2);

        swapNumbersArithmeticOp(num1,num2);
        swapNumbersXor(num1,num2);
    }


    public static void swapNumbersArithmeticOp(int num1,int num2){
        num1=num1+num2;
        num2=num1-num2;
        num1=num1-num2;
        System.out.println("First number after swapping with arithmetic op is:"+num1);
        System.out.println("Second number after swapping arithmetic op is:"+num2);
    }

    public static void swapNumbersXor(int num1,int num2){
        num1=num1^num2;
        num2=num1^num2;
        num1=num1^num2;
        System.out.println("First number after swapping with xor is:"+num1);
        System.out.println("Second number after swapping with xor is:"+num2);
    }
}

