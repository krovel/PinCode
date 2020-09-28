package com.capgemini;

import java.util.*;
import java.util.regex.*;

public class PinCode {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Pattern p = Pattern.compile("^(!([a-zA-Z][^W]))*[0-9]{3}\s*{0,1}[0-9]{3}(!([a-zA-Z][^W]))*$");
		while (true) {
			System.out.println("Enter the PIN Code: ");
			String pin = sc.nextLine();
			Matcher m = p.matcher(pin);
			if (m.find()) {
				System.out.println("Valid PIN Code !");
				break;
			} else {
				System.out.println("ERROR ! Not a valid PIN Code. Please re-eneter:-\n");
			}
		}sc.close();
	}
	
}