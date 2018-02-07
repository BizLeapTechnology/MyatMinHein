package com.bizleap;

import java.io.File;
import java.io.IOException;

/**
 * Created by M2h_Laptop on 1/15/2018.
 */
public class Assignment_Two_Recursive {
    public static void main(String args[]) {
        File currentDir = new File("."); // current directory
        displayDirectoryContents(currentDir);
    }

    public static void displayDirectoryContents(File dir) {
        try {
            File[] files = dir.listFiles();
            for (File file : files) {
                if (file.isDirectory()) {
                    System.out.println("directory:" + file.getCanonicalPath());
                    displayDirectoryContents(file);
                } else {
                    System.out.println("     file:" + file.getCanonicalPath());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}