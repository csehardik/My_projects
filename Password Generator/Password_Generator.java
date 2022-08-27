package PASSWORDGENERATOR;

import java.util.Random;

public class RANDOMPASSWORDGENERATOR {

	public static void main(String[] args) {
		String upper="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lower = "abcdefghijklmnopqrstuvwxyz";
		String num = "0123456789";
		String specialcharacters = "<> , .?/}]{]+_-)(*&^%$#@!=";
		String combination = upper+lower+specialcharacters+num;
		int passwordlength = 8;
		char[] password = new char[passwordlength];
		Random r = new Random();
		for(int i=0;i<passwordlength;i++) {
			password[i]=combination.charAt(r.nextInt(combination.length()));
		}
		
		System.out.println("Generated Password Is : " + new String (password));
		
	}
	
}

