
package bankaccountapp;


public class Savings extends Account { 
  

  private  String safetyDepositBoxID;
  private  int safetyDepositBoxPIN;
    
    public Savings(String name, String NIN, double initDeposit){
        super(name, NIN, initDeposit);
        acctNo = setAccountNumber(6);
        showInfo(acctNo);
        System.out.println("ACCOUNT TYPE: SAVINGS");
        setSafetyDepositBox();
        setRate();
    } 
    
    //NB:  Interest rate for Savings account is .25 less than the base rate
    @Override 
    public void setRate(){
        rate = getRate() - .25;
        System.out.println(" INTEREST RATE: " + rate + "%") ;
    }
    
     private void setSafetyDepositBox(){
      this.safetyDepositBoxID = "B" + Integer.toString((int) (Math.random() * 1000));
      this.safetyDepositBoxPIN = (int) (Math.random() * 10000);
            System.out.println(
                  " Your Savings Account Features:"
                  + "\n SAFETY DEBOSIT BOX ID: " + safetyDepositBoxID
                + " \n SAFETY DEPOSIT BOX PIN: " + safetyDepositBoxPIN
        ); 
  }
 
        
}
