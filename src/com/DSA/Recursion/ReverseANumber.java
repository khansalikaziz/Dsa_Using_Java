package com.DSA.Recursion;

public class ReverseANumber {
    public static void main(String[] args) {
        rev(13042);
        //rev 1
        rev1(13042);
        System.out.println(sum);
        System.out.println(rev2(13042));

    }
    static int rev(int n){
         if(n<10){
             System.out.println(n);
             return n;
         }
        System.out.print(n%10);
         return rev(n/10);
    }
    static int sum=0;
    static void rev1(int n){
        if(n==0){
            return;
        }
        int rem=n%10;
        sum=sum*10+rem;
        rev1(n/10);
    }
    static int rev2(int n){
       int digits=(int)Math.log10(n)+1;
       return helperRev2(n,digits);
    }
    private static int helperRev2(int n,int digits){
        if(n<10){
            return n;
        }
        return (int) (((n%10)*(Math.pow(10,digits-1)))+helperRev2(n/10,digits-1));
    }
}


