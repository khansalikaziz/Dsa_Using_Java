package com.DSA.LinearSearch;

public class FindMinimum {
    public static void main(String[] args) {
        int[] arr={-8,12,-7,3,14,28};
        System.out.println(min(arr));
    }
    static int min(int[] arr){
        int temp=-1;
        if(arr.length==0){
            return -1;
        }
        else {
            temp=arr[0];
            for (int i=1;i<arr.length;i++){
                if(arr[i]<temp){
                    temp=arr[i];
                }
            }
        }
        return temp;
    }
}
