package com.DTMSoundMaster.ProjectRaggedCast;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import android.graphics.Typeface;

public class MainActivity extends Activity {
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        
		super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		
		String fontPath = "drawable/good_dog.otf";
		TextView txt1 = (TextView)findViewById(R.id.title);
		Typeface tf = Typeface.createFromAsset(getAssets(), fontPath);
		txt1.setTypeface(tf);
		
    }
	
}
