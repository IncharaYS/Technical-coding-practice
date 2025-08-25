package com.xworkz;
import java.util.Scanner;

public class StringReversal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string to reverse it");
        String str=sc.nextLine();

        System.out.println("Reverse of string:"+str+" is:"+reverseString(str));
    }


    public static String reverseString(String str){
        //StringBuilder rev = new StringBuilder(str);
        //return rev.reverse().toString();
        String rev="";
        for(int i=str.length()-1;i>=0;i--){
           rev=rev+str.charAt(i);
        }
        return rev;
    }
}
