package com.ferragnez.party;

public class Festa {
	private String partyName;
	private String[] participants;
	
	Festa(String partyName, String[] participants) {
		this.partyName = partyName;
		this.participants = participants;
	}
	
	public String getPartyName() {
		return partyName;
	}
	
	public String allowEntry(String userName) {
		return checkParticipants(userName) ? userName + " puoi entrare" : userName + " non puoi entrare";
	}
	
	private boolean checkParticipants(String userName) {
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
		while (i < participants.length) {
			if(userName.equals(participants[i])) {
				return true;
			}  
			
			i++;
		}
		return false;
	}
	
	
	
	
	
	
}
