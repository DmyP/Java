package Quiz.a7_polymorph.asd2.asd;

import Quiz.a7_polymorph.asd2.asd.apartment.Apartment;

public class Room /* extends Object */{
    private Apartment apartment;
    private RoomType type;
    private MyArray objects; // TODO implement me

    public Room(RoomType type, Apartment apartment) {
        this.apartment = apartment;
        objects = new MyArray(1000);
        this.type = type;
    }

    @Override
    public String toString() {
        return "room " + type + " of ap#" + apartment.getNumber();
    }
}
