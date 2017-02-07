package com.example.basicgraphics;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
 
public class MainActivity extends Activity {
 
	DemoView demo;
 
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		demo = new DemoView(this);
		setContentView(demo);
	}
 
	private class DemoView extends View {
		public DemoView(Context mcontext) {
			super(mcontext);
		}
 