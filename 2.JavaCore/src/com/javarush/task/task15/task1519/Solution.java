package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напиште тут ваш код
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
    while(s != "exit"){
        if (s == ".") {
            print(45);
        }
        Short s2 = Short.valueOf(s);
            if (s2 >0 &&  s2< 128){
                print(14);
        }
            Integer a = Integer.valueOf(s);
                if (a>= 0 || a>=128){
                    print(12);
                }
                else print("4");
    }


    }

    

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
