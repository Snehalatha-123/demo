package Com.cargo;

import java.util.Scanner;

public class CargoDaoimpl implements CargoDao {

	@Override
	public void displayCargoDetails() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Cargo cg = new Cargo();
		System.out.println("Enter the Cargodetails are: ");
		System.out.println("Enter the Name");
		cg.setName(sc.next());
		System.out.println("Enter the Decription");
		cg.setDescription(sc.next());
		cg.setDescription(sc.next());
		System.out.println("Enter the Length");
		cg.setLength(sc.nextDouble());
		System.out.println("Enter the width");
		cg.setWidth(sc.nextDouble());
		System.out.println("name:" +cg.getName());
		System.out.println("Description:" +cg.getDescription());
		System.out.println("length:" +cg.getLength());
		System.out.println("width:" +cg.getWidth()
		);
	}

}
