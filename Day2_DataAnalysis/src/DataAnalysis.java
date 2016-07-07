/**
 * Created by AHALSABA on 7/7/2016.
 */
import java.util.Scanner;
public class DataAnalysis {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many data items will you provide: ");
        int dataItems = Integer.parseInt(sc.nextLine());
        int[] dataSet = new int[dataItems];
        int a = 0;
        System.out.println("Begin enterering each number followed by enter. When finished type quit: ");
        String value = (sc.nextLine());
        while (!value.equals("quit")) {
            dataSet[a++] = Integer.parseInt(value);
            value = sc.nextLine();
        }
        int total = 0;
        int min = dataSet[0];
        int max = dataSet[0];
        for (int i = 0; i < dataSet.length; i++) {
            total += dataSet[i];
            if (dataSet[i] < min){
                min = dataSet[i];
            }
            if (dataSet[i] > max){
                max = dataSet[i];
            }
        }
        System.out.println("Mean: " + (total / dataSet.length));
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}
