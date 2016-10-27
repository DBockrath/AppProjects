package com.DTMSoundMaster.GalaxyTraders;

public class Shop {
	
	Shop planet1Shop = new Shop();
	Shop planet2Shop = new Shop();
	
	public void buyWater() {
		
		if (Main.credits < 5) {
			
			}// If
			
		if (Main.credits >= 5) {
			
			Main.credits = Main.credits - 5;
			Main.water = Main.water + 1;
			
			}// If
		
	}// Method
	
	public void sellWater() {
		
		if (Main.water <= 0) {
			
			}// If
		
		if (Main.water >= 0) {
			
			Main.credits = Main.credits + 5;
			Main.water = Main.water - 1;
			
			}// If
		
	}// Method
	
	public void buyFuel() {

		if (Main.credits < 5) {

		}// If

		if (Main.credits >= 5) {

			Main.credits = Main.credits - 5;
			Main.fuel = Main.fuel + 1;

		}// If

	}// Method

	public void sellFuel() {

		if (Main.fuel <= 0) {

		}// If

		if (Main.fuel >= 0) {

			Main.credits = Main.credits + 5;
			Main.fuel = Main.fuel - 1;

		}// If

	}// Method
	
}// Class
