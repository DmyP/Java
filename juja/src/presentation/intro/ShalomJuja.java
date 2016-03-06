package presentation.intro;

import java.util.ArrayList;
import java.util.List;

public class ShalomJuja {
    public static void main(String[] args) {
        System.out.println("Shalom JUJA");
    }

    public <T> List<T> xerox() {
        List<String> s = new ArrayList<String>();
        s.add("sdf");
        return (List<T>) s;
    }
}
