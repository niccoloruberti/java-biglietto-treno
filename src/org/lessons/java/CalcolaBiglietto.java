package org.lessons.java;

import java.util.Scanner;

public class CalcolaBiglietto {
	
	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		
		//chiedo all'utente quanti Km vuole percorrere
		System.out.println("Quanti Km vuoi percorrere?");
		String kmStr = in.nextLine();
		//converto i km da stringa a numero
		int kmInt = Integer.valueOf(kmStr);
		
		//chiedo all'utente quanti Km vuole percorrere
		System.out.println("Quanti anni hai?");
		String ageStr = in.nextLine();
		//converto gli anni da stringa a numero
		int ageInt = Integer.valueOf(ageStr);
		
		System.out.println(kmInt);
		System.out.println(ageInt);
	
	}
	
}