package ua.com.juja.apartment;

/**
 * Created by apofig on 2015-08-13.
 */
public abstract class Apartment {

    private int number;

    public Apartment(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " number " + number + "\n";
    }

    public boolean isFree() {
        return false;
    }

    public int getNumber() {
        return number;
    }
}
