package com.xworkz;

import java.util.Scanner;

public class StrCount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String");
        String str=sc.nextLine();

        countCharacters(str);
    }


    public static void countCharacters(String str){
        int vowels=0;
        int consonants=0;
        int digits=0;
        int whitespaces=0;

        str=str.toLowerCase();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);

            if(ch>='a'&&ch<='z'){
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                    vowels++;
                }
                else{
                    consonants++;
                }
            }
            else if (ch>='0'&&ch<='9'){
                digits++;
            }
            else if(ch==' ') {
                whitespaces++;
            }
        }

        System.out.println("No of vowels is:"+vowels);
        System.out.println("No of consonants is:"+consonants);
        System.out.println("No of digits is:"+digits);
        System.out.println("No of whitespaces is:"+whitespaces);
    }
}
