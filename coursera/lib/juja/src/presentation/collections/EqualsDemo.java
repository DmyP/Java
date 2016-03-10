package presentation.collections;

import java.util.ArrayList;
import java.util.List;

public class EqualsDemo {
    public static void main(String[] args) {

        List list = new ArrayList();
        Element element = new Element();
        list.add(element);
        Element element1 = new Element();
        list.add(element1);
        System.out.println(list);
        System.out.println(list.contains(element));
        System.out.println(list.remove(element1));
        System.out.println(list.remove(0));

    }
}

