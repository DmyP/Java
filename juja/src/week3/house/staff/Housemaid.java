package ua.com.juja.staff;

import ua.com.juja.Owner;
import ua.com.juja.apartment.Apartment;

/**
 * Created by apofig on 2015-08-13.
 */
public class Housemaid extends Owner implements Cleaner {

    public Housemaid(String name) {
        super(name);
    }

    public void clean(Apartment apartment) {
        System.out.println("Cleaning apartment " + apartment.getNumber());
        System.out.println("Cleaning done by " + name);
    }
}
