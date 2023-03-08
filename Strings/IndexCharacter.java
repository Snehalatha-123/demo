package Strings;

public class IndexCharacter {
		 void index()
		    {
		        String str="Java Exercise";
		        System.out.println("Original String="+str);
		        int index1=str.charAt(0);
		        int index2=str.charAt(10);
		        
		        System.out.println("The character at position 0 is="+(char)index1);
		        System.out.println("The character at position 10 is="+(char)index2);
		    }
		    public static void main(String[] args)
		    {
		        IndexCharacter i=new IndexCharacter();
		        i.index();
		        
		    }
}
