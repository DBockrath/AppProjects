package com.DTMSoundMaster.GalaxyTraders;

import android.app.*;
import android.os.*;

public class MainActivity extends Activity {
    
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        
		super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
    
	}
	
	public void travelHome() {

		setContentView(R.layout.travel_layout);

	}
	
}
