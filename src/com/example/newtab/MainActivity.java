package com.example.newtab;

import android.os.Bundle;
import android.app.ActionBar;
import android.app.ActionBar.Tab;
import android.app.Activity;
import android.support.v4.app.NavUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.app.Fragment;
import android.app.FragmentTransaction;


public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		  ActionBar actionBar = getActionBar();
		  actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
		  String label1 = getResources().getString(R.string.label1);
		 
		          Tab tab = actionBar.newTab();
		 
		          tab.setText(label1);
		        TabListener<Tab1Fragment> tl = new TabListener<Tab1Fragment>(this,
		
		                  label1, Tab1Fragment.class);
		 
		          tab.setTabListener(tl);
		 
		          actionBar.addTab(tab);
	
		   
		 
		          String label2 = getResources().getString(R.string.label2);
		
		          tab = actionBar.newTab();
		 
		          tab.setText(label2);
		  
		          TabListener<Tab2Fragment> tl2 = new TabListener<Tab2Fragment>(this,
		 
		                  label2, Tab2Fragment.class);
		
		          tab.setTabListener(tl2);
		
		          actionBar.addTab(tab);
		          
		          
		          String label3 = getResources().getString(R.string.label3);
		  		
		          tab = actionBar.newTab();
		 
		          tab.setText(label3);
		  
		          TabListener<Tab3Fragment> tl3 = new TabListener<Tab3Fragment>(this,
		 
		                  label3, Tab3Fragment.class);
		
		          tab.setTabListener(tl3);
		
		          actionBar.addTab(tab);
		
		          
		          String label4 = getResources().getString(R.string.label4);
		  		
		          tab = actionBar.newTab();
		 
		          tab.setText(label4);
		  
		          TabListener<Tab4Fragment> tl4 = new TabListener<Tab4Fragment>(this,
		 
		                  label4, Tab4Fragment.class);
		
		          tab.setTabListener(tl4);
		
		          actionBar.addTab(tab);
		
		
		   
		  
		      }
		
		   
		 
		      private class TabListener<T extends Fragment> implements
		
		              ActionBar.TabListener {
		
		          private Fragment mFragment;
		
		          private final Activity mActivity;
	
		          private final String mTag;
	
		          private final Class<T> mClass;
		
		   
		  
		          /**
		
		           * Constructor used each time a new tab is created.
		  47
		           * 
		  48
		           * @param activity
		  49
		           *            The host Activity, used to instantiate the fragment
		  50
		           * @param tag
		  51
		           *            The identifier tag for the fragment
		  52
		           * @param clz
		  53
		           *            The fragment's Class, used to instantiate the fragment
		  54
		           */
		
		          public TabListener(Activity activity, String tag, Class<T> clz) {
		
		              mActivity = activity;
		
		              mTag = tag;
		 
		              mClass = clz;
		
		          }
		 
		   
		
		          public void onTabSelected(Tab tab, FragmentTransaction ft) {
		 
		              // Check if the fragment is already initialized
		
		              if (mFragment == null) {
		
		                  // If not, instantiate and add it to the activity
		
		                  mFragment = Fragment.instantiate(mActivity, mClass.getName());
		
		                  ft.add(android.R.id.content, mFragment, mTag);
		
		              } else {
		
		                  // If it exists, simply attach it in order to show it
		
		                  ft.attach(mFragment);
		
		              }
		
		          }
		
		   
	
		          public void onTabUnselected(Tab tab, FragmentTransaction ft) {
		
		              if (mFragment != null) {
		
		                  // Detach the fragment, because another one is being attached
	
		                  ft.detach(mFragment);
		
		              }
		
		          }
		
		   
		 
		          public void onTabReselected(Tab tab, FragmentTransaction ft) {
		 
		              // User selected the already selected tab. Usually do nothing.
		 
		          }
		 
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
		 


	//}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
