package laboratoryWork.lab31;

public class Test {
    public static void main(String[] args) {

//        String expectedResultPrintShipQueueEmpty="QueueEmpty";
//
//        OdessaSeaPort odessaSeaPort = new OdessaSeaPort();
//
//
//        String actualResultPrintShipQueueEmpty= odessaSeaPort.printQueueShip();
//        if(!(actualResultPrintShipQueueEmpty.equals(expectedResultPrintShipQueueEmpty)))
//            throw new AssertionError("Print empty queue expected to be printed " + expectedResultPrintShipQueueEmpty + " but found " + actualResultPrintShipQueueEmpty);
//
//
//        System.out.print("OK");


        String testLinerName = "NameTestLiner";
        float testLinerLength = 1000;
        float testLinerWidth = 1000;
        float testLinerDisplacement = 1000;
        int testLinerPassengers = 100;
        String testCargoName = "NameTestCargo";
        float testCargoLength = 1000;
        float testCargoWidth = 1000;
        float testCargoDisplacement = 1000;
        float testCargoTonnage = 100;
        String testTankerName = "NameTestTanker";
        float testTankerLength = 1000;
        float testTankerWidth = 1000;
        float testTankerDisplacement = 1000;
        float testTankerVolume = 100;

        String expectedResultPrintShipQueueAfterRemove = "{Name=NameTestLinerLength=1000.0Width=1000.0Displacement=1000.0};{Name=NameTestTankerLength=1000.0Width=1000.0Displacement=1000.0};";

        int expectedSuccessfulStatusRemoveShipInQueue = 1;

        AbstractShip testLiner = new Liner(testLinerName, testLinerLength, testLinerWidth, testLinerDisplacement, testLinerPassengers);
        AbstractShip testCargo = new Cargo(testCargoName, testCargoLength, testCargoWidth, testCargoDisplacement, testCargoTonnage);
        AbstractShip testTanker = new Tanker(testTankerName, testTankerLength, testTankerWidth, testTankerDisplacement, testTankerVolume);

        OdessaSeaPort odessaSeaPort = new OdessaSeaPort();


        odessaSeaPort.addShipToEndQueue(testCargo);
        odessaSeaPort.addShipToEndQueue(testLiner);
        odessaSeaPort.addShipToEndQueue(testTanker);


        int actualSuccessfulStatusRemoveShipInQueue = odessaSeaPort.removeShipFromBeginQueue();
        if (actualSuccessfulStatusRemoveShipInQueue != expectedSuccessfulStatusRemoveShipInQueue)
            throw new AssertionError("Successful status remove ship in queue 1 but found " + actualSuccessfulStatusRemoveShipInQueue);

        String actualPrintShipQueueAfterRemove = odessaSeaPort.printQueueShip();
        if(!(actualPrintShipQueueAfterRemove.equals(expectedResultPrintShipQueueAfterRemove)))
            throw new AssertionError("Expected to be printed " + expectedResultPrintShipQueueAfterRemove + " but found " + actualPrintShipQueueAfterRemove);


        System.out.print("OK");
    }
}
