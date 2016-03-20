package week3.house;

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
