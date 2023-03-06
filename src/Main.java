package com.bridgelabz;

import java.util.Arrays;
import java.util.Scanner;

public class SortArrayNumber {
    public static void main(String[] args) {
        int [] arr = {-2, -1, -4, 9, 7,8};
        System.out.println("Before Sorting :" + Arrays.toString(arr));

        for (int i=0; i< arr.length-1; i++){

            for(int j=0; j < arr.length-i-1; j++){

                if(arr[j] > arr[j+1]){

                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("After sorting :" + Arrays.toString(arr));

    }
}
