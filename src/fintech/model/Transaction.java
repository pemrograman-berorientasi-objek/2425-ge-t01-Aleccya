package fintech.model;



/**
 * @author NIM Nama
 * @author NIM Nama
 */
public class Transaction {

    String id;
    String accountName;
    double ammount;
    String posted;
    String note;
    double balanceAfterTransaction;

    public Transaction(String id,String accountName, double ammount, String posted, String note, double balanceAfterTransaction) {
        this.id = id;
        this.accountName = accountName;
        this.ammount = ammount;
        this.posted = posted;
        this.note = note;
    
        this.balanceAfterTransaction = balanceAfterTransaction;
    }

    public String toString() { 
        return id + "|" + accountName + "|" + ammount + "|" + posted + "|" + note + "|" + balanceAfterTransaction;
    }

 
}