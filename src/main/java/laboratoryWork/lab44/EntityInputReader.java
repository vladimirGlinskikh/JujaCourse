package laboratoryWork.lab44;

import java.io.*;

class EntityInputReader implements EntityInput {
    private Reader in;

    public EntityInputReader(Reader in) {
        this.in = in;
    }

    @Override
    public Person readPerson() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(in);
        String stringLine = bufferedReader.readLine();

        int indexStart = stringLine.indexOf("<age>");
        int indexFinish = stringLine.indexOf("</age>");
        String age = stringLine.substring(indexStart + "<age>".length(), indexFinish);

        indexStart = stringLine.indexOf("<name>");
        indexFinish = stringLine.indexOf("</name>");
        String name = stringLine.substring(indexStart + "<name>".length(), indexFinish);
        return new Person(name, Integer.parseInt(age));
    }

    @Override
    public Point readPoint() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(in);
        String stringLine = bufferedReader.readLine();

        String age = stringLine.substring("<point x=".length(), stringLine.length() - "></point>n".length());
        String[] value = age.split(" y=");
        return new Point(Integer.parseInt(value[0]), Integer.parseInt(value[1]));
    }
}
