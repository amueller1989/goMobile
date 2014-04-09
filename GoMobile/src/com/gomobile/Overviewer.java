package com.gomobile;

import java.util.ArrayList;

import com.gomobile.navigation.ViewWithNavigation;

import android.app.Activity;
import android.app.ActionBar;
import android.app.Fragment;
import android.os.Bundle;
import android.text.Editable;
import android.text.method.KeyListener;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;
import android.os.Build;

public class Overviewer extends ViewWithNavigation{
int superocunter = 0;
ListView meineListView;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		
		System.out.println("Hier!");
		ArrayList<String> meineListe = new ArrayList<String>();
		meineListe.add("Arndt");
		meineListe.add("Daniel");
		meineListe.add("Patrick");
		meineListe.add("Arndt2");
		meineListe.add("Daniel2");
		meineListe.add("Patrick2");
		ListAdapter listenAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_activated_1, meineListe);
		meineListView = (ListView) findViewById(R.id.listView1);
		
		meineListView.setAdapter(listenAdapter);
		meineListView.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
		

		//meineListView.setSelector(android.R.color.darker_gray);
		meineListView.setSelector(R.drawable.bg);
		meineListView.setItemChecked(0, true);
		System.out.println("Selected Item ID: " + meineListView.getSelectedItemId());
		
		
		//meineListView.setClickable(false);
		//meineListView.setEnabled(false);
		
		
		/*meineListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
		  @Override
		  public void onItemClick(AdapterView<?> arg0, View arg1, int position, long arg3) {
			  System.out.println("Position Click: "+position);
			  //setItemChecked(position, true);
			  //arg1.getFocusables(position);
			  //arg1.setSelected(true);
		  }
		});
		*/
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}


	@Override
	public void navigateRight() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void navigateLeft() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void navigateUp() {
		 if(superocunter <= 0){
	    	 superocunter=0;
	     }else{
		     meineListView.setItemChecked(superocunter-1,true);
		     superocunter = superocunter - 1;	
	     }
		
	}

	@Override
	public void navigateDown() {
		 if(superocunter >= 5){
	    	 superocunter=5;
	     }else{
	    	 meineListView.setItemChecked(superocunter+1,true);
		     superocunter = superocunter + 1;
	     }
		
	}


}
