import java.util.Scanner;

import com.products.pojo.Product;
import com.products.pojo.ProductDaoImpl;

	public class ProductClient {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			ProductDaoImpl   daoImpl = new ProductDaoImpl();
			while (true) {
				System.out.println("=============================================");
				System.out.println("             1)Add product                   ");
				System.out.println("             2)ViewAllProduct                 ");
				System.out.println("             3)viewProduct                    ");
				System.out.println("             4)Buy Product                    ");
				System.out.println("             5)Exit                           ");
			    System.out.println("==============================================");
				System.out.println("Enter The Choise");
				int choice = sc.nextInt();
				switch (choice) {
				case 1:
					daoImpl.addProducts();
					break;
				case 2:
					Product[] viewAllProduct = daoImpl.viewAllproducts();
					System.out.println("PID \t PNAME \t QTY \t  PRICE");
					if(viewAllProduct!=null)
					{
					for (Product stu :  viewAllProduct) {
						System.out.println(
								stu.getPid() + "\t" + stu.getPname() + "\t" + stu.getQty() + "\t" + stu.getPrice());
					}
					}
					else
					{
						System.out.println("Resources not found");
					}

					break;
				case 3:
					System.out.println("Enter Product Number :");
					Product stu = daoImpl.viewproduct(sc.nextInt());
					System.out.println("PNO \t PNAME \t PQTY \t  PRICE");

					if (stu != null)
						System.out.println(stu.getPid() + "\t" + stu.getPname() + "\t" + stu.getQty() + "\t" + stu.getPrice());
					else
						System.out.println("Given Product Record Not Found");

					break;
				case 4:
				//	System.out.println("Enter which productdo want to buy:");
				//	Product pro = daoImpl.viewproduct(sc.nextInt());
				//	System.out.println("PNO \t PNAME \t PQTY \t  PRICE");

					 daoImpl.viewproduct(Product.Pname);
					 break;
					
					
				case 5:
					System.out.println("Thx for Using App!");
					System.exit(0);
				default:
					System.out.println("Choose 1 to 4 Between");

				}// end of switch

			} // end of while

		}

	}

