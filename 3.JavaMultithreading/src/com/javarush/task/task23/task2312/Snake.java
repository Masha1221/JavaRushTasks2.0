package com.javarush.task.task23.task2312;

import java.util.ArrayList;
import java.util.List;

public class Snake {

    private List<SnakeSection> sections;
    private boolean isAlive;
    private SnakeDirection direction;
    private int x;
    private int y;

    public List<SnakeSection> getSections() {
        return sections;
    }

    public void setSections(List<SnakeSection> sections) {
        this.sections = sections;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public boolean isAlive(){
        return isAlive;
    }

    public void setDirection(SnakeDirection direction) {
        this.direction = direction;
    }

    public SnakeDirection getDirection() {
        return direction;
    }

    public Snake(int x, int y){
      sections = new ArrayList<SnakeSection>();
      isAlive = true;
      sections.add(new SnakeSection(x,y));
    }

    public int getX() {
        return sections.get(0).getX();
    }


    public int getY() {
        return sections.get(0).getY();
    }

    public  void  move(){

    }


}
