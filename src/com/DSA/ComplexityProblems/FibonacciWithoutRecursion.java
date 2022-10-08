package com.DSA.ComplexityProblems;

public class FibonacciWithoutRecursion {
    public static void main(String[] args) {
        for (int i=0;i<11;i++){
            System.out.println(fib(i));
        }

    }
    static int fib(int n){
        return (int) ((Math.pow((1+Math.sqrt(5))/2,n))*(1/Math.sqrt(5)));
    }
}
