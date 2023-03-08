package Assignment2;

import java.util.Scanner;

public class ECC_36_Adder {
public static String getSum(int num1,int num2)
{
	String res="";
	int sum=0;
	if(num1<=0 || num2<=0) {
		res="Error";
	}
	else if(num1>0 || num2>0) {
		sum+=num1+num2;
		res=sum+" ";
	}
	return res;
}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter two numbers");
	int num1=sc.nextInt();
	int num2=sc.nextInt();
	System.out.println(getSum(num1,num2));
}
}
