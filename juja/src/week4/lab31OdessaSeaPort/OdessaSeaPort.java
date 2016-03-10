package week4.lab31OdessaSeaPort;

class OdessaSeaPort implements SeaPortQueue {
    private static final int NO_SHIP_IN_ARRAY = -1;
    private int indexShipInPort = NO_SHIP_IN_ARRAY;
    private AbstractShip[] arrayShip = new AbstractShip[LENGTH_QUEUE_SHIP];


    @Override
    public int addShipToEndQueue(AbstractShip ship) {
        if (indexShipInPort == LENGTH_QUEUE_SHIP - 1) {
            return -1;
        }
        if (-1 <= indexShipInPort & indexShipInPort < LENGTH_QUEUE_SHIP) {
            indexShipInPort++;
            arrayShip[indexShipInPort] = ship;
            return indexShipInPort;
        }
        return -1;
    }

    @Override
    public int removeShipFromBeginQueue() {

        if (indexShipInPort == -1) {
            return -1;
        }
        if (arrayShip[0] == null){
            return 1;
        }
        if (0 <= indexShipInPort & indexShipInPort <= LENGTH_QUEUE_SHIP) {
            System.arraycopy(arrayShip, 1, arrayShip, 0, indexShipInPort);
            // arrayShip = Arrays.copyOf(arrayShip, arrayShip.length - 1);
            indexShipInPort--;
            return 1;
        }
        return 0;
    }

    @Override
    public String printQueueShip() {

        String srt = "";
        if (indexShipInPort == -1) {
            return "QueueEmpty";
        }
        for (int i = 0; i < arrayShip.length - 1; i++) {
            srt += "{" + arrayShip[i].toPrint() + "};";
        }

        return srt;
    }
}