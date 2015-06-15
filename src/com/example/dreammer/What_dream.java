package com.example.dreammer;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class What_dream extends Activity
{
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.what_dream);
		

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
			Intent intent = new Intent(What_dream.this,How_dream.class);
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
