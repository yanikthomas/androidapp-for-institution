package com.example.newtab;

import android.os.Bundle;
//import android.app.Activity;
//import android.app.Fragment;
import android.app.ListFragment;
import android.content.Intent;
//import android.view.LayoutInflater;
//import android.view.Menu;
//import android.view.MenuItem;
import android.view.View;
//import android.view.ViewGroup;
import android.widget.ArrayAdapter;
//import android.widget.LinearLayout;
import android.widget.ListView;
//import android.support.v4.app.NavUtils;

public class Tab3Fragment extends ListFragment {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//setContentView(R.layout.activity_tab3_fragment);
		// Show the Up button in the action bar.
		//getActionBar().setDisplayHomeAsUpEnabled(true);
		String[] association=getResources().getStringArray(R.array.association);
		 ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),
			        android.R.layout.simple_list_item_1, association);
			    setListAdapter(adapter);
	}

/*	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_tab3_fragment, menu);
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
	}*/
	/* @Override
		
     public View onCreateView(LayoutInflater inflater, ViewGroup container,

             Bundle savedInstanceState) {

  

         return (LinearLayout) inflater.inflate(R.layout.activity_tab3_fragment, container, false);

     }*/
	
	public void onListItemClick(ListView l, View v, int position, long id) {
		 switch(position){
		 case 0:
			 Intent first=new Intent(getActivity(),Emage.class);
				startActivity(first);
				break;
			case 1:
				Intent second=new Intent(getActivity(), Aces.class);
				startActivity(second);
				break;
			case 2:
				Intent third=new Intent(getActivity(), Ebsa.class);
				startActivity(third);
				break;
			case 3:
				Intent fourth=new Intent(getActivity(), Beats.class);
				startActivity(fourth);
				break;
		 }
	 }

}
