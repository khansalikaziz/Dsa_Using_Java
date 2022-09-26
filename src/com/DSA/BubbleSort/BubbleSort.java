package com.DSA.BubbleSort;
import java.util.Arrays;
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={5,1,9,2,3,10,6};
        System.out.println(Arrays.toString(bubble(arr)));
    }
    static int[] bubble(int[] arr){
        boolean swapped;
        int temp=0;
        for(int i=0;i< arr.length;i++){
            swapped=false;
            for (int j=1;j< arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                    swapped=true;
                }
            }
            if (!swapped){
                break;
            }
        }
        return arr;
    }
}
