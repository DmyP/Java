package Quiz.a7_polymorph.asd.staff;

import Quiz.a7_polymorph.asd.Floor;
import Quiz.a7_polymorph.asd.Room;
import Quiz.a7_polymorph.asd.apartment.Apartment;
import Quiz.a7_polymorph.asd.apartment.TechnicalApartment;

public class Housemaid {

    private HousemaidTools tools;
    private Floor floor;

    public void clean(Apartment apartment) {
        if (tools == null) {
            TechnicalApartment techApartment = (TechnicalApartment)floor.getApartments()[0];
            tools = techApartment.getTools();
        }
        for (Room room : apartment.getRooms()) {
            tools.clean(room);
        }
    }

    public void setFloor(Floor floor) {
        this.floor = floor;
    }
}
