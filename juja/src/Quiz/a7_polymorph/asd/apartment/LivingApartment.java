package Quiz.a7_polymorph.asd.apartment;

import Quiz.a7_polymorph.asd.Owner;
import Quiz.a7_polymorph.asd.Room;
import Quiz.a7_polymorph.asd.RoomType;

/**
 * Created by indigo on 31.07.2015.
 */
public class LivingApartment extends Apartment {

    private Owner[] owners;
    private int capacity;

    public LivingApartment(int number, int countRooms) {
        super(number, countRooms);
        capacity = countRooms - 3;
        owners = new Owner[capacity];

        rooms[0] = new Room(RoomType.TOILET, this);
        rooms[1] = new Room(RoomType.KITCHEN, this);
        rooms[2] = new Room(RoomType.LIVING_ROOM, this);

        for (int i = 3; i < countRooms; i++) {
            rooms[i] = new Room(RoomType.BEDROOM, this);
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
        owners[i] = owner;
        System.out.println("Add owner " + owner + " to living apartment");
    }

    private int nextIndex() {
        for (int i = 0; i < owners.length; i++) {
            if (owners[i] == null) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        String result = super.toString();
        result += "\t\tMy capacity is:" + capacity + " with owners:\n";
        for (Owner owner : owners) {
            if (owner != null) {
                result += "\t\t\t" + owner.toString() + "\n";
            }
        }
        result += "\t\tMy free status is:" + isFree()+ "\n";
        return result;
    }
}
