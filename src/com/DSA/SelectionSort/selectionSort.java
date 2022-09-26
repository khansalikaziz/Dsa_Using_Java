package com.DSA.SelectionSort;

import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int[] arr={1,5,2,6,4};
        System.out.println(Arrays.toString(selectionsort(arr)));

    }
    static int[] selectionsort(int[] arr){
        for (int i=0;i<arr.length-1;i++){

            int min=minIndex(arr,i, arr.length-1);
            swap(arr,min,i);
        }
        return arr;
    }
    static int minIndex(int[] arr,int start,int last){
        int min=start;
        for (int i=start;i<=last;i++){
            if(arr[i]<arr[min]){
                min=i;
            }
        }
        return min;
    }
    static void swap(int[] arr,int first,int sec){
        int temp=arr[first];
        arr[first]=arr[sec];
        arr[sec]=temp;
    }
}
