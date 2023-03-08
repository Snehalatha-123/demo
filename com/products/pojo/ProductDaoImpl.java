package com.products.pojo;
import java.util.Scanner;

public class ProductDaoImpl {
	Scanner sc=new Scanner(System.in);
	Product addpro[] = null;
	public void addProducts() {
		System.out.println("how many products");
		int size = sc.nextInt();
		addpro = new Product[size];
		for(int i = 0;i < addpro.length;i++)
		{
			System.out.println("Enter product id");
			int pid = sc.nextInt();
			System.out.println("Enter product name");
			String pname = sc.next();
			System.out.println("Enter Product Quantity");
			String qty = sc.next();
			System.out.println("Enter price ");
			int price = sc.nextInt();
			Product pro = new Product();
			addpro[i]=pro;
			System.out.println("Product Registerd Sucessfully");
		}
	}
	public Product[] viewAllproducts() {
		return addpro;
	}
	public Product viewproduct(int pno)
	{
		if(addpro!=null) {
			for(Product pro: addpro)
			{
				if(pro.getPid() == pno)
				{
					return pro;
				}
			}
		}
		return null;
	}
	public String pname;
	 
	public void buyProduct(String pname)
	{
		System.out.println("Enter which productdo want to buy:");
		int proid =sc.nextInt();
		if( addpro!=null)
		{
			for(Product prod: addpro)
			{
				System.out.println(prod.getPid()+ "\t" +prod.getPname()+ "\t" +prod.getQty()+"\t" +prod.getPrice());
				System.out.println("Enter the product qty:");
				int qty=sc.nextInt();
				if(qty>0&&qty<=prod.getQty())
				{
					double totalPrice=prod.getPrice()*qty;
					System.out.println(prod.getPid()+ "total cost is :" +qty+"X"+prod.getPrice()+ "="+totalPrice);
					prod.setQty(prod.getQty()-qty);
					
				}
			}
		}
		else
		{
			System.out.println("noProduct there instore by " +pname);
		}
		
	}
	}