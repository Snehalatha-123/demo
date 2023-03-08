import java.util.Arrays;

public class ReverseArray {
public static void main(String[] args) {
	int ar[] = {83,28,56,32,21};
	System.out.println("Given array is: "+Arrays.toString(ar));

	System.out.print("Array After reverse: [ ");
	for(int i = ar.length-1;i>=0;i--) {
		System.out.print(ar[i]+ " ");
		}
	System.out.print("] ");

}
}

