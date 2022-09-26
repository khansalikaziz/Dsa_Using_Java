package com.DSA.BinarySearch;

public class BinarySearchDescending {
    public static void main(String[] args) {
        int[] arr={98,97,94,86,83,75,43,36,24,19,10,5};
        int target=5;
        int result=Binarys(arr,target);
        if(result==-1){
            System.out.println("Element "+target+" not found");
        }
        else {
            System.out.println("Element "+target+" found at "+result+" index");
        }
    }
    static int Binarys(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        int mid=0;
        if(arr.length==0){
            return -1;
        }
else {


            while (!(start > end)) {
                mid = (start + end) / 2;
                if (arr[mid] == target) {
                    return mid;
                } else if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
