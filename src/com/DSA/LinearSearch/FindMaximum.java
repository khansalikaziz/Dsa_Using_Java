package com.DSA.LinearSearch;

public class FindMaximum {
    public static void main(String[] args) {
        int[] arr={120,67,34,65,39,87};
        System.out.println(max(arr));

    }
    static int max(int[] arr){
        int temp=-1;
        if(arr.length==0){
            return -1;
        }
        else {
            temp=arr[0];
            for(int i=1;i<arr.length;i++){
                if(arr[i]>temp){
                    temp=arr[i];
                }
            }
        }
        return temp;
    }
}
