package com.example.whatsuptoeat;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class VerwaltenActivity extends Activity {

	@SuppressLint("NewApi")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_verwalten);
		// Show the Up button in the action bar.
		setupActionBar();
		
	
		
		
	}

	@TargetApi(Build.VERSION_CODES.HONEYCOMB)
	private void setupActionBar() {
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
			getActionBar().setDisplayHomeAsUpEnabled(true);
		}
	}

	
	public void ListeAnzeigen(View view) {
	    // Do something in response to button
		Intent intent = new Intent(this, ListeAnzeigenActivity.class);
		startActivity(intent);
	}
	
	
	
	public void neuerEintrag(View view) {
	    // Do something in response to button
		Intent intent = new Intent(this, NeuerEintragActivity.class);
		startActivity(intent);
		}

	

}
