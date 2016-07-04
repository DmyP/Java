package com.javarush.test.level34.lesson15.big01.model;

import java.awt.*;

public class Player extends CollisionObject implements Movable{
    public Player(int x, int y) {
        super(x, y);
    }

    @Override
    public void draw(Graphics graphics) {
        graphics.setColor(Color.GREEN);
        int upperLeftX = getX() - getWidth() / 2;
        int upperLeftY = getY() - getHeight() / 2;
        graphics.drawOval(upperLeftX, upperLeftY, getWidth(), getHeight());
        graphics.fillOval(upperLeftX, upperLeftY, getWidth(), getHeight());
    }

    @Override
    public void move(int x, int y) {
        this.setX(this.getX() + x);
        this.setY(this.getY() + y);
    }
}
