package com.javarush.test.level31.lesson15.big01;

import com.javarush.test.level31.lesson15.big01.command.ExitCommand;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.file.Paths;

public class Archiver {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите полный путь архива с клавиатуры включая имя файла");
        Paths paths = null;
        ZipFileManager zipFileManager = new ZipFileManager(paths.get(reader.readLine()));
        System.out.println("Введите полный путь файла для создания архива");
        zipFileManager.createZip(paths.get(reader.readLine()));
        reader.close();
        new ExitCommand().execute();



    }
}
