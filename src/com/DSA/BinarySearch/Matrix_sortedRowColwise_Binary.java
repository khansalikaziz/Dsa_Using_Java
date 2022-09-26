package com.DSA.BinarySearch;

public class Matrix_sortedRowColwise_Binary {
    public static void main(String[] args) {
        int[][] arr={
                {2,4,6},
                {7,9,10},
                {12,14,16}
        };
        int[] ans=search(arr,49);
        System.out.print("Element fount at arr");
        for (int x:ans) {
            System.out.print("["+x+"]");
        }

    }
    static int[] search(int[][] matrix,int target){
        int r=0;
        int c= matrix.length-1;
        while (r< matrix.length && c>=0){
            if(matrix[r][c]==target){
                return  new int[]{r,c};
            }
            if (matrix[r][c]<target) {
                r++;
            }
            else{
                c--;
            }
        }
        return new int[]{-1,-1};
    }
}
