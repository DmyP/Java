package week3.house.staff;

import week3.house.Owner;
import week3.house.apartment.Apartment;

public class Housemaid extends Owner implements Cleaner {

    public Housemaid(String name) {
        super(name);
    }

    public void clean(Apartment apartment) {
        System.out.println("Cleaning apartment " + apartment.getNumber());
        System.out.println("Cleaning done by " + name);
    }
}
