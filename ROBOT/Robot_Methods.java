package ROBOT;

public class Servant_Robot {

	public static void main(String[] args) {
		
//		System.out.println("Exam Time");
//		System.out.println("Don't Waste Time");
		
		robot myRobot = new robot();
		myRobot.BuyMilk(4);
		
		System.out.println();
		System.out.println("*************************************");
		System.out.println("*************************************");
		System.out.println();
		
		int groceryBill = myRobot.BuyGrocery(2, 2, 2);
		System.out.println("Grocery Total Bill  is : " + groceryBill + " Rs");
		
	}
	
}
