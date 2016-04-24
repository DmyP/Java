package com.javarush.test.level27.lesson15.big01;

import com.javarush.test.level27.lesson15.big01.kitchen.Order;

import java.io.IOException;

public class Tablet {
    private final int number;

    public Tablet(int number) {
        this.number = number;
    }
    public void createOrder() throws IOException {
        Order order = new Order();
    }
}
