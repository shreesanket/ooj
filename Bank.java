import java.util.*;

class Account {
    String name;
    int accno;
    String type;
    double balance;

    Account(String name, int accno, String type, double balance) {
        this.name = name;
        this.accno = accno;
        this.type = type;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        if ((balance - amount) >= 0) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }

    void display() {
        System.out.println("Name : " + name + "\n" +
                "AccountNo : " + accno + "\n" +
                "Type : " + type + "\n" +
                "Balance: " + balance + "\n");
    }
}

class SavingAccount extends Account {
    private static int rate = 5;

    SavingAccount(String name, int accno, String type, double balance) {
        super(name, accno, type, balance);
    }

    void balanceWithInterest() {
        balance += balance * rate / 100;
        System.out.println("Balance: " + balance);
    }
}

class CurrentAccount extends Account{

    private double minbal=500;
    private double servicecharges=50;
    CurrentAccount(String name, int accno, String type, double balance) {
        super(name, accno, type, balance);
    }
    void checkmin(){
        if(balance<minbal){
            System.out.println("Balene is less then min balence,service charges imposed:"+servicecharges);
            balance-=servicecharges;
            System.out.println("Balence is:"+balance);
        }
    }



}

public class Bank {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = s.nextLine();

        System.out.println("Enter the account type (savings or deposit)");
        String type = s.next();

        System.out.println("Enter the account number: ");
        int accno = s.nextInt();

        System.out.println("Enter the initial balance: ");
        double balance = s.nextDouble();

        double amount1,amount2;
        Account acc = new Account(name, accno, type, balance);
        SavingAccount sa = new SavingAccount(name, accno, type, balance);
        CurrentAccount cu=new CurrentAccount(name,accno,type,balance);

        

        while (true) {
            if (acc.type.equals("savings")) {
                System.out.println("\n-------MENU------\n");
                System.out.println("1. Deposit \n2. Withdraw \n3. Compute interest for SavingsAccount \n4. Display Account Details\n5. Exit\n");

                System.out.println("Enter your choice");
                int choice = s.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Enter the deposit amount");
                        amount1 = s.nextDouble();
                        sa.deposit(amount1);
                        break;
                    case 2:
                        System.out.println("Enter the withdrawal amount ");
                        amount2 = s.nextDouble();
                        sa.withdraw(amount2);
                        break;
                    case 3:
                        sa.balanceWithInterest();
                        break;
                    case 4:
                        System.out.println("Details: ");
                        sa.display();
                        break;
                    case 5:
                        return;
                    default:
                        System.out.println("Invalid choice ");
                }
            }
            else{
                System.out.println("\n-------MENU------\n");
                System.out.println("1. Deposit \n2. Withdraw \n3. display \n4. Exit\n");

                System.out.println("Enter your choice");
                int choice = s.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("Enter the amount");
                        amount1 = s.nextDouble();
                        cu.deposit(amount1);
                        break;
                    case 2:
                        System.out.println("Enter the withdrawal amount ");
                        amount2 = s.nextDouble();
                        cu.withdraw(amount2);
                        break;
                    
                    case 3:
                        System.out.println("Details: ");
                        cu.display();
                        break;
                    case 4:
                        return;
                    default:
                        System.out.println("Invalid choice ");
                }


            }
        }
    }
}
