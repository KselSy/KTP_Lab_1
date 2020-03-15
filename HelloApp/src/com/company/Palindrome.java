package com.company;

public class Palindrome {
    public static String reverseString(String s){
        String revers = "";
        for (int i = s.length()-1; i >= 0 ; i--){
            revers += s.charAt(i);
        }
        return revers;
    }
    public static boolean isPalindrome(String s){
        boolean a = false;
        if (s.equals(reverseString(s))){
            a = true;
        }
        return a;
    }
}
    //java Palindrome madam racecar apple kayak song noon
