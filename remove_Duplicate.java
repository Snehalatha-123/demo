import java.util.Arrays;

public class remove_Duplicate {

	public static void main(String[] args) {
		int ar[] = { 3, 3, 7, 4, 5 };
		System.out.println("Given array is : " + Arrays.toString(ar));
		for (int i = 0; i < ar.length-1; ++i) {
			for (int j = i + 1; j < ar.length-1; ++j) {
				if (ar[i] == ar[j]) {	
					ar[j]=0;
				}
			}
		}
						System.out.println("Array after removing Duplicate element: ");
						System.out.print("[ ");
					for (int ele : ar)
						if (ele != 0) {
							System.out.print(ele + " ");
							}
					System.out.print("] ");
		}

}
