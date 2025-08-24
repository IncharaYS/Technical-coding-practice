package com.xworkz;
import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of terms to generate in the Fibonacci series.");
        int num=sc.nextInt();

        if(num<=0) System.out.println("Enter a positive number");

        else {
            generateFibSeries(num);
            System.out.println();

            System.out.print("Fibonacci series up to " + num + " terms using recursion is:");
            for (int i=0; i<num; i++) {
                System.out.print(generateFibTerm(i) + " ");
            }
        }
    }


    public static void generateFibSeries(int num){
        int fib0=0;
        int fib1=1;
            System.out.print("Fibonacci series up to "+num+" terms using for loop is:");
            for(int i=0;i<num;i++){
                System.out.print(fib0+" ");
                int next=fib0+fib1;
                fib0=fib1;
                fib1=next;
        }
    }

    public static int generateFibTerm(int num){
        if(num==0) return 0;
        if(num==1) return 1;
        return generateFibTerm(num-2)+generateFibTerm(num-1);
    }
}
