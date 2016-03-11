package week4.lab28Liner;

import static java.lang.Math.abs;

public class Liner extends AbstractShip {

    private int passengers;
    public static final float DEFAULT_RENTAL = 1000;

    public Liner(String name, float length, float width, float displacement, int passangers) {
        super(name, length, width, displacement);
        this.passengers = passangers;

    }

    @Override
    public float calculatePayment() {
        return abs(this.passengers * DEFAULT_RENTAL);
    }
    public float calculatePayment(float testRentTaxNegative) {
        if (testRentTaxNegative <0)
            return abs(this.passengers * DEFAULT_RENTAL);
        if (testRentTaxNegative != DEFAULT_RENTAL)
            return abs(this.passengers * testRentTaxNegative);
        return 0;
    }
}

abstract class AbstractShip {
    private String name;
    private float length;
    private float width;
    private float displacement;

    public AbstractShip(String name, float length, float width, float displacement) {
        this.name = name;
        this.length = length;
        this.width = width;
        this.displacement = displacement;
    }

    public abstract float calculatePayment();

    public String toPrint() {
        return "Name=" + name +
                "Length=" + length +
                "Width=" + width +
                "Displacement=" + displacement;
    }

    public String getName() {
        return name;
    }


}
