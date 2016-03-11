package Quiz.a7_polymorph.asd.apartment;

import Quiz.a7_polymorph.asd.MyArray;
import Quiz.a7_polymorph.asd.Owner;
import Quiz.a7_polymorph.asd.Room;
import Quiz.a7_polymorph.asd.RoomType;

public class LivingApartment extends Apartment {

    private MyArray owners;
    private int capacity;

    public LivingApartment(int number, int countRooms) {
        super(number, countRooms);
        capacity = countRooms - 3;
        owners = new MyArray(capacity);

        rooms.set(0, new Room(RoomType.TOILET, this));
        rooms.set(1, new Room(RoomType.KITCHEN, this));
        rooms.set(2, new Room(RoomType.LIVING_ROOM, this));

        for (int
             i = 3; i < countRooms; i++) {
            rooms.set(i, new Room(RoomType.BEDROOM, this));
        }
    }

    @Override
    public boolean isFree() {
        return nextIndex() != -1;
    }

    public int getCapacity() {
        return capacity;
    }

    public void addOwner(Owner owner) {
        int i = nextIndex();
        if (i == -1) {
            throw new RuntimeException("LivingApartment is full!");
        }
        owners.set(i,  owner);
        System.out.println("Add owner " + owner + " to living apartment");
    }

    private int nextIndex() {
        for (int i = 0; i < owners.size(); i++) {
            if (owners.get(i) == null) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        String result = super.toString();
        result += "\t\tMy capacity is:" + capacity + " with owners:\n";
        for (Object owner : owners.getArray()) {
            if (owner != null) {
                result += "\t\t\t" + owner.toString() + "\n";
            }
        }
        result += "\t\tMy free status is:" + isFree()+ "\n";
        return result;
    }
}
