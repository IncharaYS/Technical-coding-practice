package com.xworkz;

import java.util.Scanner;

public class ArrayManipulationWithZeros {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size");
        int size= sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter "+size+" array elements to push zeros to end");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        sortArrayWithZero(arr);
    }

    public static void sortArrayWithZero(int[] arr) {
        int index = 0;
        for (int num:arr) {
            if (num!=0) {
                arr[index]=num;
                index++;
            }
        }
        while (index<arr.length) {
            arr[index++]=0;
        }

        for (int num : arr) {
            System.out.print(num +" ");
        }
    }
}
