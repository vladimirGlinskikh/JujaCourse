package laboratoryWork.lab31;

interface SeaPortQueue {
    int LENGTH_QUEUE_SHIP = 3;

    int addShipToEndQueue(AbstractShip ship);

    int removeShipFromBeginQueue();

    String printQueueShip();
}
