package Quiz.a7_polymorph.asd2.asd.staff_strategy;
import Quiz.a7_polymorph.asd2.asd.apartment.Apartment;
import Quiz.a7_polymorph.asd2.asd.staff.Housemaid;

public final class StrategyHousemaid extends Housemaid {

    private HousemaidStrategy strategy;

    public StrategyHousemaid(HousemaidStrategy strategy) {
        super();
        this.strategy = strategy;
    }

    public void setStrategy(HousemaidStrategy strategy) {
        this.strategy = strategy;
    }

    public void clean(Apartment apartment) {
        super.clean(apartment);
        strategy.doSomth();
    }

}
