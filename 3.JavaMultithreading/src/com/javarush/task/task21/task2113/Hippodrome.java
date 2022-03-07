package com.javarush.task.task21.task2113;

import java.util.ArrayList;
import java.util.List;

public class Hippodrome {


    static Hippodrome game;


 static   List<Horse>horses = new ArrayList<>();
    public static void main(String[] args) throws InterruptedException {
        horses.add(new Horse("Bella", 3,0));
        horses.add(new Horse("Ogi", 3,0));
        horses.add(new Horse("Ops",3,0));
        game = new Hippodrome(horses);
        game.run();
        game.printWinner();
    }

    Hippodrome(List <Horse> horses){
        this.horses = horses;
    }

    public List<Horse> getHorses() {
        return horses;
    }

    public  void run() throws InterruptedException {

        int a =0;
        while (a<100){
            move();
            print();
            Thread.sleep(200);
            a++;
        }


        }


    public  void move(){
           for(Horse h : horses){
               h.move();
           }


    }

    public  void print(){
        for (Horse h : horses){
            h.print();

        }
               String a = "";
        int g = 0;
        while(g<10){
            System.out.println(a);
            g++;
        }
    }

    public Horse getWinner() {
        Horse result = horses.get(0);
        for (Horse horse : horses) {
            if (horse.getDistance() > result.getDistance())
                result = horse;
        }
        return result;
    }

    public void printWinner() {
        System.out.println("Winner is " + getWinner().getName() + "!");
    }



}

