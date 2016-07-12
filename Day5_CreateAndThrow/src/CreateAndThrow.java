import java.util.Scanner;

/**
 * Created by AHALSABA on 7/12/2016.
 */
public class CreateAndThrow {
    public enum months{
        JANUARY,FEBRUARY,MARCH,APRIL,MAY,JUNE,JULY,AUGUST,SEPTEMBER,OCTOBER,NOVEMER,DECEMEBER;
    }
    static int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};

    public static class BadMonth extends Exception{
        public BadMonth(){ System.out.println("BadMonth");}
        public BadMonth(Throwable cause){super(cause); System.out.println("BadMonth");}

    }

    public static class BadDay extends Exception{
        public BadDay(){ System.out.println("BadDay");}
        public BadDay(Throwable cause){super(cause); System.out.println("BadDay");}


    }

    public static void isValid(String month, int day){
       months a;
        try{
            a = months.valueOf(month);
        }catch(IllegalArgumentException hey){
            new BadMonth(hey);
            return;
        }
        try {
            if (days[a.ordinal()] != day) {
                int[] one = {1, 2, 3};
                one[5] = 6;
            }
        }catch(IndexOutOfBoundsException e){
            new BadDay(e);
        }
        System.out.println("Valid!");
    }

    public static void main(String[] args){
        String m="";
        int num;

        Scanner sc  = new Scanner(System.in);
        while (!(m.equalsIgnoreCase("quit"))){
            System.out.println("Enter Month all caps: ");
            m=sc.nextLine();
            System.out.println("Enter day: ");
            num = Integer.parseInt(sc.nextLine());
            isValid(m,num);
        }
    }


}
