package com.xworkz;

import java.util.Scanner;

public class PrimeNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to check if it's prime");
        int num=sc.nextInt();

        if(checkPrime(num)){
            System.out.println(num+" is a prime number");
        }
        else System.out.println(num+" is not a prime number");
    }


    public static boolean checkPrime(int num1){
       if(num1<2) return false;
       for(int i=2;i<=Math.sqrt(num1);i++){
           if(num1%i==0) return false;
       }
       return true;
    }
}

