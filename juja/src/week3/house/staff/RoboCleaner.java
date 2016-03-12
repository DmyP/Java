package ua.com.juja.staff;

import ua.com.juja.apartment.Apartment;

/**
 * Created by apofig on 2015-08-13.
 */
public class RoboCleaner implements Cleaner {

    private String nick;

    public RoboCleaner(String nick) {
        this.nick = nick;
    }

    public void clean(Apartment apartment) {
        System.out.println("RoBoBoBo " + nick + " Cleaning...");
        System.out.println("Done!");
    }
}
