package com.DSA.StringStringBuilder;

public class palindrome {
    public static void main(String[] args) {
        String s=null;

        System.out.println("String "+s+" is Palindrome :"+palindrome_conventional(s));
        System.out.println("String "+s+" is Palindrome :"+palindrome_with_sb(s));
    }
    static boolean palindrome_with_sb(String s){
        if(s!=null){
            s=s.trim();
            StringBuilder sb=new StringBuilder(s);

            sb=sb.reverse();
            if(s.length() ==0 ||String.valueOf(sb).equals(s)){
                return true;
            }

        }
        else if(s==null){
            return true;
        }

        return false;
    }
    static boolean palindrome_conventional(String s){
        if(s==null){
            return true;
        }
        String s1="";
        for (int i=s.length()-1;i>=0;i--){
            s1=s1+String.valueOf(s.charAt(i));
        }
        if (s1.equals(s)){
            return true;
        }
        return false;
    }
}
