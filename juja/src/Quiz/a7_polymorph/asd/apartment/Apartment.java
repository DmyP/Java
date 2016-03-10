package Quiz.a7_polymorph.asd.apartment;

import Quiz.a7_polymorph.asd.Room;

public abstract class Apartment {

    protected int number;
    protected Room[] rooms;

    public Apartment(int number, int capacity) {
        this.number = number;
        rooms = new Room[capacity];
    }

    public String toString() {
        String apartmentType = this.getClass().getSimpleName();
        return "\t\tHi, I am an " + apartmentType + " #" + number + "\n";
    }

    public boolean isFree() {
        return false;
    }

    public Room[] getRooms() {
        return rooms;
    }

    public int getNumber() {
        return number;
    }
}
