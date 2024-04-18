package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {

	public static void main(String[] args) {
		String[] invitatedArray = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", 
				"Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zellic"};
		System.out.println("Ciao! Benvenuto alla festa dei Ferragnez, dimmi un pò, come ti chiami?");
		Scanner sc = new Scanner(System.in);
		String userName = sc.nextLine();
		sc.close();
		
		/*
		 * Ciclo for funzionante
		 */
		/*for(int i = 0; i < invitatedArray.length; i++) {
			if(userName.equals(invitatedArray[i])) {
				System.out.println("Bene, puoi entrare. Divertiti!");
				break;
			}  
			
			if (i == invitatedArray.length-1) {				
				System.out.println("Mi dispiace, non puoi entrare. Il tuo nome non è nella lista.");
			}
		}*/
		
		/*
		 * Ciclo do while funzionante con test in coda
		 */
		int i = 0;
		/*do {
			if(userName.equals(invitatedArray[i])) {
				System.out.println("Bene, puoi entrare. Divertiti!");
				break;
			}  
			
			if (i == invitatedArray.length-1) {				
				System.out.println("Mi dispiace, non puoi entrare. Il tuo nome non è nella lista.");
			}
			i++;
		} while (i < invitatedArray.length);*/
		
		
		/*
		 * Ciclo while funzionante con test in testa
		 */
		while (i < invitatedArray.length) {
			if(userName.equals(invitatedArray[i])) {
				System.out.println("Bene, puoi entrare. Divertiti!");
				break;
			}  
			
			if (i == invitatedArray.length-1) {				
				System.out.println("Mi dispiace, non puoi entrare. Il tuo nome non è nella lista.");
			}
			i++;
		}

	}

}
