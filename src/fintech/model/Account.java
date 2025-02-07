package fintech.model;
import fintech.model.Account;
/**
 * @author NIM Nama
 * @author NIM Nama
 */

public class Account {

    private String owner;
    private String accountName; 
    private double balance;

    public Account(String owner, String accountName, double balance) {
        this.owner = owner;
        this.accountName = accountName;
        this.balance = balance;
    }
 
    @Override
    public String toString() {
        return accountName + "|" + owner + "|" + balance;
    }

}