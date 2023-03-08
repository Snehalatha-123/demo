package Account1;

public class CheckingAccount {
	int NoOfFreeTransactions = 3;
    Account ac = new Account("12345","Sneha","9951627567",4000.00);
    {
	    for(int i=0;i<=5;i++) {
	        if(i>=2) {
	            ac.ammount = 50-ac.ammount;
	        }else if(i>=5) {
	            ac.ammount = 100-ac.ammount;
	        }
	    }
    }
}
