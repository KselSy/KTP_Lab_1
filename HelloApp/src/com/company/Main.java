package com.company;

import java.util.Scanner;

import static com.company.Primes.printPrimes;
import static com.company.Palindrome.isPalindrome;
public class Main {


    public static void main(String[] args) {
        System.out.println("Primes up to 100:");
        printPrimes();
        System.out.println();
        String a = "";
        String b = "stop";
        do {
            Scanner in = new Scanner(System.in);
            System.out.println("Input word, input stop to complete");
            a = in.next();
            if(a.equals(b)==false){
                boolean s = isPalindrome(a);
                System.out.println(s);
            }
        }
        while (a.equals(b)==false);
    }
}
