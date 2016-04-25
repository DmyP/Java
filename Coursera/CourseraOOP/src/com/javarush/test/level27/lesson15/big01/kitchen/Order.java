package com.javarush.test.level27.lesson15.big01.kitchen;

import com.javarush.test.level27.lesson15.big01.ConsoleHelper;
import com.javarush.test.level27.lesson15.big01.Tablet;

import java.io.IOException;
import java.util.List;

public class Order {

    private Tablet tablet;
    private List<Dish> dishes;

    public Order(Tablet tablet) throws IOException {
        this.tablet = tablet;
        dishes = ConsoleHelper.getAllDishesForOrder();
    }
    public boolean isEmpty(){
        return dishes.isEmpty();
    }

    public int getTotalCookingTime(){
        int duration = 0;
        for (int i = 0; i < dishes.size(); i++) {
            duration += dishes.get(i).getDuration();
        }
        return duration;
    }


    @Override
    public String toString() {
        return dishes.isEmpty() ? "": "Your order: " + dishes + " of " + tablet;
    }
}
