package week4.lab31OdessaSeaPort;

class OdessaSeaPort implements SeaPortQueue {
    private static final int NO_SHIP_IN_ARRAY = -1;
    private int indexShipInPort = NO_SHIP_IN_ARRAY;
    private AbstractShip[] arrayShip = new AbstractShip[LENGTH_QUEUE_SHIP];

    @Override
    public int addShipToEndQueue(AbstractShip ship) {
        return 0;
    }

    @Override
    public int removeShipFromBeginQueue() {
        return 0;
    }

    @Override
    public String printQueueShip() {
        return null;
    }

    /*BODY*/

}
