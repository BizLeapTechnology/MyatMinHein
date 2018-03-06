package com.bizleap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by M2h_Laptop on 2/7/2018.
 */
public class Testing {
    public static void main(String[] args) {


    }

    public void NonDuplicate() {
        int[] arr = {0, 1, 2, 3, 4, 3, 5, 6, 4, 7, 8, 7, 8, 8};

        for(int i=0; i<arr.length;i++){
            for(int j=i+1; j<arr.length;j++){
                if(arr[i] == arr[j]){
                    System.out.println("Number: "+arr[i]+" found repeating at position: "+i+" , repeated at position "+j);
                }
            }
        }

    }
}
