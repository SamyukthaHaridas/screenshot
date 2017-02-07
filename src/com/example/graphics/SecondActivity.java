package com.example.graphics;


import android.app.Activity;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class SecondActivity extends Activity
{
	String data,d;
	int dim,dim1;
	 GraphicsView graphicsview;  
	     
	protected void onCreate(Bundle  savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.scndactivity);
        graphicsview = new GraphicsView(this);  
        setContentView(graphicsview);  
 

		//Intent i=getIntent();
		 //data= i.getStringExtra("value");
	}
	private class GraphicsView extends View{  
        public GraphicsView(Context context){  
            super(context);  
        }  		

				@Override
				protected void onDraw(Canvas canvas) {
					super.onDraw(canvas);
					Intent i=getIntent();
					data= i.getStringExtra("value");
					d=i.getStringExtra("dimension");
					dim=Integer.parseInt(d);
					dim1=dim*2;
					// custom drawing code here
					Paint paint = new Paint();
					paint.setStyle(Paint.Style.FILL);
		 
					// make the entire canvas white
					paint.setColor(Color.CYAN);
					canvas.drawPaint(paint);
			
					if(data.equals("rectangle")){
					paint.setAntiAlias(false);
					paint.setColor(Color.MAGENTA);
					canvas.drawRect(10, 10,dim,dim1, paint);
					}
		 
				
					if(data.equals("circle")){
					paint.setAntiAlias(true);
					paint.setColor(Color.GRAY);
					canvas.drawCircle(60, 20, dim, paint);
					}
		 
					if(data.equals("square")){
					paint.setAntiAlias(false);
					paint.setColor(Color.RED);
					canvas.drawRect(100, 5, dim, dim, paint);
					}
		 
					canvas.rotate(-40);
					if(data.equals("string")){
		 
					paint.setStyle(Paint.Style.FILL);
					canvas.drawText("Graphics Rotation", 45, 185, paint);
					}
		 
					// undo the rotate
					canvas.restore();
				}
			}
	 @Override  
	    public boolean onCreateOptionsMenu(Menu menu) {  
	        // Inflate the menu; this adds items to the action bar if it is present.  
	        getMenuInflater().inflate(R.menu.main, menu);  
	        return true;  
	    }  
	}
		
	
