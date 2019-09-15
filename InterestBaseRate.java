
 package bankaccountapp;


public interface InterestBaseRate {
    // The base rate is 2.5% 
    
    default double getRate(){
        return 2.5;
    }
}
