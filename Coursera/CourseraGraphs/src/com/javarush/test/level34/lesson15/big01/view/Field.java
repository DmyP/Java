package com.javarush.test.level34.lesson15.big01.view;

import com.javarush.test.level34.lesson15.big01.controller.EventListener;

import javax.swing.*;
import java.awt.*;

public class Field extends JPanel{
    private View view;
    public EventListener eventListener;

    public void setEventListener(EventListener eventListener){
        this.eventListener = eventListener;
    }

    public Field(View view){
        this.view = view;
    }

    public void paint(Graphics g) {

    }
}
