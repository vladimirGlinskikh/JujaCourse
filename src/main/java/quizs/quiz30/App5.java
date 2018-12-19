package quizs.quiz30;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.zip.GZIPOutputStream;

public class App5 {
    public static void main(String[] args) throws IOException {
//        new GZIPOutputStream(new byte[256]);
        new GZIPOutputStream(new GZIPOutputStream(...));
//        new GZIPOutputStream(new OutputStreamWriter(...));
        new GZIPOutputStream(new DataOutputStream(...));
        OutputStream ref = new GZIPOutputStream(...);
    }
}
