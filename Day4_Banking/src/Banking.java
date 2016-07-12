/**
 * Created by AHALSABA on 7/8/2016.
 */

public class Banking {

    public static void main(String[] args){
        Account[] a = new Account[3];
        a[0]= new MortgageAccount("John",100000);
        a[1]= new CheckingAccount("Jan", 200);
        a[2]= new CheckingAccount("Steve", 1000);
    }
}
