package Strings;

import java.util.Scanner;

public class Duplication_Removing  {
	public static void main(String[] args) {
		   Scanner sc=new Scanner(System.in);
	         System.out.println("Enter the String:");
	         String str=sc.nextLine();
	          System.out.println("The given string is: " + str);
	          System.out.println("After removing duplicates characters the new string is: " +DuplicateChar(str));
	         }
	         private static String DuplicateChar(String str) {
	          char[] arr = str.toCharArray();
	          String inputString = "";
	          for (char value: arr) {
	           if (inputString.indexOf(value) == -1) {
	            inputString += value;
	           }
	          }
	          return inputString;
	         }
}