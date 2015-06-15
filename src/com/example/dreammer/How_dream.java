package com.example.dreammer;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;

public class How_dream extends Activity
{
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.how_dream);
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
			Intent intent = new Intent(How_dream.this,When_dream.class);
			startActivity(intent);
		}
		return super.onTouchEvent(event);
	}
	@Override
	protected void onRestart()
	{
		// TODO Auto-generated method stub
		finish();
		super.onRestart();
	}
}
