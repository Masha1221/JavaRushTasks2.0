package com.javarush.task.task39.task3906;

<<<<<<< HEAD
public class LightBulb {
=======
public class LightBulb implements Switchable{
>>>>>>> origin/master
    private boolean on = false;

    public boolean isOn() {
        return on;
    }

<<<<<<< HEAD
    void turnOff() {
=======
public void turnOff() {
>>>>>>> origin/master
        System.out.println("The light is off!");
        on = false;
    }

<<<<<<< HEAD
    void turnOn() {
=======
    public void turnOn() {
>>>>>>> origin/master
        System.out.println("The light is on!");
        on = true;
    }
}
