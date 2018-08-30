package ru.minesweeper.viewmodel.cell;

import java.io.Serializable;

//Содержит значение и координаты ячейки для передачи во view
public class CellVM implements Serializable{
    private int x;
    private int y;
    private Integer value;

    public CellVM() {}

    public CellVM(int x, int y, Integer value) {
        this.setX(x);
        this.setY(y);
        this.setValue(value);
    }

    public CellVM(CellVM other){
        this(other.getX(),other.getY(),other.getValue());
    }

    public int getX() {return x;}

    public void setX(int x) {this.x = x;}

    public int getY() {return y;}

    public void setY(int y) {this.y = y;}

    public Integer getValue() {return value;}

    public void setValue(Integer value) {this.value = value;}
}