package Quiz.a7_polymorph.asd2.asd.apartment;

import Quiz.a7_polymorph.asd2.asd.staff.HousemaidTools;

public class TechnicalApartment extends Apartment {

    private HousemaidTools tools;

    public TechnicalApartment(int number, int capacity) {
        super(number, capacity);
        tools = new HousemaidTools();
    }

    public HousemaidTools getTools() {
        return tools;
    }
}
