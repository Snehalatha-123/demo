
public class DuplicateString {
		public static void main(String[] args) {
			String a[] = {"sneha", "swetha", "swetha","raju"};
			for(int i=0;i<a.length;i++) {
				for(int j=i+1;j<a.length;j++) {
				if(a[i]==(a[j])) 
					System.out.println("The duplicate String of an array is: " +a[i]);
				}
				}
}
}