package com.example.secondactivity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Activity2 extends Activity {
	@Override
	public void onCreate(Bundle bundle) {
		super.onCreate(bundle);
		Log.d(Constants.LOGTAG," activity2 onCreate()");
		setContentView(R.layout.activity2);
		
		String defaultName=""; 
        Bundle extras = getIntent().getExtras();
        if (extras!=null)
        {
            defaultName = extras.getString("Name");        
        }
        
        EditText txt_username = 
            (EditText) findViewById(R.id.txt_username);        
        txt_username.setHint(defaultName);
        
        Button btn = (Button) findViewById(R.id.btn_OK);
        btn.setOnClickListener(new View.OnClickListener() 
        {
            public void onClick(View view) {
                Intent data = new Intent();

                EditText txt_username = 
                    (EditText) findViewById(R.id.txt_username);
                
                data.setData(Uri.parse(
                    txt_username.getText().toString()));                           
                setResult(RESULT_OK, data);
                finish(); 
            }
        });  
	}
}
