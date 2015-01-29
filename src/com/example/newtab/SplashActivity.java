package com.example.newtab;

//import com.example.splash.MainActivity;
//import com.example.splash.NextActivity;

import android.os.Bundle;
import android.os.Handler;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;

public class SplashActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_splash);
		Handler handler=new Handler();
		handler.postDelayed(new Runnable(){
			public void run(){
				finish();
				Intent intent=new Intent(SplashActivity.this,MainActivity.class);
				startActivity(intent);
			}
		},5000);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_splash, menu);
		return true;
	}

}
