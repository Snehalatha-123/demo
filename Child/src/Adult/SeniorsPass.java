package Adult;

public class SeniorsPass {
double discount = 60;
	
	public  void  printSeniorsPass(){
		Fare fare = new Fare();
		double pfare = fare.PrintFare();
		double res = pfare-(pfare*(discount/100));
		System.out.println("After Discount SeasonalPass Fare is:"+res);
	}
}
