package com.example.secondactivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.widget.Toast;

public class MainActivity extends Activity {
    private int reqCode = 1;
	private static final String INTENT_NAME = "com.example.ACTIVITY2";
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Log.i(Constants.LOGTAG, " MainActivity onCreate()");
           
    }
    
    public boolean onKeyDown(int keyCode, KeyEvent event)
    {
    	Log.d(Constants.LOGTAG," key pressed!");
    	switch (keyCode)
    	{
    		case KeyEvent.KEYCODE_1:
    			startActivity(new Intent(INTENT_NAME));
    			break;
    		case KeyEvent.KEYCODE_2:
    			startActivity(new Intent(this, Activity2.class));
    			break;
    		case KeyEvent.KEYCODE_3:
	            startActivityForResult(new Intent(INTENT_NAME), reqCode);
            	break;
    		case KeyEvent.KEYCODE_4:
    			Intent i = new Intent(INTENT_NAME);            
	           
	            Bundle extras = new Bundle();
	            extras.putString("Name", "Your name here");
	            i.putExtras(extras);
	            startActivityForResult(i, reqCode);
	            break;
    		default:
    			Log.d(Constants.LOGTAG," key didn't map to a valid key event");
    			break;
    	}
        
        return false;
    }
    
    public void onActivityResult(int requestCode, int resultCode, Intent data)
    {
        if (requestCode == reqCode) {
    	    if (resultCode == RESULT_OK) {                
    	        Toast.makeText(this,data.getData().toString(), 
    	            Toast.LENGTH_SHORT).show();
            }            
        }
    } 
}