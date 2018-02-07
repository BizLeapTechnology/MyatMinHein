package com.bizleap;

import java.io.File;

/**
 * Created by M2h_Laptop on 1/15/2018.
 */
public class Assignment_Two {
    public static void main(String a[]) {
        File file = new File("C:/");
        File ff = new File("C:/");
        File[] files = file.listFiles();
        File[] fif = ff.listFiles();
        for (File f : files) {

            System.out.println(f.getName());


        }
        System.out.println("---------------------");
        for (File fn : fif) {

            System.out.println(fn.getName());
        }
    }
}
