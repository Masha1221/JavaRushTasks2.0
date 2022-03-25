package com.javarush.task.task25.task2504;

/* 
Switch для нитей
*/

public class Solution {
    public static void processThreads(Thread... threads) {
        //implement this method - реализуйте этот метод
        for (Thread s : threads) {
            switch (s.getState()) {
                case NEW:
                    s.start();
                    break;
                case WAITING:
                case TIMED_WAITING:
                case BLOCKED:
                    s.interrupt();
                    break;
                case RUNNABLE:
                    s.isInterrupted();
                    break;
                case TERMINATED:
                    System.out.println(s.getPriority());
            }
        }
    }
    public static void main(String[] args) {
    }
}
