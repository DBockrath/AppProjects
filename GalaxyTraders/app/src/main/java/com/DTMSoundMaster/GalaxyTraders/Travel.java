package com.DTMSoundMaster.GalaxyTraders;
import java.util.Scanner

public class Travel {
	
	 public void Mercury() {
	 
	 Scanner scanner = new Scanner(System.in);
		 
		private boolean confirm;
		private String input;
		 
		System.out.println("Are you sure you want to travel to Mercury?");
		System.out.println("Enter 'yes' or 'no'");
		input = scanner.nextLine();
		
		if (input == "yes") {
		
			confirm = true;
		
		} else {
		
			confirm = false;
		
		}
	 }
	
}
