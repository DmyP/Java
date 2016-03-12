package ua.com.juja;

/**
 * Created by apofig on 2015-08-13.
 */
public class Owner {

    protected final String name;

    public Owner(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Owner: " + name;
    }
}
