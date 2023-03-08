package Ass;

public class Employee {
private int Eid;
private String Ename;
private String Edept;
private float Esal;
private String Eaddress;
private long Ephoneno;
private int Experience;


public Employee(int eid, String ename, String edept, float esal, String eaddress, long ephoneno, int experience) {
	super();
	Eid = eid;
	Ename = ename;
	Edept = edept;
	Esal = esal;
	Eaddress = eaddress;
	Ephoneno = ephoneno;
	Experience = experience;
}

public Employee() {
	super();
	// TODO Auto-generated constructor stub
}

public int getEid() {
	return Eid;
}

public void setEid(int eid) {
	Eid = eid;
}

public String getEname() {
	return Ename;
}

public void setEname(String ename) {
	Ename = ename;
}

public String getEdept() {
	return Edept;
}

public void setEdept(String edept) {
	Edept = edept;
}

public float getEsal() {
	return Esal;
}

public void setEsal(float esal) {
	Esal = esal;
}

public String getEaddress() {
	return Eaddress;
}

public void setEaddress(String eaddress) {
	Eaddress = eaddress;
}

public long getEphoneno() {
	return Ephoneno;
}

public void setEphoneno(long ephoneno) {
	Ephoneno = ephoneno;
}

public int getExperience() {
	return Experience;
}

public void setExperience(int experience) {
	Experience = experience;
}

@Override
public String toString() {
	return "Employee [Eid=" + Eid + ", Ename=" + Ename + ", Edept=" + Edept + ", Esal=" + Esal + ", Eaddress="
			+ Eaddress + ", Ephoneno=" + Ephoneno + ", Experience=" + Experience + "]";
}
}
