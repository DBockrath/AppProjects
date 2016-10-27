package com.DTMSoundMaster.GalaxyTraders;

public class Spaceship {
	
	Spaceship barracuda = new Spaceship();
	// 500 Credits
	Spaceship independence = new Spaceship();
	// 1,000 Credits
	Spaceship rhino = new Spaceship();
	// 10,000 Credits
	Spaceship titanic = new Spaceship();
	// 100,000 Credits
	Spaceship colausus = new Spaceship();
	// 1,000,000 Credits
	
	public void buyBarracuda() {
		
		while (Main.barracuda = false) {
			
			if (Main.independence = true) {
				
				Main.spaceship = "Barracuda";
				Main.barracuda = true;
				Main.credits = Main.credits + 500;
				
			}// If
			
			if (Main.rhino = true) {
				
				Main.spaceship = "Barracuda";
				Main.barracuda = true;
				Main.credits = Main.credits + 9500;
				
			}// If
			
			if (Main.titanic = true) {
				
				Main.spaceship = "Barracuda";
				Main.barracuda = true;
				Main.credits = Main.credits + 99500;
				
			}// If
			
			if (Main.colausus = true) {
				
				Main.spaceship = "Barracuda";
				Main.barracuda = true;
				Main.credits = Main.credits + 999500;
				
			}
			
		}// While
		
		while (Main.barracuda = true) {
			
		}// While
		
	}// Method
	
	public void buyIndependence() {
		
		while (Main.independence = false) {

			if (Main.barracuda = true) {

				if (Main.credits < 1000) {
					
					}// If
					
				if (Main.credits >= 1000) {
					
					Main.spaceship = "Independence";
					Main.independence = true;
					Main.credits = Main.credits - 1000;
					
					}// If

			}// If

			if (Main.rhino = true) {

				Main.spaceship = "Independence";
				Main.independence = true;
				Main.credits = Main.credits + 9000;

			}// If

			if (Main.titanic = true) {

				Main.spaceship = "Independence";
				Main.independence = true;
				Main.credits = Main.credits + 99000;

			}// If

			if (Main.colausus = true) {

				Main.spaceship = "Independence";
				Main.independence = true;
				Main.credits = Main.credits + 999000;

			}// If

		}// While

		while (Main.independence = true) {

		}// While
		
	}// Method
	
	public void buyRhino() {
		
		while (Main.rhino = false) {

			if (Main.barracuda = true) {
				
				if (Main.credits < 9500) {
					
					}// If
				
				if (Main.credits >= 9500) {
					
				Main.spaceship = "Rhino";
				Main.rhino = true;
				Main.credits = Main.credits - 9500;
				
					}// If

			}// If

			if (Main.independence = true) {

				if (Main.credits < 9000) {
					
				}
				
				if (Main.credits >= 9000) {
					
				Main.spaceship = "Rhino";
				Main.rhino = true;
				Main.credits = Main.credits - 9000;
				
					}// If

			}// If

			if (Main.titanic = true) {

				Main.spaceship = "Rhino";
				Main.rhino = true;
				Main.credits = Main.credits + 90000;

			}// If

			if (Main.colausus = true) {

				Main.spaceship = "Rhino";
				Main.rhino = true;
				Main.credits = Main.credits + 990000;

			}

		}// While

		while (Main.rhino = true) {

		}// While
		
	}// Method
	
	public void buyTitanic() {
		
		while (Main.titanic = false) {

			if (Main.barracuda = true) {
				
				if (Main.credits < 99500) {
					
					}// If
				
				if (Main.credits >= 99500) {

				Main.spaceship = "Titanic";
				Main.titanic = true;
				Main.credits = Main.credits - 99500;
				
					}// If

			}// If

			if (Main.independence = true) {
				
				if (Main.credits < 99000) {
					
					}// If
				
				if (Main.credits >= 99000) {

				Main.spaceship = "Titanic";
				Main.titanic = true;
				Main.credits = Main.credits - 99000;
				
					}// If

			}// If

			if (Main.rhino = true) {
				
				if (Main.credits < 90000) {
					
					}// If
				
				if (Main.credits >= 90000) {

				Main.spaceship = "Titanic";
				Main.titanic = true;
				Main.credits = Main.credits - 90000;
				
					}// If

			}// If

			if (Main.colausus = true) {

				Main.spaceship = "Titanic";
				Main.titanic = true;
				Main.credits = Main.credits + 900000;

			}

		}// While

		while (Main.titanic = true) {

		}// While
		
	}// Method
	
	public void buyColausus() {
		
		while (Main.colausus = false) {

			if (Main.barracuda = true) {

				if (Main.credits < 999500) {

					}// If

				if (Main.credits >= 999500) {

					Main.spaceship = "Colausus";
					Main.colausus = true;
					Main.credits = Main.credits - 999500;

					}// If

			}// If

			if (Main.independence = true) {

				if (Main.credits < 999000) {

					}// If

				if (Main.credits >= 999000) {

					Main.spaceship = "Colausus";
					Main.colausus = true;
					Main.credits = Main.credits - 999000;

					}// If

			}// If

			if (Main.rhino = true) {

				if (Main.credits < 990000) {

					}// If

				if (Main.credits >= 990000) {

					Main.spaceship = "Colausus";
					Main.colausus = true;
					Main.credits = Main.credits - 990000;

					}// If

			}// If

			if (Main.titanic = true) {
				
				if (Main.credits < 900000) {
					
					}// If
					
				if (Main.credits >= 900000) {

				Main.spaceship = "Colausus";
				Main.colausus = true;
				Main.credits = Main.credits - 900000;
				
					}// If

			}

		}// While

		while (Main.colausus = true) {

		}// While
		
	}// Method
	
}// Class
