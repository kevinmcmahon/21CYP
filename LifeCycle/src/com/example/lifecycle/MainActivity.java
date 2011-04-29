package com.example.lifecycle;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends Activity {
	
	public static final String LOGTAG = "LifeCycleExample";
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }

    public void onStart()
    {
        super.onStart();
        Log.d(LOGTAG, "In the onStart() event");
    }    
    public void onRestart()
    {
        super.onRestart();
        Log.d(LOGTAG, "In the onRestart() event");
    }    
    public void onResume()
    {
        super.onResume();
        Log.d(LOGTAG, "In the onResume() event");
    }
    public void onPause()
    {
        super.onPause();
        Log.d(LOGTAG, "In the onPause() event");
    }    
    public void onStop()
    {
        super.onStop();
        Log.d(LOGTAG, "In the onStop() event");
    }    
    public void onDestroy()
    {
        super.onDestroy();
        Log.d(LOGTAG, "In the onDestroy() event");
    }       
}