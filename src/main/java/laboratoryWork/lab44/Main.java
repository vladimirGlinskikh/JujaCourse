package laboratoryWork.lab44;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
//        Person expectedPerson = new Person("John", 32);
//
//        StringWriter outStringWriter = new StringWriter();
//        EntityOutputWriter writer = new EntityOutputWriter(outStringWriter);
//
//        writer.writePerson(expectedPerson);
//        String rawString = outStringWriter.toString();
//
//
//        //call
//        StringReader inStringReader = new StringReader(rawString);
//
//        EntityInputReader reader = new EntityInputReader(inStringReader);
//
//        Person actualPerson = reader.readPerson();
//
//        //check
//
//        if (!actualPerson.getName().equals(expectedPerson.getName()))
//            throw new AssertionError("Expected Person name equals " + expectedPerson.getName() + " but found " + actualPerson.getName());
//
//        if (actualPerson.getAge() != expectedPerson.getAge())
//            throw new AssertionError("Expected Person age equals " + expectedPerson.getAge() + " but found " + actualPerson.getAge());
//
//        System.out.print("OK");

//        Point expectedPoint = new Point(5, 10);
//        StringWriter outStringWriter = new StringWriter();
//        EntityOutputWriter writer = new EntityOutputWriter(outStringWriter);
//
//        writer.writePoint(expectedPoint);
//        String rawString = outStringWriter.toString();
//
//        //call
//        StringReader inStringReader = new StringReader(rawString);
//        EntityInputReader reader = new EntityInputReader(inStringReader);
//        Point actualPoint = reader.readPoint();
//
//        // check
//        if (actualPoint.getX() != expectedPoint.getX())
//            throw new AssertionError("Expected Point X equals " + expectedPoint.getX() + " but found " + actualPoint.getX());
//
//        if (actualPoint.getY() != expectedPoint.getY())
//            throw new AssertionError("Expected Person Y equals " + expectedPoint.getY() + " but found " + actualPoint.getY());
//
//        System.out.print("OK");

        Point expectedPoint = new Point(5, 10);
        StringWriter outStringWriter = new StringWriter();
        EntityOutputWriter writer = new EntityOutputWriter(outStringWriter);

        writer.writePoint(expectedPoint);
        String rawString = outStringWriter.toString();

        //call
        StringReader inStringReader = new StringReader(rawString);
        EntityInputReader reader = new EntityInputReader(inStringReader);
        Point actualPoint = reader.readPoint();

        // check
        if (actualPoint.getX() != expectedPoint.getX())
            throw new AssertionError("Expected Point X equals " + expectedPoint.getX() + " but found " + actualPoint.getX());

        if (actualPoint.getY() != expectedPoint.getY())
            throw new AssertionError("Expected Person Y equals " + expectedPoint.getY() + " but found " + actualPoint.getY());

        System.out.print("OK");
    }
}
