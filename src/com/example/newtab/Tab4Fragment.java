package com.example.newtab;

import android.os.Bundle;

import android.app.ListFragment;
import android.content.Intent;

import android.view.View;

import android.widget.ArrayAdapter;

import android.widget.ListView;


public class Tab4Fragment extends ListFragment {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//setContentView(R.layout.activity_tab4_fragment);
		// Show the Up button in the action bar.
		//getActionBar().setDisplayHomeAsUpEnabled(true);
		String[] placement=getResources().getStringArray(R.array.placement);
		 ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),
			        android.R.layout.simple_list_item_1, placement);
			    setListAdapter(adapter);
		
	}

/*	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_tab4_fragment, menu);
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
*/
/*	 @Override
		
     public View onCreateView(LayoutInflater inflater, ViewGroup container,

             Bundle savedInstanceState) {

  

         return (LinearLayout) inflater.inflate(R.layout.activity_tab4_fragment, container, false);

     }*/
	
	 public void onListItemClick(ListView l, View v, int position, long id) {
		 switch(position){
		 case 0:
			 Intent first=new Intent(getActivity(),Train.class);
				startActivity(first);
				break;
			case 1:
				Intent second=new Intent(getActivity(), Contact.class);
				startActivity(second);
				break;
		 }
	 }
}
