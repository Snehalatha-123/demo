package Alphabet_Patterns;

public class P5 {
	public static void main(String[] args){
	    int space= 5,star=0; 
	    char ch='A';

	    for (int i =6; i >= 1; i--)
	    {
	    for (int j = i; j >= 1; j--)
	    {
	    System.out.print((char)(ch+j-1)+" ");
	    }
	    System.out.println(" ");
	    }
	    
	    for (int i = 1; i <= 6; i++)
	    {
	   
	    for (int j =i; j >= 1; j--)
	    {
	    System.out.print((char)(ch+j-1)+" ");

	    }
	    System.out.println(" ");
	    }
	    }
}
