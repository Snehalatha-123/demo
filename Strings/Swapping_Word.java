package Strings;

import java.util.Scanner;

public class Swapping_Word {
	static Scanner sc = new Scanner(System.in);

	static void swap() {
		System.out.println("insert string: ");
		{
			String a = sc.next();
			System.out.println("Insert Second String: ");
			String b = sc.next();
			{
				System.out.println("Before Swapping: " + a + " " + b);
				a = a + b;
				b = a.substring(0, a.length() - b.length());
				a = a.substring(b.length());
				System.out.println("After Swapping: " + a + " " + b);
			}
		}
	}

	public static void main(String[] args) {
		swap();

	}
}
