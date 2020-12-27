package correcter;

import java.util.Random;

public class Encoder {
    public static  Random random;

    static {
        random = new Random();
    }

    public static  char randomLetter(char letter){
        char c = letter;
        while(c  == letter){
            c = (char)(random.nextInt(26) + 'a');
        }
        return c;
    }

    public static String noise(String line){

        StringBuilder builder = new StringBuilder(line);
        for(int i = 0; i < line.length(); i = i + 3){
            int p = random.nextInt(3);

            if (p + i < line.length()) {
                char letter = builder.charAt(p + i);
                builder.setCharAt(p + i, randomLetter(letter));
            }

        }
        return builder.toString();
    }

    public static String triple(String message){
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < message.length(); i++){
            builder.append(message.substring(i, i + 1).repeat(3));
        }
        return builder.toString();
    }

    public static String decode(String message){
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < message.length(); i = i + 3){
            char a = message.charAt(i);
            char b = message.charAt(i + 1);
            char c = message.charAt(i + 2);
            char d = a;
            if (a == b){
                d = a;
            }
            else if(a == c){
                d = a;
            }
            else if(b == c){
                d = b;
            }
            builder.append(d);
        }
     return builder.toString();
    }
}
