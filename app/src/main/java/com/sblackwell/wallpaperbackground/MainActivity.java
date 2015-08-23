package com.sblackwell.wallpaperbackground;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        Window wnd = getWindow();
        wnd.addFlags(WindowManager.LayoutParams.FLAG_DISMISS_KEYGUARD);
        wnd.addFlags(WindowManager.LayoutParams.FLAG_SHOW_WHEN_LOCKED);
        wnd.setType(WindowManager.LayoutParams.TYPE_SYSTEM_ERROR);

        setContentView(R.layout.activity_main);
        Log.d("EXP", "onCreate");
    }
}
