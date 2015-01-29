package com.example.newtab;

//import com.example.list.R;

//import com.example.list.Asso;
//import com.example.list.College;
//import com.example.list.Dept;
//import com.example.list.Place;

import android.os.Bundle;
//import android.app.Activity;
//import android.app.Fragment;
//import android.app.ListActivity;
import android.app.ListFragment;
import android.content.Intent;
//import android.view.LayoutInflater;
//import android.view.Menu;
//import android.view.MenuItem;
import android.view.View;
//import android.view.ViewGroup;
import android.widget.ArrayAdapter;
//import android.widget.LinearLayout;
//import android.support.v4.app.NavUtils;
//import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Tab1Fragment extends ListFragment {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//setContentView(R.layout.activity_tab1_fragment);
		// Show the Up button in the action bar.
		//getActionBar().setDisplayHomeAsUpEnabled(true);
		String[] home=getResources().getStringArray(R.array.home);
		// this.setListAdapter(new ArrayAdapter<String>(this,R.layout.activity_main,R.id.textview,home));
		 ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),
			        android.R.layout.simple_list_item_1, home);
			    setListAdapter(adapter);	
	}

/*	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_tab1_fragment, menu);
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

/*	String[] home=getResources().getStringArray(R.array.home);
	 @Override
	 
	     public View onCreateView(LayoutInflater inflater, ViewGroup container,
	 
	             Bundle savedInstanceState) {
	 
		 this.setListAdapter(new ArrayAdapter<String>(this,R.layout.activity_main,R.id.textview,home));
	
	       //  return (LinearLayout) inflater.inflate(R.layout.activity_tab1_fragment, container, false);
		 return super.onCreateView(inflater, container, savedInstanceState);
		 
	     }
*/
	
	 public void onListItemClick(ListView l, View v, int position, long id) {
		 switch(position){
		 case 0:
			 Intent first=new Intent(getActivity(),Colg.class);
				startActivity(first);
				break;
			case 1:
				Intent second=new Intent(getActivity(), Dpt.class);
				startActivity(second);
				break;
			case 2:
				Intent third=new Intent(getActivity(), Aso.class);
				startActivity(third);
				break;
			case 3:
				Intent fourth=new Intent(getActivity(), Plac.class);
				startActivity(fourth);
				break;
		 }
	 }
}
