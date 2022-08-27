package OTPGENERATOR;
import java.util.SplittableRandom;
public class OTP_GENERATOR {

	public static void main(String[] args) {
		System.out.println("Your Otp Is : " + OTP_GENERATOR.generate_otp(5));
	}
	
	public static String generate_otp(int otp_length) {
		
		SplittableRandom splittableRandom=new SplittableRandom();
		
		StringBuilder sb=new StringBuilder();
		
		for(int i=0;i<otp_length;i++) {
			sb.append(splittableRandom.nextInt(0, 10));
		}
		return sb.toString();
	}
}

//we can also use random function but random function has one disadvantage i.e it doesn't provide us 
//the option to enter the origin/starting value i.e required to tell the compiler from  which number the 1st digit of otp starts .

//random function already includes zero as starting limit so we can't enter other number as starting range.

//****whereas splittableRandom function gives us the option to enter the starting limit and the end limit also .****

