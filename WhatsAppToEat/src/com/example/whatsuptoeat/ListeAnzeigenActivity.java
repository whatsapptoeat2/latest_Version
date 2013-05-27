package com.example.whatsuptoeat;

import java.util.List;

import android.annotation.TargetApi;
import android.app.ListActivity;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;

public class ListeAnzeigenActivity extends ListActivity {
	
	private RezeptDataSource datasource;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_liste_anzeigen);
		// Show the Up button in the action bar.
		setupActionBar();
		
		datasource = new RezeptDataSource(this);
	    datasource.open();
		
		List<Rezept> values = datasource.getAllRezepte();
		
		ArrayAdapter<Rezept> adapter = new ArrayAdapter<Rezept>(this,
		        android.R.layout.simple_list_item_1, values);
		    setListAdapter(adapter);
	}

	/**
	 * Set up the {@link android.app.ActionBar}, if the API is available.
	 */
	@TargetApi(Build.VERSION_CODES.HONEYCOMB)
	private void setupActionBar() {
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
			getActionBar().setDisplayHomeAsUpEnabled(true);
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.liste_anzeigen, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case android.R.id.home:
			// This ID represents the Home or Up button. In the case of this
			// activity, the Up button is shown. Use NavUtils to allow users
			// to navigate up one level in the application structure. For
			// more details, see the Navigation pattern on Android Design:
			//
			// http://developer.android.com/design/patterns/navigation.html#up-vs-back
			//
			NavUtils.navigateUpFromSameTask(this);
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	
/*public void addnewrow(String name){
	
	TextView tv_name = new TextView(this);
	tv_name.setText(name);
	
	Button b_edit = new Button(this);
    b_edit.setText("edit");
    b_edit.setHeight(10);

	Button b_delete = new Button(this);
    b_delete.setText("del");
    b_delete.setHeight(10);
    
    

	////

	TableRow tr_name = new TableRow(this);
	tr_name.addView(tv_name);

	TableRow tr_edit = new TableRow(this);
	tr_edit.addView(b_edit);
	
	TableRow tr_delete = new TableRow(this);
	tr_delete.addView(b_delete);

	////

	TableLayout tl_name = (TableLayout)findViewById(R.id.tablelayout1);
	tl_name.addView(tr_name);
	
	TableLayout tl_edit = (TableLayout)findViewById(R.id.tablelayout2);
	tl_edit.addView(tr_edit);
	
	TableLayout tl_delete = (TableLayout)findViewById(R.id.tablelayout3);
	tl_delete.addView(tr_delete);

	}*/
	
	public void onClick(View view) {
	    @SuppressWarnings("unchecked")
	    ArrayAdapter<Rezept> adapter = (ArrayAdapter<Rezept>) getListAdapter();
	    Rezept rezept = null;
	    
	      if (getListAdapter().getCount() > 0) {
	        rezept = (Rezept) getListAdapter().getItem(0);
	        datasource.deleteRezept(rezept);
	        adapter.remove(rezept);
	      }
	      
	    
	    adapter.notifyDataSetChanged();
	  }

}
