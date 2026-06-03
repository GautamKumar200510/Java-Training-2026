public class Bank {
    private int accId;
    private String name,email;
    private double balance;

    public void createAccount(int id , String nm, String em , double bal){
        accId = id;
        name = nm;
        email = em;
        balance = bal;

    }
    public void show(){
        System.out.println("=============Bank Details==============");
        System.out.println("AccountId" + accId);
        System.out.println("Name" + name);
        System.out.println("Email" + email);
        System.out.println("Balance" + balance);
    }
    public void withdraw(double amount ){
        System.out.println("--------------Inside Deposit-----------");
        balance = balance+amount;
        System.out.println("After Deposit Balance" + balance);
    }
    public double getBalance(){
        System.out.println("Balance Details");
        return balance;
    }

    }


