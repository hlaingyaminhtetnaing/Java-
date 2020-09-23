public class SavingAccount {
    int balance;
    SavingAccount deposit(int amount){
        balance+=amount;
        return this;
    }
    SavingAccount printBalance()
    {
        System.out.println(balance);
        return this;
    }
    public static void  main(String[] args)
    {
     //new SavingAccount().deposit(700000).printBalance();
        SavingAccount sa=new SavingAccount();
        sa.deposit(10000).printBalance();
        sa.deposit(300).printBalance();
        SavingAccount sa1=new SavingAccount();
        sa1.deposit(10000).printBalance();
        sa1.deposit(30000).printBalance();
    }
}
