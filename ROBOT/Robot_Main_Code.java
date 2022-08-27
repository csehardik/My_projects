package ROBOT;

public class robot {

	String name = "Roger";
	int weight = 2;
	
	static void BuyMilk(int litre_of_milk_to_buy) {
		int milk_Price_Per_Litre =50;
		
		System.out.println("Go To The Dairy");
		System.out.println("Grab Money");
		System.out.println("Leave Home");
		System.out.println("Turn Right");
		System.out.println("Walk 50 steps");
		System.out.println("Buy " + litre_of_milk_to_buy + " Litres Milk From The Milk Shop");
		System.out.println("Pay Bill and Return Home");
		System.out.println("Price Per Litre Of Milk = " + milk_Price_Per_Litre + " Rs");
		
		System.out.println("-------------------------------------------");
		System.out.println(" So , Total Bill = " + milk_Price_Per_Litre*litre_of_milk_to_buy + " Rs");
	}
	
	static int BuyGrocery(int breadPacketQuantity , int SugarQuantity , int TeaQuantity) {
		int totalBill;
		
		int breadPrice = 20;
		int sugarPrice = 45;
		int teaPrice = 65;
		System.out.println("Go To Grocery Store");
		System.out.println("Buy " + breadPacketQuantity + " Fresh Bread Packets & Check Expiry Date");
		System.out.println("Buy " + SugarQuantity + " Sealed Packets & Check Expiry Date");
		System.out.println("Buy " + TeaQuantity + " Tata Tea Premium 250gm & Check Expiry Date");
		System.out.println("Pay Bill and Return Home");
		
		int breadBill = breadPrice*breadPacketQuantity;
		int sugarBill = sugarPrice*SugarQuantity;
		int teaBill = teaPrice*TeaQuantity;
		
		System.out.println("Bread Bill is = " + breadBill);
		System.out.println("Sugar Bill is = " + sugarBill);
		System.out.println("Tea Bill is = " + teaBill);
		
		System.out.println("-------------------------------------------");
		totalBill = breadBill+sugarBill+teaBill;
		
		return totalBill;
	}
	
}
