package anotherExperiments.SOLID.SRP.employeeArchitecture;

public class ReportFormatter {

    String formattedOutput;

    public ReportFormatter(Object o, FormatType formatType) {
        switch (formatType) {
            case XML:
                formattedOutput = convertedObjectToXML(o);
                break;
            case JSON:
                formattedOutput = convertedObjectToJSON(o);
                break;
        }
    }

    private String convertedObjectToXML(Object o) {
        return "converted to XML " + o.toString();
    }

    private String convertedObjectToJSON(Object o) {
        return "converted to JSON " + o.toString();
    }
}
