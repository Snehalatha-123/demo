package Strings;

public class Remove_WhiteSpaces {
	public static void main(String[] args) {
		String str = "Removing white Spaces in the Programm";
		str = str.replaceAll("\\s+","");
		System.out.println("After removing all the spaces: "  +str);
	}
}
