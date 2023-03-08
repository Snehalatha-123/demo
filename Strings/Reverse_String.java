package Strings;

public class Reverse_String {
	public static void main(String[] main) {
		String str = "Sneha";
		char ch[] = str.toCharArray();
		String rev = " ";
		for (int i = str.length() - 1; i >= 0; i--) {
			rev += ch[i];
		}
		System.out.println(""+rev);

	}
}
