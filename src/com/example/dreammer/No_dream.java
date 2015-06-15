package com.example.dreammer;

import android.app.Activity;
import android.app.ActivityManager;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.Toast;

public class No_dream extends Activity
{
	private ImageButton pigImageButton;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.no_dream);

		pigImageButton = (ImageButton) findViewById(R.id.nodream_pig);

		pigImageButton.setOnClickListener(new OnClickListener()
		{

			@Override
			public void onClick(View v)
			{
				// TODO Auto-generated method stub

				finish();
			}
		});
	}
	@Override
	public void finish() {
		// TODO Auto-generated method stub
		Toast.makeText(this, "人生没有返回键", 2000).show();
		super.finish();
	}
}
