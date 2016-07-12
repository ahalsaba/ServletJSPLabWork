import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 * Created by AHALSABA on 7/12/2016.
 */
public class HandlingExceptions {
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter file name one: ");
        File a = new File(sc.nextLine());
        System.out.println("Please enter file name two: ");
        File b = new File(sc.nextLine());

            InputStream input = null;
            OutputStream output = null;
            try {
                input = new FileInputStream(a);
            } catch (FileNotFoundException hey){
                System.out.println("Not found, please reenter file one: ");
                a = new File(sc.nextLine());
                input = new FileInputStream(a);
            }

        try {
            output = new FileOutputStream(b);
        } catch (FileNotFoundException hey2){
            System.out.println("Not found, please reenter file two: ");
            b = new File(sc.nextLine());
            input = new FileInputStream(b);
        }


                byte[] buf = new byte[1024];
                int bytesRead;
        try {
            while ((bytesRead = input.read(buf)) > 0) {
                output.write(buf, 0, bytesRead);
            }

        } finally {
            input.close();
            output.close();
        }


    }

}
