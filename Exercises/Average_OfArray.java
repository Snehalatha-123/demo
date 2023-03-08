package Exercises;

public class Average_OfArray {
	public static void main(String[] args) {
	int ar[] = {47,84,12};
	int Sum=0;
	for(int i=0;i<ar.length;i++) {
	 Sum += ar[i];
	}
	double  Avg = Sum/3;
	System.out.println("Average Value Of array is: " +Avg);
}
}