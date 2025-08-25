package com.xworkz;
import java.util.Scanner;

public class AverageOfNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbers of Numbers you want to enter");
        int n=sc.nextInt();

        if (n<=0) System.out.println("Enter a positive number");

        else {
            System.out.println("Average of entered numbers is:" + findAvg(n,sc));
        }
    }


    public static double findAvg(int n,Scanner sc){
        int sum=0;
        System.out.println("Enter the numbers:");
        for (int i=0;i<n;i++){
            int num=sc.nextInt();
            sum=sum+num;
        }
        return (double) sum/n;
    }
}
