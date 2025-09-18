package com.xworkz;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to find it's factorials");
        long num=sc.nextInt();

        if(num<0) {
            System.out.println("Cannot find factorial of negative number");
        }

       else {
            long factorial = findFactorial(num); //BigInteger datatype do not have range.
            System.out.println("Factorial of " + num + " by recursive method is:" + factorial);
            long factorial1 = findFactorialIterative(num);
            System.out.println("Factorial of " + num + " by iterative method is:" + factorial1);
        }
    }


    public static long findFactorial(long num){
        if(num==0||num==1) return 1;
        return num*findFactorial(num-1);
    }

    public static long findFactorialIterative(long num){
        long fact=1;
        for(int i=2;i<=num;i++){
            fact*=i;
        }
        return fact;
    }
}

