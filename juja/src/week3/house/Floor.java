package week3.house;

import week3.house.apartment.Apartment;
import week3.house.apartment.LivingApartment;
import week3.house.apartment.TechnicalApartment;
import week3.house.apartment.printer.SecureTextPrinter;
import week3.house.apartment.printer.SimpleTextPrinter;
import week3.house.staff.Cleaner;

/**
 * Created by apofig on 2015-08-13.
 */
public class Floor {
    private static final int DEFAULT_APARTMENT_CAPACITY = 4;

    private int number;
    private Apartment[] apartments;
    private Cleaner cleaner;

    public Floor(int number, int apartmentsCount, NumberGenerator numbers) {
        this.number = number;

        this.apartments = new Apartment[apartmentsCount];
        this.apartments[0] = new TechnicalApartment(numbers.getNext());
        for (int index = 1; index < apartmentsCount; index++) {
            apartments[index] = new LivingApartment(numbers.getNext(), DEFAULT_APARTMENT_CAPACITY,
                    new SecureTextPrinter());
        }
    }

    public LivingApartment getFreeApartment() {
        for (Apartment apartment : apartments) {
            if (apartment instanceof LivingApartment && apartment.isFree()) {
                LivingApartment livingApartment = (LivingApartment) apartment;
                if (!livingApartment.isSettled()) {
                    cleaner.clean(apartment);
                }
                return livingApartment;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        String result = "============================\n";
        result += "Floor number " + number + "\n";
        result += "----------------------------\n";
        for (Apartment apartment : apartments) {
            result += apartment.toString() + "\n";
        }
        result += "============================\n";
        return result;
    }

    public void setCleaner(Cleaner cleaner) {
        this.cleaner = cleaner;
    }
}
