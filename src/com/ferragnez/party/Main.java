package com.ferragnez.party;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String[] invitatedArray = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", 
				"Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zellic"};
		
		Festa festaFerragnez = new Festa("Festa Ferragnez", invitatedArray);
		
		System.out.println("Ciao! Benvenuto alla festa dei Ferragnez, dimmi un pò, come ti chiami?");
		Scanner sc = new Scanner(System.in);
		String userName = sc.nextLine();
		sc.close();
		
		System.out.println(festaFerragnez.allowEntry(userName));

	}

}
