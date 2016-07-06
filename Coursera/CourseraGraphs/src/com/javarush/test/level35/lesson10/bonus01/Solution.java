package com.javarush.test.level35.lesson10.bonus01;

import java.io.File;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* ClassLoader - что это такое?
Реализуйте логику метода getAllAnimals.
Аргумент метода pathToAnimals - это абсолютный путь к директории, в которой хранятся скомпилированные классы.
Путь не обязательно содержит / в конце.
НЕ все классы наследуются от интерфейса Animal.
НЕ все классы имеют публичный конструктор без параметров.
Только для классов, которые наследуются от Animal и имеют публичный конструктор без параметров, - создать по одному объекту.
Добавить созданные объекты в результирующий сет и вернуть.
Метод main не участвует в тестировании.
*/
public class Solution {
    public static void main(String[] args) {
        Set<? extends Animal> allAnimals = getAllAnimals("C://pathToClasses/");
        System.out.println(allAnimals);
    }

    public static Set<? extends Animal> getAllAnimals(String pathToAnimals) {
        if (pathToAnimals == null) return null;
        if (!pathToAnimals.endsWith("/") && !pathToAnimals.endsWith("\\")) pathToAnimals += "/";

        Set<Animal> animals = new HashSet<>();
        File files = new File(pathToAnimals);

        List<Path> classFiles = pathParser(pathToAnimals);





        return null;
    }
    private static List<Path> walkFileTree(String pathToAnimals) {
        List<Path> files = new ArrayList<>();
        try {
            Files.walkFileTree(Paths.get(pathToAnimals), new SimpleFileVisitor<Path>() {
                @Override
                public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                    if (file.toString().endsWith(".class")) {
                        files.add(file);
                    }
                    return FileVisitResult.CONTINUE;
                }
            });

            return files;
        }
        catch (IOException e) {
            return null;
        }
        return null;
    }
    private static class MyClassLoader extends ClassLoader {
        private Set<Class> classes = new HashSet<>();
        public void loadClasses(List<Path> paths) {
            try {
                for (Path path: paths) {
                    byte[] bytes = Files.readAllBytes(path);
                    Class<?> defineClass = defineClass(null, bytes, 0, bytes.length);
                    this.classes.add(defineClass);
                }
            } catch (Exception e) {}
        }
        public Set<Class> getClasses() {
            return classes;
        }
    }


}
