package laboratoryWork.lab44;

import java.io.IOException;

public interface EntityOutput {
    void writePerson(Person person) throws IOException;

    void writePoint(Point point) throws IOException;
}
