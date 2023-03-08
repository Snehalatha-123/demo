package Alphabet_Patterns;

public class P6 {
	public static void main(String[] args) {
		int n=6;
	    for(int i=0;i<n;i++) 
	      {   
	          char ch='A';

	          for(int j=n-i;j>1;j--) 
	          {
	              System.out.print(" ");
	          }
	          for(int j=0;j<=i;j++)
	          {
	              System.out.print(ch);
	              System.out.print(" ");
	              ch++;
	          }
	          System.out.println();
	      }
	}
}
