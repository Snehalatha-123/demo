import java.util.Scanner;

public class StudentClient {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StudentDaoImpl daoImpl = new StudentDaoImpl();
		while (true) {
			System.out.println("==============================================");
			System.out.println("             1)AddStudents                    ");
			System.out.println("             2)ViewAllStudents                    ");
			System.out.println("             3)viewStudent                    ");
			System.out.println("             4)Exit                    ");
			System.out.println("==============================================");
			System.out.println("Enter The Choise");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				daoImpl.addStudents();
				break;
			case 2:
				Student[] viewAllStudents = daoImpl.viewAllStudents();
				System.out.println("SNO \t SNAME \t SADD \t  EMAIL");
				if(viewAllStudents!=null)
				{
				for (Student stu : viewAllStudents) {
					System.out.println(
							stu.getSno() + "\t" + stu.getSname() + "\t" + stu.getSadd() + "\t" + stu.getEmail());
				}
				}
				else
				{
					System.out.println("Resources not found");
				}

				break;
			case 3:
				System.out.println("Enter Student Number :");
				Student stu = daoImpl.viewStudent(sc.nextInt());
				System.out.println("SNO \t SNAME \t SADD \t  EMAIL");

				if (stu != null)
					System.out.println(
							stu.getSno() + "\t" + stu.getSname() + "\t" + stu.getSadd() + "\t" + stu.getEmail());
				else
					System.out.println("Given Student Record Not Found");

				break;
			case 4:
				System.out.println("Thx for Using App!");
				System.exit(0);
			default:
				System.out.println("Choose 1 to 4 Between");

			}// end of switch

		} // end of while
	}

}
