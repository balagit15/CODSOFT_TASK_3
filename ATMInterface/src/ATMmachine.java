public class ATMmachine
{
    int ATMcash=100000;
    userAccount user = new userAccount();
    public void withDraw(int amount)
    {
         if(amount<ATMcash && amount < user.userAmount)
         {
             ATMcash-=amount;

             user.userAmount-=amount;
             System.out.println("Cash Recieved: "+amount+"!!");
             System.out.println("Transaction Sucessfull!!");
         }
         else {
             System.out.println("ATM do no have enough money....!!");
             System.out.println("Transaction failed!!");
         }

    }
    public void deposit(int amount)
    {
        if(amount<50000) {

            user.userAmount += amount;
            System.out.println("Amount deposited!!");
            System.out.println("transaction Successfull");
        }
        else {
            System.out.println("only amount less than 50000 can be deposited!!");
            System.out.println("Transaction failed!!");
        }
    }
    public void checkBalance()
    {

        System.out.println("Available Balance: "+user.userAmount);
    }



}

