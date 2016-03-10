package presentation.collections;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("key1", "value1");
        map.put("key2", "value2");
        System.out.println(map);
        map.put("key1", "value1`");
        System.out.println(map);

        Map<String, String> map1 = new HashMap<String, String>();
        map1.put("key2", "value2`");
        map1.put("key3", "value2");
        map1.putAll(map);
        System.out.println(map1);

        System.out.println("Printing keys of map1");
        System.out.println(map1.keySet());

        System.out.println("printing values of map1");
        System.out.println(map1.values());

    }
}
