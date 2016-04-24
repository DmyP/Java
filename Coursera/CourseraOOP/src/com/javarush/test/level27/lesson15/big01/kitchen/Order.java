package com.javarush.test.level27.lesson15.big01.kitchen;

import com.javarush.test.level27.lesson15.big01.Tablet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private Tablet tablet;
    private List<Dish> dishes;
    private List<Dish> orderedDishes;

    public Order(Tablet tablet) throws IOException {
        this.tablet = tablet;
        this.dishes = new ArrayList<>();
        this.orderedDishes = new ArrayList<>();
    }

    public Order() {

    }
}
