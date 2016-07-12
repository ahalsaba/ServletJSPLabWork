/**
 * Created by AHALSABA on 7/8/2016.
 */

    abstract  class Account{
        private long balance;
        private String holderName;
        private long overdraft;
        public Account(String holder, long overdraft){
            holderName=holder;
            balance = overdraft;
        }
        public final void transaction(String message, long amount){
            System.out.println("Name: "+ holderName);
            System.out.println("Message: "+ message);
            System.out.println("Amount: "+ amount);
            balance += amount;
        }
        public long getBalance(){
            return balance;
        }
        abstract boolean deposit(long amount);
        abstract boolean withdraw(long amount);
    }

     class CheckingAccount extends Account{
        public CheckingAccount(String holder, long overdraft){
            super(holder,overdraft);
        }
        boolean deposit(long amount){
            transaction("Checking Deposit",amount);
            return true;
        }
        boolean withdraw(long amount){
            if (amount <= getBalance()) {
                transaction("Checking withdraw", amount * -1);
                return true;
            }
            return false;
        }
    }

     class MortgageAccount extends Account{
        public MortgageAccount(String holder, long borrowed){
            super(holder,borrowed);
            {System.out.println("Initial Borrowed Amount: " + borrowed);}
        }
        boolean deposit(long amount){
            transaction("Mortgage Payment: ",amount);
            return true;
        }
        boolean withdraw(long amount){
            return false;
        }
    }

