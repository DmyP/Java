package Quiz.a7_polymorph.asd.staff;

import Quiz.a7_polymorph.asd.apartment.Apartment;

public class BadHousemaid extends Housemaid {

    @Override
    public void clean(Apartment apartment) {
        super.clean(apartment);
        System.out.println("Sleping at " + apartment.getRooms()[4]);
    }
}
