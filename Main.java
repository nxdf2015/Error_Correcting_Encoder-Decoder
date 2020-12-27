package correcter;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        System.out.println(line);

        String message = Encoder.triple(line);
        System.out.println(message);

        message = Encoder.noise(message);
        System.out.println(message);

        message = Encoder.decode(message);
        System.out.println(message);
    }
}
