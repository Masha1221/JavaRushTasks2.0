package com.javarush.task.task39.task3906;

<<<<<<< HEAD
public class SecuritySystem {
=======
public class SecuritySystem implements Switchable{
>>>>>>> origin/master
    private boolean on = false;

    public boolean isOn() {
        return on;
    }

<<<<<<< HEAD
    void turnOff() {
=======
  public   void turnOff() {
>>>>>>> origin/master
        System.out.println("Turning off the SecuritySystem!");
        on = false;
    }

<<<<<<< HEAD
    void turnOn() {
=======
  public   void turnOn() {
>>>>>>> origin/master
        System.out.println("Turning on the SecuritySystem!");
        on = true;
    }
}
