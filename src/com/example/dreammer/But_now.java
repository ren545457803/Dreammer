package com.example.dreammer;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.Toast;

public class But_now extends Activity
{

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.but_now);
	}
	
	@Override
	public boolean onTouchEvent(MotionEvent event)
	{
		// TODO Auto-generated method stub
		int action = event.getAction();
		switch (action)
		{
		case MotionEvent.ACTION_DOWN:
			
			break;
		case MotionEvent.ACTION_MOVE:
			break;
		case MotionEvent.ACTION_UP:
			finish();
		}
		return super.onTouchEvent(event);
	}
	@Override
	protected void onRestart()
	{
		// TODO Auto-generated method stub
		
		super.onRestart();
	}
	@Override
	public void finish() {
		// TODO Auto-generated method stub
		Toast.makeText(this, "人生没有返回键", 2000).show();
		super.finish();
	}
}
