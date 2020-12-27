package correcter;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static  Random random = new Random();

    public static  char randomLetter(char letter){
        char c = letter;
        while(c  == letter){
            c = (char)(random.nextInt(26) + 'a');
        }
        return c;
    }

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        StringBuilder builder = new StringBuilder(line);

        for(int i = 0; i < line.length(); i = i + 3){
            int p = random.nextInt(3);

            if (p + i < line.length()) {
                char letter = builder.charAt(p + i);
                builder.setCharAt(p + i, randomLetter(letter));
            }

        }


        System.out.println(builder.toString());
    }
}
