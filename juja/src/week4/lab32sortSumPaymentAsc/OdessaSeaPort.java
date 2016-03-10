package week4.lab32sortSumPaymentAsc;

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


class Tanker extends AbstractShip {
    private float volume;
    public static final float DEFAULT_RENTAL = 250;

    public Tanker(String name, float length, float width, float displacement, float volume) {
        super(name, length, width, displacement);
        this.volume = volume;
    }

    @Override
    public float calculatePayment() {
        return volume * DEFAULT_RENTAL;
    }

    public float calculatePayment(float rentTax) {
        if (rentTax > 0) {
            return volume * rentTax;
        } else {
            return calculatePayment();
        }
    }
}

class Cargo extends AbstractShip {
    private float tonnage;
    public static final float DEFAULT_RENTAL=550;

    public Cargo(String name, float length, float width, float displacement, float tonnage) {
        super(name, length, width, displacement);
        this.tonnage = tonnage;
    }

    @Override
    public float calculatePayment() {
        return tonnage * DEFAULT_RENTAL;
    }

    public float calculatePayment(float rentTax) {
        if (rentTax > 0) {
            return tonnage * rentTax;
        } else {
            return calculatePayment();
        }
    }
}

class OdessaSeaPort {

    public static String sortSumPaymentAsc(AbstractShip[] arrayShips) {
        String str = "";
        if (arrayShips == null) return str;
        if (arrayShips.length > 0){
            for (int k = 0; k < arrayShips.length -1; k++) {
                for (int i = 0; i < arrayShips.length -1; i++) {
                    if (arrayShips[i].calculatePayment() > arrayShips[i + 1].calculatePayment()){
                        AbstractShip ship;
                        ship = arrayShips[i];
                        arrayShips[i] = arrayShips[i + 1];
                        arrayShips[i + 1] = ship;
                    }
                }
            }
            for (int i = 0; i < arrayShips.length; i++) {
                str += arrayShips[i].getName() + "=" + arrayShips[i].calculatePayment();
            }


        }
        return  str;

    }
}
