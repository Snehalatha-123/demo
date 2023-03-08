package Account1;

import java.util.Scanner;

public class Account {
	    String AccNo;
	    String Name;
	    String MobileNumber;
	    Double ammount;

	
	    public Account(String accNo, String name, String mobileNumber,Double ammount) {
	        super();
	        AccNo = accNo;
	        Name = name;
	        MobileNumber = mobileNumber;
	        this.ammount = ammount;

	    }

	    public void Deposite(){
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Welcome to Deposite Section ? ");

	        System.out.println("Enter the how much ammount do you want to Deposite");
	        double Depositemoney = sc.nextDouble();
	        ammount += Depositemoney;
	        System.out.println("Ammount Deposited Succesfully:");
	        System.out.println("Current Balence is:"+ammount);
	    }

	    public  void Withdraw(){
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Welcome to Withdraw Section ?");
	        System.out.println("Enter amont:");
	        double money = sc.nextDouble();
	        ammount -= money;
	        System.out.println("Ammount Withdrawn Succesfully:");
	        System.out.println("Current Bal is:"+ammount);
	        CheckingAccount ca = new CheckingAccount();
	    }
	
	
		
	
	    public void getBalence(){
	        System.out.println("Welcome To Balence Section");
	        System.out.println("Balence is:"+ammount);
	    }
}
