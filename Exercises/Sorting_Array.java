package Exercises;

import java.util.Arrays;

public class Sorting_Array {
	public static void main(String[] args) {
		int a[] = {35,42,66,11,13,54};
		String[] str = {"java","coding","Sql"};
		System.out.println("Before sorting the values:" +Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("After Sorting the values:" +Arrays.toString(a));
		
		System.out.println("Before sorting the String:" +Arrays.toString(str));
		Arrays.sort(str);
		System.out.println("After Sorting the String:" +Arrays.toString(str));
	}
}
