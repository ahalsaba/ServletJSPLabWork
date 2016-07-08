/**
 * Created by AHALSABA on 7/8/2016.
 */
public class Reading {
    public String day;
    public int hour;
    public int temp;
    public int windSpeed;


    public Reading(String line) {
        String[] elements = line.split(", ");
        day = elements[0];
        hour = Integer.parseInt(elements[1]);
        temp = Integer.parseInt(elements[2]);
        windSpeed = Integer.parseInt(elements[3]);
    }

    public String rateTemperature(){
        if (temp < 55) return "cold";
        else if (temp < 65) return "mild";
        else if (temp < 80) return "warm";
        else return "hot";
    }

    public String getTime(){
        if (hour == 9) return (day + " morning ");
        if (hour == 15) return (day + " afternoon ");
        else return (day + " evening ");
    }
}