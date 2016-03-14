package ua.com.juja.apartment;

import ua.com.juja.equpment.Bucket;
import ua.com.juja.equpment.Equipment;
import ua.com.juja.equpment.Extinguisher;
import ua.com.juja.equpment.Swob;

import java.util.Arrays;

/**
 * Created by apofig on 2015-08-13.
 */
public class TechnicalApartment extends Apartment {

    private Equipment[] equipments;

    public TechnicalApartment(int number) {
        super(number);
        equipments = new Equipment[10];
        equipments[0] = new Extinguisher();
        equipments[1] = new Bucket();
        equipments[2] = new Swob();
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "With objects: " + Arrays.toString(equipments);
    }
}
