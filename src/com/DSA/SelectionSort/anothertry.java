package com.DSA.SelectionSort;

import java.util.Arrays;

public class anothertry {
    public static void main(String[] args) {
        int[] arr={1,4,3,7,2};
        System.out.println(Arrays.toString(selec(arr)));
    }
    static int[] selec(int[] arr){
       int last;
        for (int i=0;i< arr.length;i++){
            last=arr.length-i-1;
            int maxIndex=getMaxIndex(arr,0,last);
            swap(arr,last,maxIndex);

        }
        return arr;
    }
    private static int getMaxIndex(int[] arr,int start,int last){
        int max=start;
        for (int i=start;i<=last;i++){
            if(arr[i]>arr[max]){
                max=i;
            }
        }
        return max;
    }

    static void swap(int[] arr,int first,int sec){
        int temp=arr[first];
        arr[first]=arr[sec];
        arr[sec]=temp;
    }
}
