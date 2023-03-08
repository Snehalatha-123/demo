package com.Port;
import java.util.Scanner;

public class ShipmentClient {
	static Shipment array[]=null;
	static Shipment s=new Shipment();
	public  void  ShipmentNewShipment()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the no of ships");
		int num=sc.nextInt();
		array=new Shipment[num];
		for(int i=0;i<array.length;i++)
		{
			System.out.println(" enter the shipment "+(i+1)+ "details");
		System.out.println("Enter the id");
		int sid=sc.nextInt();
		System.out.println("Enter the ShipName");
		String sname=sc.next();
		System.out.println("Enter the Mode of Transport");
		String mot=sc.next();
		System.out.println("Enter the weight");
		float w=sc.nextFloat();
		System.out.println("Enter the Arrived port");
		String ap=sc.next();
		System.out.println("Enter the Departure port");
		String dp=sc.next();
		Shipment s=new Shipment(sid, sname, mot, w, dp, dp);
		array[i]=s;
		}
	}
	public static void display()
	{
		System.out.println("shipment Detail");
		System.out.println("id" +"\t"+"NAME "+"\t"+"MODEOF TRANSPORT"+"\t"+"WEIGHT"+"\t"+"ARRIVEDPORT"+"\t"+"DEPARTURE");
		for(Shipment sh:array)
		{
			System.out.println(sh);
		}
		}
	public static void main(String[] args)
	{
		ShipmentClient smd=new ShipmentClient();
		
	smd.ShipmentNewShipment();
	smd.display();
	}
}
