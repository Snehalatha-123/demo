import java.util.Scanner;

public class MinMax {
 static void getresult(int arr[], int n) {
	int min = 0,max= 0;
	if(n == 1) {
		min=max=arr[0];
	}
	if(arr[0]>arr[1]) {
		max = arr[0];
		min = arr[1];
	}else {
			max = arr[1];
			min = arr[0];
		}
		for(int i= 2;i<n;i++) {
			if(arr[i]>max) {
				max = arr[i];
			}else if(arr[i]<min)
					min = arr[i];
				}
			System.out.println("min value in an array: "+min);
			System.out.println("max value in an array: " +max);
		}
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int arr[] = {99,59,66,15};
			int n=4;
		getresult(arr,n);

}
}
