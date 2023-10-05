import java.util.*;
public class Bank_Account {
    private long accountNo;
    private String userName;
    private String email;
    private String accountType;
    private double accountBalance;

    public void GetAccountDetails() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter Account No.: ");
            this.accountNo = scanner.nextLong();
            System.out.print("Enter User Name: ");
            this.userName = scanner.next();
            System.out.print("Enter Email: ");
            this.email = scanner.next();
            System.out.print("Enter Account Type: ");
            this.accountType = scanner.next();
            System.out.print("Enter Account Balance: ");
            this.accountBalance = scanner.nextDouble();
        }
    }

    public void DisplayAccountDetails() {
        System.out.println("Account No.: " + this.accountNo);
        System.out.println("User Name: " + this.userName);
        System.out.println("Email: " + this.email);
        System.out.println("Account Type: " + this.accountType);
        System.out.println("Account Balance: " + this.accountBalance);
    }

    public static void main(String[] args) {
        Bank_Account account = new Bank_Account();
        account.GetAccountDetails();
        account.DisplayAccountDetails();
    }
}
/*Create a class named Bank_Account with Account_No, User_Name, Email, Account_Type and Account_Balance data members. Also create a method GetAccountDetails()
and DisplayAccountDetails(). Create main method to demonstrate the Bank_Account class.*/
