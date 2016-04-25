package com.javarush.test.level27.lesson15.big01;

import com.javarush.test.level27.lesson15.big01.kitchen.Dish;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class ConsoleHelper {
    private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void writeMessage(String message) {
        System.out.println(message);
    }

    public static String readString() throws IOException {
        return reader.readLine();
    }

    public static List<Dish> getAllDishesForOrder() throws IOException {
        List<Dish> list = new ArrayList<>();
        writeMessage("Enter dish...(" + Dish.allDishesToString() + ")");
        String s = "";
        while (true) {
            s = readString();
            if ("exit".equalsIgnoreCase(s)) {
                break;
            }

            try {
                list.add(Dish.valueOf(s));
            }
            catch (IllegalArgumentException e) {
                ConsoleHelper.writeMessage(s + " is not detected");
            }
        }
        return list;
    }
}
