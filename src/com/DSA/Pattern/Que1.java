package com.DSA.Pattern;

public class Que1 {
    public static void main(String[] args) {
       pattern1(4);
        System.out.println();
        pattern2(4);
        System.out.println();
        pattern3(4);
        System.out.println();
        pattern4(4);
        System.out.println();
        pattern5(4);
        System.out.println();
        pattern6(4);
    }

    static  void pattern1(int n){
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern2(int n){
        for (int i = 1 ; i <= n ; i++){
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern3(int n){
        for (int i=n;i>=1;i--){
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static  void pattern4(int n){
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    static void  pattern5(int n){
        int c=0;
        for (int i=1;i<=2*n+1;i++){
            if(i>n+1){
                c=10-i;
            }else {
                c=i;
            }

            for (int j=1;j<=c;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern6(int n){
        int skip=0;
        for (int i=1;i<=n;i++){
            skip=n-i;
            for (int j=1;j<=n;j++){
                if(j<=skip){
                    System.out.print("  ");
                }else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
