/**
 * Created by AHALSABA on 7/5/2016.
 */

import java.util.Scanner;

public class FToC {

    public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.print("Please enter a Fahrenheit value to convert to Celsius: ");
            String line = sc.nextLine();
            Double Ftemp = Double.parseDouble(line);
            Double Ctemp = (5 * (Ftemp - 32))/9;
            System.out.println("\nCelsius temperature: " + Ctemp);
    }

}
