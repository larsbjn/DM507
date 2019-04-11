import java.io.FileInputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try {
            FileInputStream inFile = new FileInputStream(args[0]);
            int[] times = new int[256];
            int bytes = inFile.available();
            for (int i = 0; i < bytes; i++) {
                int temp = inFile.read();
                times[temp] =+ 1;
            }
            for (int i = 0; i < times.length; i++) {
                System.out.println(i + ": " + times[i]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
