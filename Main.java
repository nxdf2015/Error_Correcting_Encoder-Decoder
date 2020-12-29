package correcter;



import java.io.IOException;


public class Main {

    public static void main(String[] args) {
        FileEncoder encoder = new FileEncoder();
        System.out.println("---------------"+System.getProperty("user.dir"));
        try {
            encoder.readBytes("send.txt");

            encoder.code();
            encoder.saveBytes("received.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
