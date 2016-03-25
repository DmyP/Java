package week2.sorting;

import java.util.HashMap;
import java.util.Map;

public class Statistic {

    private Map<Operations, Integer> map = new HashMap<Operations, Integer>();

    public String print() {
        return map.toString();
    }

    public void inc(Operations key) {
        init(key);

        map.put(key, map.get(key) + 1);
    }

    private void init(Operations key) {
        if (!map.containsKey(key)) {
            map.put(key, 0);
        }
    }

    public int get(Operations key) {
        init(key);

        return map.get(key);
    }
}
