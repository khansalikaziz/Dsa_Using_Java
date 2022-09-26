package com.DSA.BinarySearch;

public class Binary_search_in_2d_array {
    public static void main(String[] args) {
     int[][] arr={
             {12,16,90},
             {2,7,9},
             {9,87,100}
     };
     int ele=100;
     System.out.println(search(arr,ele));
    }
    static String search(int[][] arr,int ele){
        int n=arr.length;
        int mid=0; int start=0; int end=n-1;
        if(arr.length==0){
            return "-1";
        }
        for (int i=0;i<n;i++){
            start=0;end=arr[i].length-1;mid=0;
        while (!(start>end)){
        mid=(start+((end-start)/2));
            if(arr[i][mid]==ele){
                return String.valueOf(ele+" found at arr["+i+"]["+mid+"]");
            } else if (arr[i][mid]<ele) {
                 start=mid+1;
            } else if (arr[i][mid]>ele) {
                end=mid-1;
            }
            }

        }
        return "-1";
    }
}
