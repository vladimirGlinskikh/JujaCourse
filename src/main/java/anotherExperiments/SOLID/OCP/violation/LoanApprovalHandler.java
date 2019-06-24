package anotherExperiments.SOLID.OCP.violation;

public class LoanApprovalHandler {

    public void approvePersonalLoan(PersonalLoanValidator validator) {
        if (validator.isValid()) {
            //to do something
        }
    }

    public void approveVehicleLoan(VehicleLoanValidator validator) {
        if (validator.isValid()) {
            //to do something
        }
    }
}
