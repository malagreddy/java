package discount;
import java.util.Scanner;
public class discount {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of item");
		float itemvalue=sc.nextFloat();
		float newItemPrice=discountCalculate(itemvalue);
		System.out.println("the new price of item is"+newItemPrice);
		
	}

	public static float discountCalculate(float itemvalue)
	{
		float itemprice=itemvalue;
		float discount=(itemvalue*35)/100;
		float newItemPrice=itemprice-discount;
		return newItemPrice;
	}
}
