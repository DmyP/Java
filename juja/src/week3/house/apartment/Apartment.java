package week3.house.apartment;

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
