package Account1;

public class CurrentAccount {
	 Account ac = new Account("12345","Sneha","9951627567",4000.00);

	    double interestRatePerMonth = 10,res;
	    public void InterstRate(){
	         res = (ac.ammount*interestRatePerMonth)/100;
	    }

	    public void AddInterst(){
	        InterstRate();
	        System.out.println("Added Interst Amont is:"+res);
	        res += ac.ammount;
	        System.out.println("Total amont is:"+res); 
	    }
}
