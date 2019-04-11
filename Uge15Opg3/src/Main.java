import java.io.FileInputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try {
            FileInputStream inFile = new FileInputStream(args[0]);
            BitInputStream bitInputStream = new BitInputStream(inFile);
            for (int i = 0; i < 4; i++) {
                System.out.println(bitInputStream.readInt());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
