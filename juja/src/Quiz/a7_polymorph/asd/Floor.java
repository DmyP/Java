package Quiz.a7_polymorph.asd;

import Quiz.a7_polymorph.asd.apartment.Apartment;
import Quiz.a7_polymorph.asd.apartment.LivingApartment;
import Quiz.a7_polymorph.asd.apartment.TechnicalApartment;
import Quiz.a7_polymorph.asd.staff.Housemaid;

public class Floor {

    private static final int DEFAULT_APARTMENT_CAPACITY = 5;

    private int number;
    private MyArray apartments;
    private Housemaid housemaid;

    public Floor(int number, int capacity, Housemaid housemaid) {
        this.number = number;
        this.housemaid = housemaid;
        apartments = new MyArray(capacity);
        apartments.set(0, new TechnicalApartment(NumberGenerator.next(), DEFAULT_APARTMENT_CAPACITY));
        for (int i = 1; i < capacity; i++) {
            apartments.set(i, new LivingApartment(NumberGenerator.next(), DEFAULT_APARTMENT_CAPACITY));
        }
    }

    public String toString() {
        String result = "\tHi, I am floor #" + number + " with:\n";
        for (Object apartment : apartments.getArray()) {
            result += apartment.toString() + "\n";
        }

//        for (int apartmentType : apartmentTypes) {
//            if (apartmentType == LIVING_APARTMENT) {
//                result +=  LivingApartment.toString();
//            } else if (apartmentType == QWE_APARTMENT) {
//                result +=  TechnicalApartment.toString();
//            } else if (apartmentType == ASD_APARTMENT) {
//                result +=  TechnicalApartment.toString();
//            } else if (apartmentType == sfddfsdL_APARTMENT) {
//                result +=  TechnicalApartment.toString();
//            } else if (apartmentType == TECHNICAL_APARTMENT) {
//                result +=  TechnicalApartment.toString();
//            } else if (apartmentType == TECHNICAL_APARTMENT) {
//                result +=  TechnicalApartment.toString();
//            } else if (apartmentType == TECHNICAL_APARTMENT) {
//                result +=  TechnicalApartment.toString();
//            }
//        }
        return result;
    }

    public Object[] getApartments() {
        return apartments.getArray();
    }

    public Apartment getFreeApartment() {
        for (Object object : apartments.getArray()) {
            Apartment apartment = (Apartment)object;
            if (apartment.isFree()) {
                housemaid.clean(apartment);
                return apartment;
            }
        }
        return null;
    }
}
