/**
 * Created by AHALSABA on 7/8/2016.
 */
public class MethodArguments2 {
    public static int addUp(int ... nums){
        System.out.println("Executing addUp (int): ");
        int total1=0;
        for (int i=0; i<nums.length; i++){
            total1 += nums[i];
        }
        return total1;
    }
    public static double addUp(double ... nums){
        System.out.println("Executing addUp (double)");
        double total2 =0.0;
        for (int i=0; i<nums.length; i++){
            total2 += nums[i];
        }
        return total2;
    }
    public static int addUp(String ... nums){
        System.out.println("Executing addUp (String)");
        int total3=0;
        for (int i=0; i<nums.length; i++){
            total3 += toNumber(nums[i]);
        }
        return total3;
    }
    public static int toNumber(String a){
        String[] numbers={"zero","one","two","three","four","five","six","seven","eight","nine","ten"};
        for (int i=0; i<numbers.length; i++){
            if (a.equals(numbers[i])) return i;
        }
        return 0;
    }

    public static void main(String[] args){
        System.out.println(addUp(3.2, 2.2,1));
        System.out.println(addUp(1, 4,1));
        System.out.println(addUp("one", "three","one"));
        System.out.println(addUp(2, 3.5,1));
    }
}
