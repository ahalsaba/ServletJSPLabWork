/**
 * Created by ahalsaba on 7/13/2016.
 */
public class BankStrategy {
    public class Account{
        private withdraw a ;
        private apply b;

        public Account(String one, int two){
            b = new apply(one, two);
        }
        public Account(int two){
            a = new withdraw(two);
        }
        private int balance;
        private void transaction(int num){
            a.bal += num;
            b.bal +=num;

        }

    }

    public static interface GrantWithdrawalStrategy{
        int currentBalance();
        int limits();
        int numWithdraw();
    }


    public static interface ApplyFeesStrategy{
        int balance2 = 0;
        String accountType();
        int currentBalance();
    }

    public static class withdraw implements GrantWithdrawalStrategy{
        int bal;
        int lims=0;
        int withdraw=0;
        public withdraw(int b){bal=b;};
        public int currentBalance(){return bal;};
        public int limits(){return lims;};
        public int numWithdraw(){return withdraw++;}

    }

    public class apply implements ApplyFeesStrategy{
        String type;
        int bal;
        public apply(String type,int bal){
            this.bal=bal;
            this.type=type;
        }
        public String accountType(){return type;}
        public int currentBalance(){return bal;}
    }




    public static void main(String[] args){

    }
}
