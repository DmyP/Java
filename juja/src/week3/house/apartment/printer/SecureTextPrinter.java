package ua.com.juja.apartment.printer;

import ua.com.juja.apartment.LivingApartment;

/**
 * Created by apofig on 2015-08-13.
 */
public class SecureTextPrinter implements Printer {

    @Override
    public String print(LivingApartment livingApartment) {
        String result = ""; // TODO implemnt me
        result += (livingApartment.isFree())?"is free":"is not free\n";
        return result;
    }


}
