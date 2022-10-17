package com.DSA.Pattern;

import java.util.HashMap;
class romanToint {
    public static void main(String[] args) {
        System.out.println(roman("MCMXCIV"));
    }
    static int roman (String s) {
        HashMap<String,Integer> hm=new HashMap<>();
        hm.put("I",1);
        hm.put("V",5);
        hm.put("X",10);
        hm.put("L",50);
        hm.put("C",100);
        hm.put("D",500);
        hm.put("L",1000);

        int ans=0;


        for(int i=0;i<s.length();i++){
            if(hm.containsKey(String.valueOf(s.charAt(i)))){
                int temp=hm.get(String.valueOf(s.charAt(i)));
                if(4*temp<ans) {
                    ans-=temp;

                }
                else {
                    ans+=temp;
                }
            }
//            System.out.println(String.valueOf(s.charAt(i)));
        }
        return ans;
    }
}