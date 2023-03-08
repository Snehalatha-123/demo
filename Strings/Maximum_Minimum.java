package Strings;

public class Maximum_Minimum {
public static void main(String[] args) {
	int max=0,min=0;
	int ar[] = {2,4,9,10,5};
	int n = ar.length;
	max=min=ar[0];
	for(int i=2;i<n;i++) {
		if(ar[i]>max) {
			max=ar[i];
		}else {
			if(ar[i]<min) {
				min = ar[i];
			}
		}
		}
			System.out.println("The maximum value is: " +max);
			System.out.println("The minimum value is: " +min);
}
}
