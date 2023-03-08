public class CommonString_Arrays {

	public static void main(String[] args) {
			String ar1[] = {"sneha","john","swetha","raju"};
			String ar2[]= {"sneha","rani","swetha","rani"};
			for(int i=0;i<ar1.length;i++)
			{
				for(int j=0;j<ar2.length;j++)
				{
				if(ar1[i]== ar2[j]) {
				System.out.print(ar1[i]+ " ");
					}
					}
			}
	}
	}
 