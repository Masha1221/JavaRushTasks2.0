package com.javarush.task.pro.task15.task1516;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/* 
Файл или директория
*/

public class Solution {
    private static final String THIS_IS_FILE = " - это файл";
    private static final String THIS_IS_DIR = " - это директория";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            String fileName1 = scanner.nextLine();

            if (fileName1.isEmpty()) {
                break;
            }

            if (Files.isRegularFile(Path.of(fileName1))) {
                System.out.println(Path.of(fileName1) + THIS_IS_FILE);
            } else if (Files.isDirectory(Path.of(fileName1))) {
                System.out.println(Path.of(fileName1) + THIS_IS_DIR);
            }
            else break;
        }





    }
}


