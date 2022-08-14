package com.DSA.LinearSearch;

public class ArrayMax2d {
    public static void main(String[] args) {
       int[][] arr={
            {2,6,8},
            {4,9,12,56},
               {34,78,103,42}
        };
       int result=max(arr);
       if(result==-1){
           System.out.println("Array is empty");
       }
       else {
           System.out.println("Maximum element is :"+result);
       }

    }

    static int max(int[][] arr){
        int temp=0;
        if(arr.length==0){
            return -1;
        }
        else {
            temp=arr[0][0];
            for (int i=0;i<arr.length;i++){
                for (int j=0;j<arr[i].length;j++){
                    if(arr[i][j]>temp){
                        temp=arr[i][j];
                    }
                }
            }
        }
        return temp;
    }

}
