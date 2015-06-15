package com.example.dreammer;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class MainActivity extends Activity {

	private ImageButton main_nodreamButton;
	private ImageButton main_yesdremButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        main_nodreamButton = (ImageButton) findViewById(R.id.main_no);
        main_yesdremButton=(ImageButton) findViewById(R.id.main_yes);
        
        main_nodreamButton.setOnClickListener(new OnClickListener()
		{
			
			@Override
			public void onClick(View v)
			{
				// TODO Auto-generated method stub
				Intent intent = new Intent(MainActivity.this,No_dream.class);
				startActivity(intent);
			}
		});
        
        main_yesdremButton.setOnClickListener(new OnClickListener()
		{
			
			@Override
			public void onClick(View v)
			{
				// TODO Auto-generated method stub
				Intent intent = new Intent(MainActivity.this,What_dream.class);
				startActivity(intent);
			}
		});
    }

    @Override
    protected void onRestart()
    {
    	// TODO Auto-generated method stub
    	finish();
    	super.onRestart();
    
    }
}
