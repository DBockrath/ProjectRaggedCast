package com.DTMSoundMaster.ProjectRaggedCast;

import android.app.*;
import android.os.*;
import android.widget.*;
import android.graphics.*;

public class MainActivity extends Activity {
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        
		super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		
		String fontPath = "drawable-hdpi/good_dog.otf";
		TextView txt1 = (TextView)findViewById(R.id.title);
		Typeface tf = Typeface.createFromAsset(getAssets(), fontPath);
		txt1.setTypeface(tf);
		
    }
	
}
