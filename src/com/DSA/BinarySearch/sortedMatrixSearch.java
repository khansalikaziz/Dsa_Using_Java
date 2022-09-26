package com.DSA.BinarySearch;

import java.util.Arrays;

public class sortedMatrixSearch {
    public static void main(String[] args) {

        int[][] matrix={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println(Arrays.toString(search(matrix,7)));
    }

    //search in the row provided between the columns provided
    static int[] binarySearch(int[][] matrix,int row,int colStart,int colEnd,int target){
        while (colStart<=colEnd){
            int mid=colStart+(colEnd-colStart)/2;

            if(matrix[row][mid]==target){
                return new int[]{row,mid};
            } else if (matrix[row][mid]>target) {
                colEnd=mid-1;
            } else if (matrix[row][mid]<target) {
                colStart=mid+1;
            }

        }
        return new int[]{-1,-1};
    }

    static int[] search(int[][] matrix,int target){
        int rows= matrix.length;
        int cols= matrix[0].length; // matrix may be empty

        //if only one row is available
        if (rows == 1){
            return binarySearch(matrix,0,0,cols,target);
        }

        //run the loop till row 2 are remaining
        int rstart=0;
        int rend=rows-1;
        int cmid=cols/2;
        while (rstart < (rend-1)){
            int mid=rstart+(rend-rstart)/2;

            if(matrix[mid][cmid]==target){
                return new int[]{mid,cmid};
            }
            if (matrix[mid][cmid]<target){
                rstart=mid;
            }
            if (matrix[mid][cmid]>target){
                rend=mid;
            }
        }
        // now we have two rows
        // check whether target is in the col of two rows

        if(matrix[rstart][cmid]==target){
            return new int[]{rstart,cmid};
        }
        if (matrix[rstart+1][cmid] == target){
            return new int[]{rstart+1,cmid};
        }

        // search in first half
        if (target<=matrix[rstart][cmid-1]){
            return binarySearch(matrix,rstart,0,cmid-1,target);
        }
        // search in second half
        if (target>=matrix[rstart][cmid+1] && target <= matrix[rstart][cols-1]){
            return  binarySearch(matrix,rstart,cmid+1,cols-1,target);
        }
        // search in third half
        if (target<=matrix[rstart+1][cmid-1]){
            return  binarySearch(matrix,rstart+1,0,cmid-1,target);
        }
        // search in 4th half
        if (target>=matrix[rstart+1][cmid+1]){
            return  binarySearch(matrix,rstart+1,cmid+1,cols-1,target);

        }

        return new int[]{-1,-1};
    }
}
