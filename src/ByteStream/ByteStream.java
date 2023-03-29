package ByteStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStream {
    public static void main(String[] args) throws IOException {
        byte[] bytes = new byte[10];
        for (int i = 0; i < 10; i++) {
            bytes[i] = (byte) System.in.read();
            if (bytes[i] == (byte) '\n') {
                break;
            }
        }
        FileOutputStream out = new FileOutputStream("src/ByteStream/output.txt");
        for (byte b : bytes) {
            if (b != 0) {
                out.write(b);
            }
        }
    }
}
