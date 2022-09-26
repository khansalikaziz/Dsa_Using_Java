package com.DSA.BinarySearch;

import java.util.ArrayList;

public class stringex {
    static void primeFactorization(int n){
        int i=2;
        int temp=n;
        while (i<=n){
            if(temp%i==0){
                temp=temp/i;
                System.out.println(i);
            }
            else {
                i++;
            }
        }
    }
    public static void main(String[] args) {
        primeFactorization(20);
    }
}
