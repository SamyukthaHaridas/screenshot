package com.example.graphics;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;

public class SecondActivity extends Activity{
	ShapeView shapeview;
	String data,data1,data2,data3,data4;
	int x,y,l,b;
	protected void onCreate(Bundle  savedInstanceState)
	{
	super.onCreate(savedInstanceState);
	shapeview=new ShapeView(this);
	setContentView(shapeview);
	Intent i=getIntent();
	data= i.getStringExtra("username");
	data1=i.getStringExtra("userdata1");
	data2=i.getStringExtra("userdata2");
	data3=i.getStringExtra("userdata3");
	data4=i.getStringExtra("userdata4");
	x=Integer.parseInt(data1);
	y=Integer.parseInt(data2);
	l=Integer.parseInt(data3);
	b=Integer.parseInt(data4);
	}
	public class ShapeView extends View
	{

		public ShapeView(Context context) {
			super(context);
			// TODO Auto-generated constructor stub
		}
		
		
		protected void onDraw(Canvas canvas)
		{
		super.onDraw(canvas);
		 
		// custom drawing code here
		Paint paint = new Paint();
		paint.setStyle(Paint.Style.FILL);

		// make the entire canvas white
		paint.setColor(Color.BLACK);
		canvas.drawPaint(paint);

		
		// draw green circle with anti aliasing turned on
		if(data.equals("circle"))
		{
		paint.setAntiAlias(true);
		paint.setColor(Color.BLUE);
		canvas.drawCircle(x, y, l, paint);
		}

		// draw red rectangle with anti aliasing turned off
		if(data.equals("rectangle"))
		{
		paint.setAntiAlias(false);
		paint.setColor(Color.MAGENTA);
		canvas.drawRect(x, y, l, b, paint);
		}
		if(data.equals("square"))
		{
		paint.setAntiAlias(false);
		paint.setColor(Color.MAGENTA);
		canvas.drawRect(x, y, l, b, paint);
		}

	
		
	}	
	}
	
	
}

