package Com.petition;

import java.util.Scanner;

public class PClient {

		public static void main(String[] args) {
			FinancialPetition fp = new FinancialPetition(1,"Sneha", "29/08/2022", "Hyderabad", "Kphb", "Adhar Problem", false, "10000");
			NonFinancial_Petition nfp = new NonFinancial_Petition("siva", "29/08/2022");
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Please Choose Either 1 nor 2..");
			System.out.println("Enter 1 for Financial Petition");
			System.out.println("Enter 2 for Non-Financial Petition");
			int choice = sc.nextInt();
			while(true) {
				switch(choice){
				case 1:fp.display();
				break;
				
				case 2:nfp.display();
				break;
				
				default:System.out.println("Please enter valid Option");
				}
			}
		}