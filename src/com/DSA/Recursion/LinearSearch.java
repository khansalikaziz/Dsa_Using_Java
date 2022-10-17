package com.DSA.Recursion;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr={3,1,7,7,2,4};
        System.out.println("Element found at "+linear(arr,7,0));
        System.out.println("Element found at "+lastIndexOf(arr,7,arr.length-1));
        findAllIndex(arr,7,0);
        System.out.println("All indexes are "+list);
        System.out.println("All indexes are "+findAllindexArrayList(arr,7,0));
    }
    static int linear(int[] arr,int ele,int ind){
        if(arr[ind]==ele){
            return ind;
        }
        if(ind==arr.length-1){
            return -1;
        }
        return linear(arr,ele,ind+1);
    }
    static int lastIndexOf(int[] arr,int ele,int ind){
        if(ind==-1){
            return -1;
        }
        if(arr[ind]==ele){
            return ind;
        }
        return lastIndexOf(arr,ele,ind-1);
    }
    static ArrayList<Integer> list=new ArrayList<>();
    static void findAllIndex(int[] arr,int ele,int ind){
        if (ind==arr.length){
            return;
        }
        if(arr[ind]==ele){
            list.add(ind);
        }
        findAllIndex(arr,ele,ind+1);

    }

    static ArrayList<Integer> findAllindexArrayList(int[] arr,int ele,int ind){
        ArrayList<Integer> li=new ArrayList<>();
        if(ind==arr.length){
            return li;
        }
        if(arr[ind]==ele){
            li.add(ind);
        }

        ArrayList<Integer> belowCalls= findAllindexArrayList(arr,ele,ind+1);
        li.addAll(belowCalls);
        return li;
    }

}
