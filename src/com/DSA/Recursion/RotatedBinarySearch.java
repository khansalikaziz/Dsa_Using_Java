package com.DSA.Recursion;

public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr={5,6,7,8,9,1,2,3};
        System.out.println(binary(arr,2,0,arr.length-1));
    }
    static int binary(int[] arr,int target,int start,int end){
        if(start>end){
            return -1;
        }
        int mid=start+(end-start)/2;
        if(arr[mid]==target){
            return mid;
        }

        if(arr[start]<=arr[mid]){
            if(target>=arr[start] && target<=arr[mid]){
                return binary(arr,target,start,mid-1);
            }
            else {
                return binary(arr,target,mid+1,end);
            }

        }
        if(target>=arr[mid] && target<=arr[end]){
            return binary(arr,target,mid+1,end);
        }
        else {
            return binary(arr,target,start,mid-1);
        }


    }
}
