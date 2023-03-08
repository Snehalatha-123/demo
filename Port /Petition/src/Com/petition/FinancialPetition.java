package Com.petition;

public class FinancialPetition extends Petition{
	private String Amount;

public FinancialPetition(int petitionId, String name, String dateRegistered, String location, String city,
			String problemDescription, boolean b,String string) {
	super(petitionId, name, dateRegistered, location, city, problemDescription, b);
		Amount = string;
}

public void display(){
	System.out.println("************Welcome to FinancialPetition************");
	System.out.println("PetitionId is:"+getPetitionId());
	System.out.println("Petition Name is:"+getName());
	System.out.println("Petition DateRegistered is:"+getDateRegistered());
	System.out.println("Petition Location is:"+getLocation());
	System.out.println("Petition City is:"+getCity());
	System.out.println("Petition ProblemDescription is:"+getProblemDescription());
	System.out.println("Petition Status is:"+getStatus());
	System.out.println("Petition amont is:"+Amount);
	System.out.println("****************************************************");
}
}
