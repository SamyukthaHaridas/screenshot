package com.example.basicgraphics;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity 
{

	DemoView demo;

	@Override
	public void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		demo = new DemoView(this);
		setContentView(demo);
	}

	private class DemoView extends View
	{
		public DemoView(Context mcontext)
		{
			super(mcontext);
		}

		@Override
		protected void onDraw(Canvas canvas)
		{
			super.onDraw(canvas);

			// custom drawing code here
			Paint paint = new Paint();
			paint.setStyle(Paint.Style.FILL);

			// make the entire canvas YELLOW
			paint.setColor(Color.YELLOW);
			canvas.drawPaint(paint);

			// draw RED circle with anti aliasing turned off
			paint.setAntiAlias(false);
			paint.setColor(Color.RED);
			canvas.drawCircle(20, 20, 15, paint);

			// draw BLACK rectangle with anti aliasing turned off
			paint.setAntiAlias(false);
			paint.setColor(Color.BLACK);
			canvas.drawRect(100, 5, 200, 30, paint);
			

		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) 
	{
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}