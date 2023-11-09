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
		
		//calcolo il prezzo del biglietto
		double price = 0.21 * kmInt;
		
		if( ageInt < 18) {
			//applico uno sconto del 20% per i minorenni
			double newPrice = price - (price * 0.20);
			//formatto il prezzo
			String formattedPrice = String.format("%.2f", newPrice);
			System.out.println("il prezzo del biglietto è: " + formattedPrice + " euro");
		} else if ( ageInt > 65 ) {
			//applico uno sconto del 40% per gli over 65
			double newPrice = price - (price * 0.40);
			//formatto il prezzo
			String formattedPrice = String.format("%.2f", newPrice);
			System.out.println("il prezzo del biglietto è: " + formattedPrice + " euro");
		} else {
			String formattedPrice = String.format("%.2f", price);
			//stampo a schermo il prezzo originale
			System.out.println("il prezzo del biglietto è: " + formattedPrice + " euro");
		}
	
	}
	
}