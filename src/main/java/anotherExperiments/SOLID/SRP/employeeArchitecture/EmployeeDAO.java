package anotherExperiments.SOLID.SRP.employeeArchitecture;

public class EmployeeDAO {

    public void saveEmployee(Employee employee) {
        System.out.println(employee + " saved!");
    }

    public void deleteEmployee(Employee employee) {
        System.out.println(employee + " deleted!");
    }

}
