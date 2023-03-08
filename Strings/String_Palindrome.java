package Strings;

	public class String_Palindrome {
		  public static void main(String[] args) {
		        String input= "ImI";
		        if(isPalindrome(input))
		        {
		            System.out.println(input+" is a palindrome string");
		        }
		        else
		        {
		            System.out.println(input+" is not a palindrome string");
		        }
		    }

		    public static boolean isPalindrome(String str) {
		        int left = 0, right = str.length() - 1;
		        
		        while(left < right)
		        {
		            if(str.charAt(left) != str.charAt(right))
		            {
		                return false;
		            }
		            left++;
		            right--;
		        }
		        return true;
		    } 

}
