package Alphabet_Patterns;

public class P3 {
	public static void main(String[] args) {
		int star = -1;
		for (int i = 0; i <= 10; i++) {
			if (i <= 5)
				star++;
			else
				star--;
			char ch = 'A';

			for (int j = 0; j <= star; j++) {

				System.out.print(ch);
				ch++;
			}
			System.out.println();
		}
	}
}
