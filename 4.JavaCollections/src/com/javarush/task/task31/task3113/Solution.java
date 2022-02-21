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


    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String dirName = reader.readLine();

        Path directory = Paths.get(dirName);

        if (!Files.isDirectory(directory)) {
            System.out.println(directory.toString() + " - не папка.");
        } else {
            AtomicInteger folderCounter = new AtomicInteger();
            AtomicInteger fileCounter = new AtomicInteger();
            AtomicLong sizeCounter = new AtomicLong();

            Files.walkFileTree(directory, new SimpleFileVisitor<Path>() {
                @Override
                public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
                    if (!dir.equals(directory)) folderCounter.incrementAndGet();
                    return FileVisitResult.CONTINUE;
                }

                @Override
                public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                    fileCounter.incrementAndGet();
                    sizeCounter.addAndGet(attrs.size());
                    return FileVisitResult.CONTINUE;
                }
            });

            System.out.println("Параметры папки " + directory.toString() + ":");
            System.out.println("Всего папок - " + folderCounter.get());
            System.out.println("Всего файлов - " + fileCounter.get());
            System.out.println("Общий размер - " + sizeCounter.get() + " байт");
        }





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

