/**
 * Created by AHALSABA on 7/8/2016.
 */
public class MethodArguments {
    public static int addUp(int a, int b){
        System.out.println("Executing addUp (int): ");
        return a+b;
    }
    public static double addUp(double a, double b){
        System.out.println("Executing addUp (double)");
        return a+b;
    }
    public static int addUp(String a, String b){
        System.out.println("Executing addUp (String)");
        return toNumber(a) + toNumber(b);
    }
    public static int toNumber(String a){
        String[] numbers={"zero","one","two","three","four","five","six","seven","eight","nine","ten"};
        for (int i=0; i<numbers.length; i++){
            if (a.equals(numbers[i])) return i;
        }
        return 0;
    }

    public static void main(String[] args){
        System.out.println(addUp(3.2, 2.2));
        System.out.println(addUp(1, 4));
        System.out.println(addUp("one", "three"));
        System.out.println(addUp(2, 3.5));
    }
}
