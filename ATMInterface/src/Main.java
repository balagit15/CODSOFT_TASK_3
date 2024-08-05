//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int amount;
        System.out.println("Welcome to ATM!!!\nSelect following options");
        ATMmachine transaction = new ATMmachine();
        Scanner si = new Scanner(System.in);
        while(true)
        {

            System.out.println("1-withdraw\n2-deposit\n3-checkBalance\n4-exit");
            int opt = si.nextInt();
            switch(opt)
            {
                case 1:
                    System.out.println("Enter amount : ");
                     amount = si.nextInt();
                    transaction.withDraw(amount);
                    break;
                case 2:
                    System.out.println("Enter amount : ");
                     amount = si.nextInt();
                     transaction.deposit(amount);
                     break;
                case 3:
                    transaction.checkBalance();
                    break;
                case 4:
                    System.out.println("Thank you....come again!!");
                    return;
            }
            System.out.println("-----------------------------------------------");

        }
    }
}