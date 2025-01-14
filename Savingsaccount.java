package guvitask5;


		public class Savingsaccount extends Bankaccount {
			
		    public Savingsaccount(String accountNumber, double balance) {
		        super(accountNumber, balance);
		    }

		    public void withdraw(double amount) {
		        if (getBalance() - amount < 100) {
		            System.out.println("Minimum balance of $100 required!");
		        } else {
		            super.withdraw(amount);
		        }
		    }
		

		
		    public static void main(String[] args) {
		        System.out.println("Create a Bank Account object (A/c No. BA1234) with initial balance of $500:");
		        Bankaccount SA77 = new Bankaccount("BA1234", 500);

		        System.out.println("Deposit $1000 into account SA77:");
		        SA77.deposit(1000);
		        System.out.println("New balance after depositing $1000: $" + SA77.getBalance());

		        System.out.println("Withdraw $600 from account SA77:");
		        SA77.withdraw(600);
		        System.out.println("New balance after withdrawing $600: $" + SA77.getBalance());

		        
		    }
		
		    
	}
/*output
 * Create a Bank Account object (A/c No. BA1234) with initial balance of $500:
Deposit $1000 into account SA77:
New balance after depositing $1000: $1500.0
Withdraw $600 from account SA77:
New balance after withdrawing $600: $900.0*/
 * 
 */

