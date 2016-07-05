package com.javarush.test.level34.lesson15.big01.model;

import java.nio.file.Path;
import java.util.HashSet;
import java.util.Set;

public class LevelLoader {
    private Path levels;

    public LevelLoader(Path levels) {
        this.levels = levels;
    }

    public GameObjects getLevel(int level){
        Player player;
        Set<Wall> walls = new HashSet<>();
        Set<Home> homes = new HashSet<>();
        Set<Box> boxes = new HashSet<>();
        player = new Player(40, 40);
        walls.add(new Wall(200, 200));
        walls.add(new Wall(180, 180));
        walls.add(new Wall(220, 220));
        homes.add(new Home(80, 80));
        boxes.add(new Box(240, 240));
        return new GameObjects(walls, boxes, homes, player);
    }
}
