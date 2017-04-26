package com.DTMSoundMaster.ParallaxExample;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Picture;
import android.graphics.Rect;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import java.util.ArrayList;

public class ParallaxView extends SurfaceView implements Runnable {
	
	ArrayList<Background> backgrounds;
	
	private volatile boolean running;
	private Thread gameThread = null;
	
	// For drawing
	private Paint paint;
	private Canvas canvas;
	private SurfaceHolder ourHolder;
	
	// Holds reference to the Activity
	Context context;
	
	// Control the fps
	long fps = 60;
	
	// Screen Resolution
	int screenWidth;
	int screenHeight;
	
	ParallaxView(Context context, int screenWidth, int screenHeight) {
		
		super(context);
		this.context = context;
		this.screenWidth = screenWidth;
		this.screenHeight = screenHeight;
		
		// Init drawing objects
		ourHolder = getHolder();
		paint = new Paint();
		
		// Init ArrayList
		backgrounds = new ArrayList<>();
		
		// Load background data into Background objects and place them in GameObject arraylist
		backgrounds.add(new Background(
					this.context,
					screenWidth,
					screenHeight,
					"skyline", 0, 80, 50));
					
		backgrounds.add(new Background(
					this.context,
					screenWidth,
					screenHeight,
					"car", 0, 100, 0));
					
		backgrounds.add(new Background(
					this.context,
					screenWidth,
					screenHeight,
					"grass", 70, 110, 200));
					
		// Add more backgrounds here
		
	}
	
	private void drawBackground(int position) {

		// Make a copy of the relevant background
		Background bg = backgrounds.get(position);

		// Define what portion of images to capture and what coordinates of the screen to draw them at

		// For the regular bitmap
		Rect fromRect1 = new Rect(0, 0, bg.width - bg.xClip, bg.height);
		Rect toRect1 = new Rect(bg.xClip, bg.startY, bg.width, bg.endY);

		// For the reversed background
		Rect fromRect2 = new Rect(bg.width - bg.xClip, 0, bg.width, bg.height);
		Rect toRect2 = new Rect(0, bg.startY, bg.xClip, bg.endY);
		
		// Draw the two backgrounds
		if (!bg.reversedFirst) {
			
			canvas.drawBitmap(bg.bitmap, fromRect1, toRect1, paint);
			canvas.drawBitmap(bg.bitmapReversed, fromRect2, toRect2, paint);
			
		} else {
			
			canvas.drawBitmap(bg.bitmap, fromRect2, toRect2, paint);
			canvas.drawBitmap(bg.bitmapReversed, fromRect1, toRect1, paint);
			
		}

	}
	
	@Override
	public void run() {
		
		while (running) {
			
			long startFrameTime = System.currentTimeMillis();
			update();
			draw();
			
			// Calculate the fps of this frame
			long timeThisFrame = System.currentTimeMillis() - startFrameTime;
			
			if (timeThisFrame >= 1) {
				
				fps = 1000/timeThisFrame;
				
			}
			
		}
		
	}
	
	// Update all the background positions
	private void update() {
		
		for (Background bg : backgrounds) {
			
			bg.update(fps);
			
		}
		
	}
	
	private void draw() {
		
		if (ourHolder.getSurface().isValid()) {
			
			// First lock the area of memory that is being drawn
			canvas = ourHolder.lockCanvas();
			
			// Draw a background color
			canvas.drawColor(Color.argb(255, 0, 3, 70));
			
			// Draw the background parallax
			drawBackground(0);
			
			// Draw the rest of the game
			paint.setTextSize(60);
			paint.setColor(Color.argb(255, 255, 255, 255));
			canvas.drawText("I am a plane", 350, screenHeight/100 * 5, paint);
			
			// Draw the foreground parallax
			drawBackground(1);
			
			// Unlock and draw the scene
			ourHolder.unlockCanvasAndPost(canvas);
			
		}
		
	}
	
	// Clean up thread if the game is stopped
	public void pause() {
		
		running = false;
		
		try {
			
			gameThread.join();
			
		} catch (InterruptedException e) {
			
			// Error
			
		}
		
	}
	
	// Make a new thread and start it
	public void resume() {
		
		running = true;
		gameThread = new Thread(this);
		gameThread.start();
		
	}
	
}
