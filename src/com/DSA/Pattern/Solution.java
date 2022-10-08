package com.DSA.Pattern;
import java.util.*;
class Solution {
    public static void main(String[] args) {
        int[] nums={8,19,4,2,15,3};
        System.out.println(numDecodings("1"));
    }
    static int numDecodings(String s) {
        HashMap<String,Integer> hm=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(hm.containsKey(String.valueOf(s.charAt(i)))){
                hm.put(String.valueOf(s.charAt(i)),hm.get(String.valueOf(s.charAt(i)))+1);
            }
            else{
                hm.put(String.valueOf(s.charAt(i)),1);
            }
        }
        System.out.println(hm);
        int dup=0;int moreThanTwo=0;
        for (Map.Entry<String,Integer> mapElement : hm.entrySet()) {
            String key = mapElement.getKey();

            int value = (mapElement.getValue());
            if(value>1){
                dup+=(value);
            }
            if(Integer.parseInt(key)>2){
                moreThanTwo+=1;
            }
        }
        return ((s.length()*(s.length()-1))-dup-moreThanTwo);
    }
}
