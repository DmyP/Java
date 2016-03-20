package week3.house.apartment.printer;

import week3.house.apartment.LivingApartment;

public class SecureTextPrinter implements Printer {

    @Override
    public String print(LivingApartment livingApartment) {
        String result = "";
        result += (livingApartment.isFree())?"is free":"is not free\n";
        return result;
    }


}
