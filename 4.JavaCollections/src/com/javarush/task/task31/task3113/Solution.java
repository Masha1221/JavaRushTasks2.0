package com.javarush.task.task31.task3113;

import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Stream;

/* 
Что внутри папки?
*/

public class Solution {
    static int counter = 0;
    static int dirCounter = 0;
    public static void main(String[] args) throws IOException {

        Scanner s = new Scanner(System.in);

        String wayToFolder = s.nextLine();
        // wayToFolder путь к папке



        Path path = Paths.get(wayToFolder);
        // получаем из переданной строки файл
        // файл типа Path
        if ( !Files.isDirectory(path)){
            System.out.println(path.toAbsolutePath() + " - не папка");

            return;// выходим из метода
        }



       long file =  new File(wayToFolder).listFiles().length;
            System.out.println("Всего папок -" +" " + file);
        }



    }

