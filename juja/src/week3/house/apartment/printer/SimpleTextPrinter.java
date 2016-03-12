package ua.com.juja.apartment.printer;

import ua.com.juja.apartment.LivingApartment;

/**
 * Created by apofig on 2015-08-13.
 */
public class SimpleTextPrinter implements Printer {

    @Override
    public String print(LivingApartment livingApartment) {
        String result = super.toString();
        String[] owners = livingApartment.getOwners();
        for (int index = 0; index < owners.length; index++) {
            String owner = owners[index];
            if (owner != null) {
                result += "**********\n";
                result += "Owner: " + owner.toString() + "\n";
                result += "**********\n";
            }
        }
        return result;
    }


}
