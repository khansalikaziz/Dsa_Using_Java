package com.DSA.LinearSearch;

public class SearchIn2dArray {
    public static void main(String[] args) {
        int[][] arr={
                {2,4,1},
                {18,12,3,9},
                {78,99,34,56},
                {18,12}
        };
        int target=9;
        int[] result=search(arr,target);
        if(result[0]==-1){
            System.out.println("Element "+target+" does not exist");
        }
        else {
            System.out.println("Element "+target+" found at index ["+result[0]+"]["+result[1]+"]");
        }

    }
    static int[] search(int[][] arr,int target){
        if(arr.length==0){
            return new int[]{-1};
        }
        for (int i=0;i< arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                if(arr[i][j]==target){
                     return new int[]{i,j};
                }
            }
        }
        return new int[]{-1};
    }

}
