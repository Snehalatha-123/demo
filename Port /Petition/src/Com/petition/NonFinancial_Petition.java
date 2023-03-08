package Com.petition;

public class NonFinancial_Petition {
private String Citizen;
private String ImpDate;
public NonFinancial_Petition(String citizen, String impDate) {
	super();
	Citizen = citizen;
	ImpDate = impDate;
}
public void display(){
	System.out.println("Welcome to Non-FinancialPetition");
	System.out.println("Petition CitizenName is:"+Citizen);
	System.out.println("Petition ImplementationDate is:"+ImpDate);
}
}
