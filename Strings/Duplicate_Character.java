package Strings;

public class Duplicate_Character {
	public static void main(String[] args) {
		String str = "pricilla";
		char[] ch = str.toCharArray();
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) {
				if (ch[i] == ch[j]) {
					System.out.println("The Duplicate Character in a String is: ");
					System.out.println(ch[j]);
				}
			}
		}
	}
}
