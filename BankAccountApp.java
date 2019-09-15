
package bankaccountapp;

import java.util.LinkedList;
import java.util.List;

/**
 *DOSUNMU IBRAHIM 
 * 15-9-19
 * Bank Account application 
 * 
 */
public class BankAccountApp {

    
    public static void main(String[] args) {
       List<Account> accounts = new LinkedList<Account>();
       String file =  "C:\\Users\\HP\\Documents\\NetBeansProjects\\BankAccountApp\\src\\bankaccountapp\\NewAccount.txt";
       
       List<String[]> newAccountHolders  = new LinkedList<>();
       newAccountHolders = FileRead.reader(file);
       for (String[] accountHolder: newAccountHolders) {
    	   
    	  
    	   if (accountHolder[2].equalsIgnoreCase("Current")) {
    		   accounts.add(new Current(accountHolder[0], accountHolder[1], Double.parseDouble(accountHolder[3])));
    	   }
    	   else if (accountHolder[2].equals("Savings")) {
    		
        	   accounts.add(new Savings(accountHolder[0], accountHolder[1], Double.parseDouble(accountHolder[3])));
        	   }
    	   else {
    		   System.out.println(" AN ERROR OCCURED ");
    	   }
    	   System.out.println("\n###########################\n");
    	   }
      
    }
    
}
