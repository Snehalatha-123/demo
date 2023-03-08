package Number;

	import java.util.ArrayList;

	import java.util.Comparator;
	import java.util.List;
	import java.util.Optional;
	import java.util.Scanner;
	import java.util.stream.Collector;
	import java.util.stream.Collectors;

	public class Employeedetails {
		List<Employee>emp=new ArrayList<>();
		int total=0;
		
		public void displayDetails()
		{
			
			Scanner sc = new Scanner(System.in);
			System.out.println("enter number of employee details you want to add ");
			int val=sc.nextInt();
			for(int i =0;i<val;i++) {
		   System.out.println("enter Eid ");
		   int eid=sc.nextInt();
		   System.out.println("enter Ename ");
		   String name =sc.next();
		   System.out.println("enter Edept");
		   String dept=sc.next();
		   System.out.println("enter Esal");
		   double sal=sc.nextDouble();
		   System.out.println("enter Eaddress");
		   String add=sc.next();
		   System.out.println("enter Ephoneno");
		   long phno=sc.nextLong();
		   System.out.println("enter Eexperience ");
		   int exp=sc.nextInt();
		   System.out.println("enter age ");
		   int age=sc.nextInt();
		   Employee empi=new Employee(eid,name,dept,sal,add,phno,exp,age);
		   emp.add(empi);
			}
		}
		public void eldestAndYoungestEmployee()
		{
			if(emp!=null)
			{
			Employee eldest  =emp.stream().max(Comparator.comparing(Employee::getAge)).orElse(null);
			Employee youngest=emp.stream().min(Comparator.comparing(Employee::getAge)).orElse(null);
			System.out.println(" eldest employee " + eldest);
			System.out.println(" ypungest  employee " + youngest );
			}
		}
		public void age30()
		{
			List<Employee>age30=emp.stream().filter(q->q.getAge()<30).collect(Collectors.toList());
			System.out.println(age30);
		}
		public void minSalary()
		{
			Employee emp1=emp.stream().min(Comparator.comparing(Employee::getEsal)).orElse(null);
			System.out.println(" minimum salssry "+emp1);
		}
		public void maxSalary()
		{
			Employee emp1=emp.stream().max(Comparator.comparing(Employee::getEsal)).orElse(null);
			System.out.println("maximum salary  " +emp1);
			
		}
		
		public void checkHappyNumber()
		{
			for(int i =0;i<emp.size();i++)
			{
				for(Employee em : emp) {
					int a=em.getEid();
			  
					while(a>0)
					{
					   int rem=a%10;
					   int sqr=rem*rem;
					   total=total+sqr;
					   a=a/10;
					}
					
					while(total>0)
					{
						int rem1=total%10;
						total=total/10;
						int rem2=total%10;
						if(rem1+rem2==1) {
							System.out.println(a + " is happy number ");
						}
						else {
							System.out.println(a + " is happy number ");
							
						}
						a=total;
					}
					}
				}
				}
}
