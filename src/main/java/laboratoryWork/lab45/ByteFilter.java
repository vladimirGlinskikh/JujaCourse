package laboratoryWork.lab45;

import java.io.*;

public class ByteFilter {
    public static void filter(InputStream src, OutputStream dst, int bufferSize, byte filterCriteria) throws IOException {
        byte[] buffer = new byte[bufferSize];
        int number;

        while ((number = src.read(buffer)) != -1) {
            for (int i = 0, length = 0, off = 0; i < number; i++) {
                if (filterCriteria == buffer[i]) {
                    if (length > 0) {
                        dst.write(buffer, off, length);
                        off += 1;
                        length = 0;
                    }
                    off += 1;
                } else {
                    length += 1;
                    if (i + 1 == number) {
                        dst.write(buffer, off, length);
                        length = 0;
                    }
                }
            }
        }
    }
}