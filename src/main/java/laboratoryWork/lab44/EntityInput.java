package laboratoryWork.lab44;

import java.io.IOException;

public interface EntityInput {
    Person readPerson() throws IOException;

    Point readPoint() throws IOException;
}
