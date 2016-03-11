package Quiz.a7_polymorph.asd.staff;

public class HousemaidTools {

    public void clean(Object room) {
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

