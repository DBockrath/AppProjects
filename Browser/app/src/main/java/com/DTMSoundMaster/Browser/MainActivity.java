package com.DTMSoundMaster.Browser;

import android.app.*;
import android.os.*;
import android.database.*;
import android.provider.*;

public class MainActivity extends Activity {
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
		
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		
    }
	
	public void search() {
		
		
		
	}
	
	public Cursor getHistory(Activity currentActivity) {
		
		String whereClause = Browser.BookmarkColumns.DATE + " DESC";
		
		return currentActivity.managedQuery(android.provider.Browser.BOOKMARKS_URI, Browser.HISTORY_PROJECTION, whereClause, null, orderClause);
		
	}
	
}
