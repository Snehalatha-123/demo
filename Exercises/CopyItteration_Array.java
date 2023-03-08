package Exercises;

import java.util.Arrays;

public class CopyItteration_Array {
public static void main(String[] args) {
	int my_ar[] = {25,45,42,65,75,24};
	int new_ar[] = new int[6];
	System.out.println(Arrays.toString(my_ar));
	for(int i=0;i< my_ar.length;i++) 
		new_ar[i] = my_ar[i];
	System.out.println(Arrays.toString(new_ar));
}
}
 