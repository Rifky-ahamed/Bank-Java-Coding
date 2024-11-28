import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bank b1 = new Bank();
    }
}

class Bank extends Customer{
    Bank(){
        Scanner input = new Scanner(System.in);
        while (true){
            System.out.println("\t\tOPTIONS");
            System.out.println("1.Deposit Money");
            System.out.println("2.Withdraw Money");
            System.out.println("3.Check Balance");
            System.out.println("4.Exit");
            System.out.print("Select The Option: ");
            int value = input.nextInt();
            System.out.println();
            if(value > 0 && value <= 4) {
                switch (value) {
                    case 1:
                        System.out.print("How much your deposit: ");
                        int deposit = input.nextInt();
                        deposit(deposit);
                        break;

                    case 2:
                        System.out.print("Your Withdraw Amount: ");
                        int withdraw = input.nextInt();
                        withdraw(withdraw);
                        break;

                    case 3:
                        System.out.println("Your Balance");
                        System.out.println(getAccountBalance());
                        break;

                    case 4:
                        System.out.println("Successfully Exited");
                        return;
                }
            }
            else{
                System.out.println("invalid input");
            }
        }
    }

    public void deposit(int depositValue){
        setAccountBalance(depositValue);
    }

    public void withdraw(int withdrawValue){
        withdrawMoney(withdrawValue);
    }
}

class Customer{
    Customer(){

    }
    private String name;
    private int accountBalance ;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name ;
    }

    public void setAccountBalance(int accountBalance) {
        this.accountBalance += accountBalance ;
    }

    public int getAccountBalance() {
        return this.accountBalance ;
    }

    public void withdrawMoney(int withdraw){
        if(accountBalance > 0 && withdraw < accountBalance) {
            this.accountBalance = this.accountBalance - withdraw;
        }
        else {
            System.out.println("Check your balance ");
        }
    }
}