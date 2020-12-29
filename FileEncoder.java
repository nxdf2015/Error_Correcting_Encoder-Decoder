package correcter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class FileEncoder {
    private byte[] data;
    private Random random;


    {
        data = new byte[0];
        random = new Random();

    }
    public byte noise(){
        int offset = random.nextInt(8);
        return (byte) (1 << offset);
    }
    public void readBytes(String name) throws IOException {
        data = Files.readAllBytes(Path.of(name));
    }

    public void saveBytes(String name) throws IOException {
        FileOutputStream out = new FileOutputStream(new File(name));
        out.write(data);
        out.close();
    }


    public void code(){
        for(int i = 0; i < data.length; i++){

            data[i] = (byte) (data[i] ^ noise());
        }
    }

    public void printHex(){
        for(byte b : data){
            System.out.printf("%s ",Integer.toBinaryString(b));
            System.out.printf("%x ",b);
        }
    }


}
