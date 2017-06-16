package com.DTMSoundMaster.ProjectRaggedCast;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import android.graphics.Typeface;
import android.view.Window;
import android.view.WindowManager;

public class MainActivity extends Activity {
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        
		super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		
		TextView txt1 = (TextView)findViewById(R.id.title);
		Typeface tf = Typeface.createFromAsset(getAssets(), "fonts/daniel.otf");
		txt1.setTypeface(tf);
		
    }
	
}
