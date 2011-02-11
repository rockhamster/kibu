package com.rockhamster.KibuDroid;

import android.app.Activity;
import android.opengl.GLSurfaceView;
import android.os.Bundle;

public class KibuDroid extends Activity 
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
    
        // Create an GL Surface View
        SurfaceView = new GLSurfaceView(this);
        SurfaceView.setRenderer(new KibuRenderer(false));

        setContentView(SurfaceView);
    }

    @Override
    protected void onResume()
    {
    	super.onResume();
    	SurfaceView.onResume();
    }
    
    @Override
    protected void onPause()
    {
    	super.onPause();
    	SurfaceView.onPause();
    }
    
    private GLSurfaceView SurfaceView;
}
