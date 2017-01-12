package com.example.stuart.tutorial_one;

import android.content.Context;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity { 

	TextView textV; 
	Button btn_change; 
	double counter = 0;
	Vibrator v; 

	@Override 
	protected void onCreate(Bundle savedInstanceState) { 
		super.onCreate(savedInstanceState); 
		setContentView(R.layout.activity_main);
		
		textV = (TextView) findViewById(R.id.textView); 
		btn_change = (Button) findViewById(R.id.btn_change); 
		btn_change.setOnClickListener(new View.OnClickListener() { 
			@Override 
			public void onClick(View view) { 
				if (counter%2==0) 
					textV.setText("Adeus!"); 
				else 
					textV.setText("Ola!"); 
				v = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE); 
				v.vibrate(1000); 
				counter++; 
			} 
		}); 
	}
}
