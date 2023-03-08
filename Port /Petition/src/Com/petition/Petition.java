package Com.petition;

public class Petition {
private int PetitionId;
private String Name;
private String DateRegistered;
private String Location;
private String City;
private String ProblemDescription;
private String Status;

public Petition(int petitionId, String name, String dateRegistered, String location, String city,
		String problemDescription, String b) {
	super();
	Name = name;
	DateRegistered = dateRegistered;
	Location = location;
	City = city;
	ProblemDescription = problemDescription;
	Status = b;
}

public Petition(int petitionId2, String name2, String dateRegistered2, String location2, String city2,
		String problemDescription2, boolean b) {
	// TODO Auto-generated constructor stub
}

public void Petition11(int petitionId2, String name2, String dateRegistered2, String location2, String city2,
		String problemDescription2, boolean b) {
	// TODO Auto-generated constructor stub
}

public int getPetitionId() {
	return PetitionId;
}

public void setPetitionId(int petitionId) {
	PetitionId = petitionId;
}

public String getName() {
	return Name;
}

public void setName(String name) {
	Name = name;
}

public String getDateRegistered() {
	return DateRegistered;
}

public void setDateRegistered(String dateRegistered) {
	DateRegistered = dateRegistered;
}

public String getLocation() {
	return Location;
}

public void setLocation(String location) {
	Location = location;
}

public String getCity() {
	return City;
}

public void setCity(String city) {
	City = city;
}

public String getProblemDescription() {
	return ProblemDescription;
}

public void setProblemDescription(String problemDescription) {
	ProblemDescription = problemDescription;
}

public String getStatus() {
	return Status;
}

public void setStatus(String status) {
	Status = status;
}

}