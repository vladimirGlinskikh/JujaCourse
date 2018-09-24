package laboratoryWork.lab28;

public class Test {
    public static void main(String[] args) {
        String testLinerName = "TestLinerName";
        float testLinerLength = 1000;
        float testLinerWidth = 1000;
        float testLinerDisplacement = 1000;
        int testLinerPassengers = 100;

        float testRentTaxNegative=-1;
        float expectedLinerPaymentRentTaxDefault = testLinerPassengers * Liner.DEFAULT_RENTAL;

        Liner liner = new Liner(testLinerName, testLinerLength, testLinerWidth, testLinerDisplacement, testLinerPassengers);

        //check payment if  rent tax is negative
        float actualLinerPaymentRentTaxNegative = liner.calculatePayment(testRentTaxNegative);
        if (actualLinerPaymentRentTaxNegative != expectedLinerPaymentRentTaxDefault)
            throw new AssertionError("Rent tax is negative= "+ testRentTaxNegative+" and expected payment value= " + expectedLinerPaymentRentTaxDefault + " but found " + actualLinerPaymentRentTaxNegative);

        System.out.print("OK");



//        String testLinerName = "TestLinerName";
//        float testLinerLength = 1000;
//        float testLinerWidth = 1000;
//        float testLinerDisplacement = 1000;
//        int testLinerPassengers = 100;
//
//        float expectedLinerPaymentRentTaxDefault = testLinerPassengers * Liner.DEFAULT_RENTAL;
//
//        Liner liner = new Liner(testLinerName, testLinerLength, testLinerWidth, testLinerDisplacement, testLinerPassengers);
//
//        //check payment if rent tax is default
//        float actualLinerPaymentRentTaxDefault = liner.calculatePayment();
//        if (actualLinerPaymentRentTaxDefault != expectedLinerPaymentRentTaxDefault)
//            throw new AssertionError("Rent tax is default" + Liner.DEFAULT_RENTAL + " and expected payment value= " + expectedLinerPaymentRentTaxDefault + " but found " + actualLinerPaymentRentTaxDefault);
//
//        System.out.print("OK");


//        String testLinerName = "TestLinerName";
//        float testLinerLength = 1000;
//        float testLinerWidth = 1000;
//        float testLinerDisplacement = 1000;
//        int testLinerPassengers = 100;
//
//        float testRentTax = 5000;
//
//        float expectedLinerPaymentRentTaxNotDefault = testLinerPassengers * testRentTax;
//
//        Liner liner = new Liner(testLinerName, testLinerLength, testLinerWidth, testLinerDisplacement, testLinerPassengers);
//
//        //check payment if  rent tax is not default
//        float actualLinerPaymentRentTaxNotDefault = liner.calculatePayment(testRentTax);
//        if (actualLinerPaymentRentTaxNotDefault != expectedLinerPaymentRentTaxNotDefault)
//            throw new AssertionError("Rent tax = "+ testRentTax+" and expected payment value= " + expectedLinerPaymentRentTaxNotDefault + " but found " + actualLinerPaymentRentTaxNotDefault);
//
//        System.out.print("OK");
    }
}
