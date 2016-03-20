package week3.house.staff;

import week3.house.apartment.Apartment;

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
