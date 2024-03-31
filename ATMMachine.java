import java.util.Scanner;

class ATM{

    float Balance;
    int PIN = 5674;

    public void checkpin(){
        System.out.println("enter your pin : ");
        Scanner sc = new Scanner(System.in);
        int enteredpin = sc.nextInt();

        if (enteredpin == PIN){
            menu();

        }
        else {
            System.out.println(" INVALID PIN NUMBER !!");
            menu();
        }

    }

    public void menu(){
        System.out.println("Enter Your Choice: ");
        System.out.println("1.Check AC Balance: ");
        System.out.println("2.Withdraw Money: ");
        System.out.println("3.Deposit Money: ");
        System.out.println("4.Exit: ");

        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();

        if(opt == 1){
            checkBalance();
        }
        else if (opt==2) {
            withdrawMoney();
        }
        else if (opt==3) {
            depositMoney();
        }
        else if (opt==4) {
            return;
        }
        else {
            System.out.println("enter valid choice");
        }

}

        public void checkBalance(){
            System.out.println("Balance :" + Balance);
            menu();
    }
        public void withdrawMoney(){
            System.out.println("Enter Amount to Withdraw : ");
            Scanner sc = new Scanner(System.in);
            float amount = sc.nextInt();
            if (amount>Balance){
                System.out.println("Insufficiant Balance");
            }
            else {
                Balance = Balance - amount;
                System.out.println("withdraw succesfull");
            }

            menu();

        }

        public void depositMoney(){
            System.out.println("enter amount deposit");
            Scanner sc = new Scanner(System.in);
            float amount = sc.nextFloat();
            Balance = Balance+amount;
            System.out.println("Money Deposit Successfully");
            menu();
        }
}


    public class ATMMachine {
        public static void main(String[]args){

            ATM obj = new ATM();
            obj.checkpin();
        }
    }
