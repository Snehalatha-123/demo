package Ass;

import java.util.ArrayList;
import java.util.List;

class DisplayEmployees{
static List<Employee> emp = new ArrayList<>();
public static void displayemployees() {
	emp.add(new Employee(121,"Sneha","Java",50000,"Hyderabad", 895575895, 2));
	emp.add(new Employee(122,"deepthi","Java",40000,"Hyderabad",985546754, 2));
	emp.add(new Employee(123,"Sana","Java",60000,"Hyderabad",955076855, 2));
	emp.add(new Employee(124,"Teja","Java",70000,"Hyderabad",885469475, 2));
	emp.add(new Employee(125,"Dinesh","Java",60000,"Hyderabad",884325954, 2));
	System.out.println(emp);
	
}
public void Square() {
	int n=10;
	for(int i=0;i<n;i++) {
		if((i^2)+1==1) {
			System.out.println("The Happy Number is :");
			System.out.println(i);
		}
	}
}
}
