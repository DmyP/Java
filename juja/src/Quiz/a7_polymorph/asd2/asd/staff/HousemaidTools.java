package Quiz.a7_polymorph.asd2.asd.staff;

import Quiz.a7_polymorph.asd2.asd.Room;

public class HousemaidTools {

    public void clean(Room room) {
        System.out.println("Cleaning room " + room.toString() + " ...");
        sleep();
        System.out.println("Cleaning done!");
    }

    private void sleep() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

