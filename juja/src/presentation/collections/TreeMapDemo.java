package presentation.collections;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        Map<MapKey, String> treeMap = new TreeMap<>();
        treeMap.put(new MapKey(2), "2");
        treeMap.put(new MapKey(1), "1");
    }
}
