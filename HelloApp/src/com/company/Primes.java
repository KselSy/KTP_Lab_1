package com.company;

public class Primes {
    public static void printPrimes(){
        for (int a = 2; a<=100; a++){
            if (IsPrime(a)) {
                System.out.print(a + " ");
            }
        }
    }
    public static boolean IsPrime(int n){
        boolean a = true;
        for(int i = 2 ; i < n ; i++ ){
            if (n % i == 0 && n / i != 1) {
                a = false;
                break;
            }
        }
        return a;
    }
}
