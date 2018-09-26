package laboratoryWork.lab31;

class OdessaSeaPort implements SeaPortQueue {
    private static final int NO_SHIP_IN_ARRAY = -1;
    private int indexShipInPort = NO_SHIP_IN_ARRAY;
    private AbstractShip[] arrayShip = new AbstractShip[LENGTH_QUEUE_SHIP];

    @Override
    public int addShipToEndQueue(AbstractShip ship) {
        if (indexShipInPort == (LENGTH_QUEUE_SHIP - 1)) {
            return -1;
        }
        indexShipInPort += 1;
        arrayShip[indexShipInPort] = ship;
        return indexShipInPort;
    }

    @Override
    public int removeShipFromBeginQueue() {
        if (indexShipInPort < 0) {
            return -1;
        }

        for (int i = 0; i < indexShipInPort; i++) {
            arrayShip[i] = arrayShip[i + 1];
        }
        arrayShip[indexShipInPort] = null;
        indexShipInPort -= 1;
        return 1;
    }

    @Override
    public String printQueueShip() {
        String result = "";
        if (indexShipInPort < 0) {
            return "QueueEmpty";
        }
        for (int i = 0; i <= indexShipInPort; i++) {
            result += "{" + arrayShip[i].toPrint() + "};";
        }
        return result;
    }
}
