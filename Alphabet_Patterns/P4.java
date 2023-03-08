package Alphabet_Patterns;

public class P4 {
	 public static void main(String[] args) {

	     int n = 7;

	     for (int i = 1; i <= n-1; i++) {
	       char ch='A';
	         for (int j = 1; j <=n-i;j++) {

	             System.out.print(ch);
	             ch++;
	         }
	         for (int k =1; k <=i; k++) {

	             System.out.print(" ");
	         }
	         for (int k = 1; k >i; k--) {

	             System.out.print(" ");
	         }
	     System.out.println();

	     }

	     for(int r=1,q=1; r<=6;r++,q++) {
          char ch='A';
	         for(int s=1;s<=r;s++) {
	             System.out.print(ch++);
	             
	         }
	         for(int t=r;t<=n;t++) {
	             System.out.print(" ");
	         }
	         for(int t=r;t<n;t++) {
	             System.out.print(" ");
	         }
	         System.out.println();
	     }
	 }
}
