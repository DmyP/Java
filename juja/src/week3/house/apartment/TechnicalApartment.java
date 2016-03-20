package week3.house.apartment;

import week3.house.equpment.Bucket;
import week3.house.equpment.Equipment;
import week3.house.equpment.Extinguisher;
import week3.house.equpment.Swob;

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
