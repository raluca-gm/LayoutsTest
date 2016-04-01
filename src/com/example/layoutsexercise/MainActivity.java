package com.example.layoutsexercise;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.*;

public class MainActivity extends Activity {

	private Button nord = null;
	private Button sud = null;
	private Button est = null;
	private Button vest = null;
	private EditText txt = null;
	private ButtonClickListener btnListener = new ButtonClickListener();
	
    private class ButtonClickListener implements View.OnClickListener {

        @Override
        public void onClick(View view) {
        	if (view.getId() == R.id.nord_button) {
        		txt.setText(nord.getText().toString());
        	}
        	if (view.getId() == R.id.sud_button) {
        		txt.setText(sud.getText().toString());
        	}
        	if (view.getId() == R.id.est_button) {
        		txt.setText(est.getText().toString());
        	}
        	if (view.getId() == R.id.vest_button) {
        		txt.setText(vest.getText().toString());
        	}        	
        }
    }		
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		txt = (EditText)findViewById(R.id.edit_text);
		
		nord = (Button)findViewById(R.id.nord_button);
		sud = (Button)findViewById(R.id.sud_button);
		est = (Button)findViewById(R.id.est_button);
		vest = (Button)findViewById(R.id.vest_button);
		
		nord.setOnClickListener(btnListener);
		sud.setOnClickListener(btnListener);
		est.setOnClickListener(btnListener);
		vest.setOnClickListener(btnListener);
		
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
}
