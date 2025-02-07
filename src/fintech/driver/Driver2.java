package fintech.driver;
import java.util.Scanner;
import fintech.model.Transaction;
import fintech.model.Account;

/**
 * @author NIM Nama
 * @author NIM Nama
 */
public class Driver2 {

    public static void main(String[] _args) {

        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        String owner = scanner.nextLine();
        String accountName = scanner.nextLine();
        String command2 = scanner.nextLine();
        String accountName2 = scanner.nextLine();
        double amount = scanner.nextDouble(); 
        scanner.nextLine();  
        String posted = scanner.nextLine();
        String note = scanner.nextLine();
        double balance = 0.0;
        double balanceAfterTransaction = 0 ; 
        balanceAfterTransaction = balanceAfterTransaction + amount;
        String id = "1";
        scanner.close();
        if ("create-account".equals(command)) {
            Account account = new Account(owner, accountName,balance);
            System.out.println(account);
        }
        if ("create-transaction".equals(command2)) {
            Transaction transaction = new Transaction(id,accountName,amount, posted, note, balanceAfterTransaction);
            System.out.println(transaction);
        } 
        else {
            System.out.println("Invalid command");
        }

    }

}