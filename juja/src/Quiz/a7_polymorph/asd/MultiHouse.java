package Quiz.a7_polymorph.asd;

import Quiz.a7_polymorph.asd.apartment.LivingApartment;
import Quiz.a7_polymorph.asd.apartment.Apartment;
import Quiz.a7_polymorph.asd.staff.BadHousemaid;
import Quiz.a7_polymorph.asd.staff.Housemaid;

import java.util.Random;

public class MultiHouse {

    private static final int DEFAULT_FLOOR_CAPACITY = 4;
    private MyArray floors;

    public MultiHouse(int countFloors) {
        floors = new MyArray(countFloors);
        for (int i = 0; i < countFloors; i++) {
            Housemaid housemaid = findHousemaid();
            floors.set(i, new Floor(i + 1, DEFAULT_FLOOR_CAPACITY, housemaid));
            housemaid.setFloor((Floor)floors.get(i));
        }
    }

    private Housemaid findHousemaid() {
        if (new Random().nextBoolean()) {
            return new Housemaid();
        } else {
            return new BadHousemaid();
        }
    }

    public Object get(int number) {
        return floors.get(number - 1);
    }

    public String toString() {
        String result = "I am a MultiHouse with:\n";
        for (Object floor : floors.getArray()) {
            result += floor.toString();
        }
        return result;
    }

    public void settle(MyArray owners) {
        int ownerIndex = 0;

        while (true) {
            Apartment app = findFreeApartment();
            if (app.isFree() && app instanceof LivingApartment) {
                LivingApartment livingApartment = (LivingApartment)app; // TODO remove

                int capacity = livingApartment.getCapacity();
                for (int i = 0; i < capacity; i++) {
                    livingApartment.addOwner((Owner)owners.get(ownerIndex));
                    ownerIndex++;
                    if (ownerIndex >= owners.size()) {
                        return;
                    }
                }
            }
        }
    }

    private Apartment findFreeApartment() {
        for (Object object : floors.getArray()) {
            Floor floor = (Floor)object;
            Apartment app = floor.getFreeApartment();
            if (app != null) {
                return app;
            }
        }
        return null;
    }
}
