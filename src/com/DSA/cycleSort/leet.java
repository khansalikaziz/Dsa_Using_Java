package com.DSA.cycleSort;

import java.util.Arrays;

class leet {
    public static void main(String[] args) {
        int[] arr={1,3,4,2,2};
        System.out.println(findDuplicate(arr));
    }
    public static int findDuplicate(int[] nums) {
        int i=0;
        int temp;
        while(i<nums.length){
            if(nums[i]<=nums.length && nums[i]!=nums[nums[i]-1]){
                temp=nums[nums[i]-1];
                nums[nums[i]-1]=nums[i];
                nums[i]=temp;
            }
            else{
                i++;
            }
        }

//        for(int j=0;j<nums.length;j++){
//            if(j+1 != nums[j]){
//                return j;
//            }
//        }
        return -1;
    }
}