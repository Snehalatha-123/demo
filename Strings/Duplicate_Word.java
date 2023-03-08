 package Strings;

public class Duplicate_Word {
	public static void main(String[] args) {
		String str = "pricilla is doing her work and that work not yet completed ";
		int count;
		str = str.toLowerCase();
		String[] words = str.split(" ");
		System.out.println("Duplicate words in a String : ");
		for (int i = 0; i < words.length; i++) {
			count = 1;
			for (int j = i + 1; j < words.length; j++) {
				if (words[i].equals(words[j])) {
					count++;
					words[j] = "O";
				}
			}
			if (count > 1 && words[i] != "O")
				System.out.println(words[i]);
		}
	}
}
