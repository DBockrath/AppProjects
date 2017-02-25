package com.DTMSoundMaster.GalaxyTraders;

import android.app.*;
import android.os.*;

public class Main extends Activity {
	
	// Background
	public static String currentBackground;
	public static String spaceshipBackground = "@drawable/barracudabackground";

	// Travel
	public static String currentPlanet;
	public static boolean planet1 = true;
	public static boolean planet2 = false;
	public static boolean planet3 = false;
	public static boolean planet4 = false;
	public static boolean planet5 = false;
	public static boolean planet6 = false;
	public static boolean planet7 = false;
	public static boolean planet8 = false;
	public static boolean planet9 = false;
	public static boolean planet10 = false;

	// Reasources
	public static double water;
	public static double fuel;
	public static double iron;
	public static double steel;
	public static double food;
	public static int credits = 100;

	// Guns
	public static double terminator;
	public static double exterminator;

	// Cannons
	public static double doomslayer;

	// Bombs
	public static double emp;

	// Spaceship
	public static String spaceship = "Barracuda";
	public static boolean barracuda = true;
	public static boolean independence = false;
	public static boolean rhino = false;
	public static boolean titanic = false;
	public static boolean colausus = false;
	
	// Spacestation
	public static boolean stationed1 = false;
	public static boolean stationed2 = false;
	public static boolean stationed3 = false;
	public static boolean stationed4 = false;
	public static boolean stationed5 = false;
	public static boolean stationed6 = false;
	public static boolean stationed7 = false;
	public static boolean stationed8 = false;
	public static boolean stationed9 = false;
	public static boolean stationed10 = false;

	// Misc.
	public static double storage;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
		
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		
    }// Method
	
}// Class
