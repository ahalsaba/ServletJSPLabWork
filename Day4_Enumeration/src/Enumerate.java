/**
 * Created by AHALSABA on 7/12/2016.
 */
import java.util.concurrent.ThreadLocalRandom;
public class Enumerate {

    public static machine[] giveMe(){
        int length = machine.values().length;
        machine[] result = new machine[length];
        for (int i=0; i<3; i++) {
            int a = ThreadLocalRandom.current().nextInt(length);
            result[i]=machine.values()[a];
        }
        return result;
    }
    public enum machine {
        BAR,MEDAL,COIN,TRIPLEBAR,CHERRY;
    }

    public static void main(String[] args){
        machine[] answer = giveMe();
        for (int i=0; i<3; i++){
            System.out.println(answer[i].name());
        }
    }
}


