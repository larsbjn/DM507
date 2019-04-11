import java.io.FileInputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try {
            FileInputStream inFile = new FileInputStream(args[0]);
            BitInputStream bitInputStream = new BitInputStream(inFile);
            int bytes = inFile.available();
            // Loops through every byte in the input file
            for (int i = 0; i < bytes; i++) {
                // Loops through 8 times, because a byte is 8 bits
                for (int j = 0; j < 8; j++) {
                    System.out.print(bitInputStream.readBit());
                }
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}