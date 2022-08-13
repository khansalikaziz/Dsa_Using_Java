package com.DSA;

public class Linear_Search {
    public static void main(String[] args) {
        int[] nums={23,45,1,2,8,19,-3,-11};
        int target=8;
        int result=linearSearch(nums,target);
        if(result==-1){
            System.out.println("Element "+target+" does not exist");
        }
        else {
            System.out.println("Element "+target+" found at "+result+" index");
        }

    }
    static int linearSearch(int[] arr,int target){
        if(arr.length==0){
            return -1;
        }
        for (int index=0;index<arr.length;index++){
            int element=arr[index];
            if(element==target){
                return index;
            }
        }
        return -1;
    }
}
