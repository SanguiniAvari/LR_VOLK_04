package LR_8;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class chapter_04_08_2 {
    public static void readAllByByte(InputStream in) throws IOException {
        while (true){
            int oneByte = in.read();
            if (oneByte != -1){
                System.out.print((char)oneByte);
            } else {
                System.out.println("\n"+"end");
                break;
            }
        }
    }
    public static void main(String[] args) throws IOException {
        try{
            InputStream inFile = new FileInputStream("C:\\TMP\\TASK_1.txt");
            readAllByByte(inFile);
            System.out.print("\n\n\n");
            inFile.close();

            InputStream inUrl = new URL("https://google.com/").openStream();
            readAllByByte(inUrl);
            System.out.print("\n\n\n");
            inUrl.close();

            InputStream inArray = new ByteArrayInputStream(new byte[]{59,60,61,62,63});
            readAllByByte(inArray);
            System.out.print("\n\n\n");
            inArray.close();
        } catch (IOException e){
            System.out.println("Ой-йой! "+ e);
        }
    }
}
