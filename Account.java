package bankaccountapp;


public abstract class Account implements InterestBaseRate { 
    private String name;
    private String NIN;
    protected String acctNo;
    private double balance; 
    protected double rate; 
    
    private static int index = 1000;
    
    public Account(String name, String NIN, double initDeposit){
        this.name = name;
        this.NIN = NIN;
        this.balance = initDeposit; 
        
        index++;  
       
    } 
    
    public abstract void setRate();
    
    public String setAccountNumber(int num){
       String  lastThree = NIN.substring(NIN.length()-3, NIN.length());
       int uniqueID = index;
       int rand = (int) (Math.random() * 1000); 
       
       return num + "" + lastThree + "" + uniqueID + "" + rand;
    } 
    
    public void showInfo(String acct){
        System.out.println("ACCOUNT NAME: "+ this.name+ "\nACCOUNT NUMBER: "+ acct+ 
                            "\nACCOUNT BALANCE: N" + this.balance);
    }
    
    // Common Transactions 
    public void deposit(double amount){
        balance += amount;
        System.out.println("CREDIT: N" +amount);
        printbalance();
    }
    
     public void withdraw(double amount){
        balance -= amount;
        System.out.println("DEBIT: N" +amount);
        printbalance();
    }
    
    public void transfer(double amount, String toWho){
        balance -= amount;
        System.out.println("TRANSFER TO " + toWho 
                    + "\n DEBIT: N" + amount) ;
        printbalance();
    }
    
    public void printbalance(){
        System.out.println("ACCOUNT BALANCE: N" +balance);
    }
    
        // Annual interest 
     public void interest(){
        double accruedInterest = balance * (rate/100);
        balance += accruedInterest;
        System.out.println("Accrued  Interest: N" + accruedInterest);
        printbalance();
     }
     
}
