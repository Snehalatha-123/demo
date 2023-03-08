

public class Student {
	int sno;
	String sname;
	String sadd;
	String email;
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSadd() {
		return sadd;
	}
	public void setSadd(String sadd) {
		this.sadd = sadd;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int sno, String sname, String sadd, String email) {
		super();
		this.sno = sno;
		this.sname = sname;
		this.sadd = sadd;
		this.email = email;
	}

	}
