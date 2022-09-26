package com.DSA.InsertionSort;

import java.util.Arrays;

public class insertionSort {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        System.out.println(Arrays.toString(insertion(arr)));

    }
    static int[] insertion(int[] arr){

        for(int i=0;i< arr.length-1;i++){
            int j=i+1;
            while (j>0){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    j=j-1;
                }
                else {
                    break;
                }
            }
        }
        return arr;
    }
}
