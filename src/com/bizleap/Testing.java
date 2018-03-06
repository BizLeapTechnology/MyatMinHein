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
        char character = 'a';
        int number = (int) character;
        System.out.println(number);


        System.out.println();
        System.out.println();


        System.out.println("-----------------------------");

        String name = "admin";
        for(int i=0; i<5; i++){
            char a1 = name.charAt(i);
            int a2 = (int) a1;
            System.out.println("The number is : "+a2);
        }

    }

}
