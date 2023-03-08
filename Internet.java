
public class Internet {
	public static void main(String[] args){
		int month=500, gst=18,discount=1000;
	int Totalprice = month-(month*discount/100);
		System.out.println(Totalprice);
	int paidammount= Totalprice+(Totalprice*gst/100);
		System.out.println(paidammount);
		}
}
