package com.DSA.cycleSort;

import java.util.Arrays;

public class Cyclicsort {
    public static void main(String[] args) {
        int[] arr={5,4,1,3,2};
        System.out.println(Arrays.toString(cyclicSort(arr)));
    }
    static int[] cyclicSort(int[] arr){
        int temp;
        for (int i=0;i< arr.length;i++){
            while ((arr[i]!=(arr[arr[i]-1]))){
                temp=arr[arr[i]-1];
                arr[arr[i]-1]=arr[i];
                arr[i]=temp;
            }

        }
        return arr;
    }
}
