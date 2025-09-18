package com.xworkz;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to check if it's palindrome or not");
        int num=sc.nextInt();

        if(num<0) System.out.println("Negative number cannot be palindrome");

        else {
            if (checkPalindrome(num))
                System.out.println(num + " is a palindrome");
            else System.out.println(num + " is not a palindrome");
        }
    }


    public static boolean checkPalindrome(int num){
        int sum=0;
        int temp=num;
        int digit;
        while(temp>0){
            digit=temp%10;
            sum=sum*10+digit;
            temp=temp/10;
        }
        return sum == num;
    }
}
