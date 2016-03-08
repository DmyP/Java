package week4.lab30Cargo;

import static java.lang.Math.abs;

public class Cargo extends AbstractShip {
    private float tonnage;
    public static final float DEFAULT_RENTAL=550;

    public Cargo(String name, float length, float width, float displacement, float tonnage) {
        super(name, length, width, displacement);
        this.tonnage = tonnage;
    }

    @Override
    public float calculatePayment() {
        return abs(this.tonnage * DEFAULT_RENTAL);
    }
    public float calculatePayment(float testRentTaxNegative) {
        if (testRentTaxNegative <0)
            return abs(this.tonnage * DEFAULT_RENTAL);
        if (testRentTaxNegative != DEFAULT_RENTAL)
            return abs(this.tonnage * testRentTaxNegative);
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