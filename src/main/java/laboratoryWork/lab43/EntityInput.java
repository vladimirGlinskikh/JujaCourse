package laboratoryWork.lab43;

import java.io.IOException;

public interface EntityInput {
    Person readPerson() throws IOException;

    Point readPoint() throws IOException;
}
