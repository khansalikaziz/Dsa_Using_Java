package com.DSA.Recursion;

public class NumberExample {
    public static void main(String[] args) {
        //Write a function that takes in a number and prints it
        //print first 5 numbers: 1 2 3 4 5
//        print1(1,10);
//        System.out.println(factorial(5));
        System.out.println(fibonacci(7));

    }
    static void print1(int a,int n){
      if(a==n){
          System.out.println(n);
          return;
      }
      System.out.println(a);
      //Tail recursion
      print1(a+1,n);
    }
    static int factorial(int n){
        if(n==0){
            return 1;
        }else {
            return n*factorial(n-1);
        }

    }
    static int fibonacci(int n){
        if(n<=1){
            return n;
        }

        return fibonacci(n-1)+fibonacci(n-2);
    }

}
