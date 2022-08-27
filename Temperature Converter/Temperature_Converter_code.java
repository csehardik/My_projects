package TEMPERATURECONVERTER;
import java.util.Scanner;
public class Temperature_Converter {

	public static void main(String[] args) {
		
//		convert temperature celsius to farenheit
//
//		(0C * 9/5) + 32 = 32F 
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter the temperature in celsius : ");
		float celsius = sc.nextFloat();
		
		celsius = celsius *9;
    
//		System.out.println(celsius);
		
		celsius = celsius/5;
    
//		System.out.println(celsius);
		
		celsius = celsius+32;
		System.out.println("C => " + celsius + " Farenheit" );
		
		System.out.println();
		
//		Convert Temperature Farenheit To Celsius
//		
//		(80F - 32) * 5/9 = 26.667C
		
		System.out.println("Enter the temperature in farenheit : ");
		float farenheit = sc.nextFloat();
		
		farenheit = farenheit - 32;
		
		farenheit = farenheit * 5;
		
		farenheit = farenheit / 9;
		
		System.out.println("F =>" + farenheit + " celsius");
		
	}
	
}
