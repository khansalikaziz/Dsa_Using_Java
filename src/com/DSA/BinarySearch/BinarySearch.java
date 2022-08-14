package com.DSA.BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={110,89,67,45,32,18,7};
        int target=45;
        int result=BinarySearch(arr,target);
        if(result==-1){
            System.out.println("Element "+target+" not found");
        }
        else {
            System.out.println("Element "+target+" found at "+result+" index");
        }

    }
    static int BinarySearch(int[] arr,int target){
        int start=0,end=arr.length-1,mid=0;
        if(arr.length==0){
            return -1;
        }

         while (!(start>end)) {
//             mid = (start + end) / 2; may exceed limit of integer
             mid=start+((end-start)/2); //better way
             if (arr[mid] == target) {
                 return mid;
             } else if (target > arr[mid]) {
                 start = mid + 1;
             } else {
                 end = mid - 1;
             }

         }
        return -1;

    }
}
