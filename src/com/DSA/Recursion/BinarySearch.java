package com.DSA.Recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        System.out.println(binary(arr,5,0,arr.length-1));
    }
    static int binary(int[] arr,int ele,int start,int end){
        if(start>end){
            return -1;
        }
        int mid=start+(end-start)/2;
           if(arr[mid]==ele){
                return mid;
            }
            if(ele<arr[mid]){
                return binary(arr,ele,start,mid-1);
            }
        return binary(arr,ele,mid+1,end);
    }
}
