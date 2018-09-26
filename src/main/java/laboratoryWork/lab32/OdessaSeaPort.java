package laboratoryWork.lab32;

class OdessaSeaPort {
    public static String sortSumPaymentAsc(AbstractShip[] arrayShips) {
        String result = "";
        if (arrayShips == null || arrayShips.length == 0) {
            return result;
        } else {
            for (int i = 0; i < arrayShips.length - 1; i++) {
                for (int j = 1; j < arrayShips.length; j++) {
                    if (arrayShips[i].calculatePayment() > arrayShips[j].calculatePayment()) {
                        AbstractShip tmp;
                        tmp = arrayShips[i];
                        arrayShips[i] = arrayShips[j];
                        arrayShips[j] = tmp;
                    }
                }
            }
            for (AbstractShip ship :
                    arrayShips) {
                result += ship.getName() + "=" + ship.calculatePayment();
            }
        }

        return result;
    }
}
