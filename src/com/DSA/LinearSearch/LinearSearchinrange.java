package com.DSA.LinearSearch;

public class LinearSearchinrange {
    public static void main(String[] args) {
        int[] arr={1,4,5,2,6,7};
        int target=2;
        int start=2;
        int end=5;
        int result=LinearSearchInRange(arr,target,start,end);
        if(result==-1){
            System.out.println("Element "+target+" does not exist");
        }
        else {
            System.out.println("Element "+target+" found at "+result+" index");
        }

    }
    static int LinearSearchInRange(int[] arr,int target,int start,int end){
        if(arr.length==0){
            return -1;
        }
        for (int i=start;i<=end;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}
