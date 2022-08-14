package com.DSA.LinearSearch;

public class LinearSearchString {
    public static void main(String[] args) {
        String str="Salik";
        char target='l';
        int result=LinearSearchString(str,target);
        if(result==-1){
            System.out.println("Character -:"+target+" does not exist");
        }
        else {
            System.out.println("Character -:"+target+" found at "+result+" index");
        }

    }
    static int LinearSearchString(String arr,char target){
        if(arr.length()==0){
            return -1;
        }
        for (int index=0;index<arr.length();index++){
            if (arr.charAt(index) == target){
                return index;
            }
        }
        return -1;
    }
}
