package fintech.driver;
import java.util.Scanner;
import fintech.model.Account;

/**
 * @autor 12S23002 Fernando Silitonga
 * @autor 12S23044 Gracia Pardede
 */

public class Driver1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        String command = scanner.nextLine();
        String owner = scanner.nextLine();
        String accountName = scanner.nextLine();
 
       
        if (command.equals("create-account")) {
          
            double balance = 0.0;
            Account account = new Account(owner, accountName, balance);

            System.out.println(account);
        } else {
            System.out.println("Invalid command");
        }

        scanner.close();
    }
}