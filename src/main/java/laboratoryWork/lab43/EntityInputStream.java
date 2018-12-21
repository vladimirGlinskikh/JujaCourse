package laboratoryWork.lab43;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

class EntityInputStream implements EntityInput {
    private DataInput in;

    public EntityInputStream(InputStream in) {
        this.in = new DataInputStream(in);
    }

    @Override
    public Person readPerson() throws IOException {
        int age = in.readInt();
        String name = null;
        if (in.readBoolean()) {
            name = in.readUTF();
        }
        return new Person(name, age);
    }

    @Override
    public Point readPoint() throws IOException {
        int value = in.readByte();
        return new Point(value / 16, value & ((1 * 16) - 1));
    }
}
