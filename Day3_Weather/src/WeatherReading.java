/**
 * Created by AHALSABA on 7/8/2016.
 */

import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Paths;

public class WeatherReading {

    public static void main(String[] args)throws Throwable{
        BufferedReader br = Files.newBufferedReader(
                Paths.get("weather.csvx"));
        Reading[] readings = new Reading[12];
        String line;
        for (int i = 0; i < readings.length; i++) {
            readings[i] = new Reading(br.readLine());
        }

        for (int j=0; j < readings.length; j++){
            System.out.println(readings[j].getTime()+"was "+readings[j].rateTemperature());
        }
        // remaining code here
    }
}
