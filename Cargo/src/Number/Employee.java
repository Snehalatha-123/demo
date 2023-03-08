package Number;


	public class Employee {
		private int Eid;
		private String Ename;
		private String Edept;
		private double Esal;
		private String  Eaddress;
		private long Ephoneno;
		private int Eexperience;
		private int age;
		public Employee() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Employee(int eid, String ename, String edept, double esal, String eaddress, long ephoneno, int eexperience,
				int age) {
			super();
			Eid = eid;
			Ename = ename;
			Edept = edept;
			Esal = esal;
			Eaddress = eaddress;
			Ephoneno = ephoneno;
			Eexperience = eexperience;
			this.age = age;
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
		public double getEsal() {
			return Esal;
		}
		public void setEsal(double esal) {
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
		public int getEexperience() {
			return Eexperience;
		}
		public void setEexperience(int eexperience) {
			Eexperience = eexperience;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		@Override
		public String toString() {
			return "Employee [Eid=" + Eid + ", Ename=" + Ename + ", Edept=" + Edept + ", Esal=" + Esal + ", Eaddress="
					+ Eaddress + ", Ephoneno=" + Ephoneno + ", Eexperience=" + Eexperience + ", age=" + age + "]";
		}
}
