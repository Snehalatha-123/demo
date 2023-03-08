package Account1;

public class SavingAccount {
Account ac = new Account("12345","Sneha","9951627567",4000.00);
    double interestRatePerMonth = 5,res;
    public void InterestRate() {
    	res = (ac.ammount*interestRatePerMonth)/100;
    }
    public void AddInterest() {
    	InterestRate();
    	System.out.println("Added Interest is: " +res);
    	res +=ac.ammount;
    	System.out.println("Ttotal ammount is: " +res);
    }
}
