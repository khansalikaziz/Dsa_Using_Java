package com.DSA.BinarySearch;

import java.util.ArrayList;
import java.util.Collections;

public class ceiling {
    public static void main(String[] args) {
        int[] arr={2,3,5,9,14,16,18};
        int target=4;
        System.out.println("Output is :"+ceilingOfNumber(arr,target));
    }
    static int ceilingOfNumber(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        int mid=0;

        ArrayList<Integer> al=new ArrayList<>();
        while(!(start>end)){
            mid=(start+end)/2;
            if(arr[mid]==target){
                return arr[mid];
            } else if (target < arr[mid]) {
                al.add(arr[mid]);
                end=mid-1;
            }
            else {
                start=mid+1;
            }
        }
//        for (int i=0;i<= arr.length-1;i++){
//            if(arr[i]>target){
//                al.add(arr[i]);
//            }
//        }
        return (Collections.min(al));
    }
}
