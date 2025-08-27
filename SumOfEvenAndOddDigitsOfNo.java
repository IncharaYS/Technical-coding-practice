package com.xworkz;
import java.util.Scanner;
import java.lang.Math;

public class SumOfEvenAndOddDigitsOfNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to find sum of it's even and odd digits separately");
        int num=sc.nextInt();

        findSumOfDigits(num);
    }

    public static void findSumOfDigits(int num){
        int digit;
        int sumOdd=0;
        int sumEven=0;
        num=Math.abs(num);

        while(num>0){
            digit=num%10;
            if(digit%2==0) sumEven+=digit;
            else sumOdd+=digit;
            num=num/10;
        }
        System.out.println("Sum of all even digits is:"+sumEven);
        System.out.println("Sum of all odd digits is:"+sumOdd);
    }

}
