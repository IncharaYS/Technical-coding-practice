package com.xworkz;
import java.util.Scanner;
import java.lang.Math;
public class PrimeNoInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to display all prime numbers up to it");
        int num = sc.nextInt();

        if (num <= 1) System.out.println("No prime numbers before 2");

        else printPrimeNo(num);
    }


    public static void printPrimeNo(int num) {
        System.out.println("Prime numbers until " + num + " are:");
        for (int i = 2; i <=num; i++) {
            if (isPrime(i)) System.out.print(i + " ");
        }
    }

    public static boolean isPrime(int no) {
        for (int i = 2; i <= Math.sqrt(no); i++) {
            if (no % i == 0) return false;
        }
        return true;
    }
}

