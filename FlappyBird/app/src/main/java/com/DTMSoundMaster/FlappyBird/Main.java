package com.DTMSoundMaster.FlappyBird;

import android.app.Activity;
import android.graphics.Point;
import android.os.Bundle;
import android.view.Display;

public class Main extends Activity {

	private Parallax parallaxView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		// Get Display object to access screen details
		Display display = getWindowManager().getDefaultDisplay();

		// Load the resolution into a Point object
		Point resolution = new Point();
		display.getSize(resolution);

		// Set the view for the game
		parallaxView = new Parallax(this, resolution.x, resolution.y);

		// Make parallaxView the view for the Activity
		setContentView(parallaxView);

    }

	// If the Activity is paused, make sure to pause the thread
	@Override
	protected void onPause() {

		super.onPause();
		parallaxView.pause();

	}

	// If the Activity is resumed, make sure to resume the thread
	@Override
	protected void onResume() {

		super.onResume();
		parallaxView.resume();

	}

}
