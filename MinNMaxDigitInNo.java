package com.xworkz;
import java.util.Scanner;
import java.lang.Math;

public class MinNMaxDigitInNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to find largest and smallest digit in no");
        int num=sc.nextInt();

        findLargestAndSmallestDigit(num);
    }


    public static void findLargestAndSmallestDigit(int num){
        num=Math.abs(num);
        int digit;
        int smallestNo=9;
        int largestNo=0;

        if(num==0){
            System.out.println("Smallest digit in number is:"+num);
            System.out.println("Largest digit in number is:"+num);
            return;
        }

        while (num>0){
            digit=num%10;
            if(smallestNo>digit) smallestNo=digit;
            if(largestNo<digit) largestNo=digit;
            num=num/10;
        }
        System.out.println("Smallest digit in number is:"+smallestNo);
        System.out.println("Largest digit in number is:"+largestNo);
    }
}
