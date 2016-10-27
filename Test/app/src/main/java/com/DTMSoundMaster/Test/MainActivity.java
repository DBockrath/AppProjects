package com.DTMSoundMaster.Test;

import android.app.*;
import android.os.*;

public class MainActivity extends Activity {
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
		
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		
    }
	
	public void enter() {
		
		System.out.println(TEXT_SERVICES_MANAGER_SERVICE);
		
	}
	
}
