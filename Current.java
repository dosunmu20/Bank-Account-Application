
package bankaccountapp;


public class Current extends Account { 

    private long debitCardNo;
    private int PIN;
    
  public Current(String name, String NIN, double initDeposit){
        super(name, NIN, initDeposit);
        acctNo = setAccountNumber(5);
        showInfo(acctNo);
        System.out.println("ACCOUNT TYPE: CURRENT");
        setDebitCard();
        setRate();
    } 
  
     //NB:  Interest rate for Current account is 15% of the base rate
    @Override 
    public void setRate(){
        rate = getRate() * .15;
        System.out.println("INTEREST RATE: " + rate + "%") ;
    }
    
  private void setDebitCard(){
      this.debitCardNo = (long) (Math.random() * Math.pow(10, 12));
      this.PIN = (int) (Math.random() * Math.pow(10, 4));
       System.out.println(
                  " Your Current Account Features:"
                  + "\n DEBIT CARD NUMBER: " + debitCardNo
                + " \n DEBIT CARD PIN: " + PIN
        ); 
  }
  
}
