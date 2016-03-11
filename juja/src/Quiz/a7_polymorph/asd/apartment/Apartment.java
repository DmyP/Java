package Quiz.a7_polymorph.asd.apartment;

import Quiz.a7_polymorph.asd.MyArray;

public abstract class  Apartment {

    protected int number;
    protected MyArray rooms;

    public Apartment(int number, int capacity) {
        this.number = number;
        rooms = new MyArray(capacity);
    }

    public String toString() {
        String apartmentType = this.getClass().getSimpleName();
        return "\t\tHi, I am an " + apartmentType + " #" + number + "\n";
    }

    public boolean isFree() {
        return false;
    }

    public MyArray getRooms() {
        return rooms;
    }

    public int getNumber() {
        return number;
    }
}
