package Alphabet_Patterns;

	public class P2 {
		public static void main(String[] args) {
			char ch='A';
				for(int i=1;i<7;i++) {
					for(int j=1;j<=i;j++) {

						System.out.print(ch);
					}
					ch++;
					System.out.println();
				}
			}
}
