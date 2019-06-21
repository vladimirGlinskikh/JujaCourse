package anotherExperiments.SOLID.employeeArchitecture;

public class ClientModule {

    public static void main(String[] args) {
        Employee employee = new Employee(1, "Vladimir", "Java", true);
        ClientModule.hireNewEmployee(employee);
        ClientModule.printEmployeeReport(employee, FormatType.XML);
        ClientModule.terminateEmployee(employee);
    }

    public static void hireNewEmployee(Employee employee) {
        EmployeeDAO employeeDAO = new EmployeeDAO();
        employeeDAO.saveEmployee(employee);
    }

    public static void terminateEmployee(Employee employee) {
        EmployeeDAO employeeDAO = new EmployeeDAO();
        employeeDAO.deleteEmployee(employee);
    }

    public static void printEmployeeReport(Employee employee, FormatType formatType) {
        EmployeeReportFormatter formatter = new EmployeeReportFormatter(employee, formatType);
        System.out.println(formatter.getFormattedEmployee());
    }
}
