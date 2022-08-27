package BmiCalculator;

import java.util.Scanner;

public class BMICALCULATOR {

//	(weight (in lbs) * 703) / (height (in inches)^2)
	
//	public static double Calculate(int weight , int height) {
//		return 0;
//		
//	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your height in meters?");
		double height = sc.nextDouble();
		System.out.println(height);
 		

		System.out.println("What is your weight in Kgs?");
		double weight = sc.nextDouble();
		System.out.println(weight);
		
		double BMI = weight/(height*height);
		System.out.println("Your Body Mass Index Is : " + BMI);
		
		
//		lets for example take height = 1.651 
		
//					and
		
//							  weight = 54
		
		
		if(BMI<18.5) {
			System.out.println("You Are Underweight :(");
		}
		
		if(BMI>18.5 && BMI<24.9) {
			System.out.println("You Are Normal :)");
		}
		
		if(BMI>25 && BMI<29.9) {
			System.out.println("You Are OverWeight ");
		}
		
		if(BMI>=30) {
			System.out.println("You Are Obese ");
		}
	}
	
}
