package com.DSA.BinarySearch;

import java.util.ArrayList;

public class unique {
    static int count1(String str){
        ArrayList<String> al=new ArrayList<>();
        int duplicate=0;
        for (int i=0;i<str.length();i++){
            if (al.contains(String.valueOf(str.charAt(i)))){
                duplicate++;
            }
            al.add(String.valueOf(str.charAt(i)));

        }
        duplicate=duplicate+1;
        int ans=1;
        if(duplicate==0){
          int n=str.length();
          if (n==0 || n==1){
              ans=1;
          }
          else {
              for (int i=2;i<=n;i++){
                  ans*=i;
              }
          }

        }
        else {
            int dupAns=1;
            int n=str.length();
            if (n==0 || n==1){
                ans=1;
            }
            else {
                for (int i=2;i<=n;i++){
                    ans*=i;
                }


        }
            if (duplicate==0 || duplicate==1){
                dupAns=1;
            }
            else {
                for (int i=2;i<=duplicate;i++){
                    dupAns*=i;
                }


            }
        ans=ans/dupAns;

        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(count1("aBB"));
    }
}
