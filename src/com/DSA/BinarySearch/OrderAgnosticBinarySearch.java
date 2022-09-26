package com.DSA.BinarySearch;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr={77,76,73,67,65,64,55,40};
        int target=67;
        int result=orderAgnostic(arr,target);
        if (result==-1){
            System.out.println("Element "+target+" not found");
        }
        else {
            System.out.println("Element "+target+" found at "+result+" index");
        }

    }
    static int orderAgnostic(int[] arr,int target){
        int start=0,end= arr.length-1,mid=0;
        //Array is empty
        if (arr.length==0){
            return -1;
        }
        //Array  is Descending
        else if (arr[0]>arr[arr.length-1]) {
            System.out.println("Desc");
            while (!(start>end)){
                mid=(start+end)/2;
                if (target==arr[mid]) {
                    return mid;
                }
                else if(target > arr[mid]){
                    end=mid-1;
                }
                else {
                    start=mid+1;
                }
            }


        }
        //Array is Ascending
        else if (arr[0]< arr[arr.length-1]) {
            System.out.println("Asc");
            while (!(start>end)){
                mid=(start+end)/2;
                if (target==arr[mid]){
                    return mid;
                } else if (target>arr[mid]) {
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }

            }

        }
        //All elements are equal
        else if (arr[0]==arr[arr.length-1]) {
            return 0;
        }
        return -1;
    }
}
