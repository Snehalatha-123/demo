
public class Second_Smallestelement {
	public static void main(String[] args) {
	int ar[]= {6,2,5,7,4};
	int temp;
	for(int i=0;i<ar.length;i++) {
		for(int j=i+1;j<ar.length;j++) {
			if(ar[i]>ar[j]) {
				temp = ar[i];
				ar[i] = ar[j];
				ar[j] = temp;
			}
		}
	}
			System.out.print("Second Smallest element is: "+ar[1]);
	}
}