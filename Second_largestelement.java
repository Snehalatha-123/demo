
public class Second_largestelement {
public static void main(String[] args) {
	int ar[]= {6,2,5,7};
	int temp;
	for(int i=0;i<ar.length;i++) {
		for(int j=i+1;j<ar.length;j++) {
			if(ar[i]<ar[j]) {
				temp = ar[i];
				ar[i] = ar[j];
				ar[j] = temp;
			}
		}
	}
			System.out.print("Second Largest element is: "+ar[ar.length-2]);
	}
}

