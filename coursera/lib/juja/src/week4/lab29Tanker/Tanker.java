package week4.lab29Tanker;

import static java.lang.Math.abs;

public class Tanker extends AbstractShip {
    private float volume;
    public static final float DEFAULT_RENTAL = 250;

    public Tanker(String name, float length, float width, float displacement, float volume) {
        super(name, length, width, displacement);
        this.volume = volume;
    }

    @Override
    public float calculatePayment() {
        return abs(this.volume * DEFAULT_RENTAL);
    }
    public float calculatePayment(float testRentTaxNegative) {
        if (testRentTaxNegative <0)
            return abs(this.volume * DEFAULT_RENTAL);
        if (testRentTaxNegative != DEFAULT_RENTAL)
            return abs(this.volume * testRentTaxNegative);
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
