import java.util.Scanner;

public class StudentDaoImpl {
	Scanner sc = new Scanner(System.in);
	Student addStu[] = null;

public	void addStudents() {
		System.out.println("How many Students are joining :");
		int size = sc.nextInt();
		addStu = new Student[size];
		for (int i = 0; i < addStu.length; ++i) {
			System.out.println("Enter Student Number :");
			int sno = sc.nextInt();
			System.out.println("Enter Student Name :");
			String sname = sc.next();
			System.out.println("Enter Student Address :");
			String sadd = sc.next();
			System.out.println("Enter Student Email :");
			String email = sc.next();
			Student stu = new Student(sno, sname, sadd, email);
			addStu[i] = stu;
			System.out.println("Student Registred Successfully");

		}

	}

public	Student[] viewAllStudents() {
		return addStu;
	}

public	Student viewStudent(int sno) {
	if(addStu!=null)
	{
		for(Student st : addStu)
		{
			if(st.getSno()==sno)
			{
				return st;
			}
		}
}
	return null;

	}


	}

