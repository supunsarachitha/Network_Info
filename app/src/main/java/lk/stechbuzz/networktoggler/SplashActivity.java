package lk.stechbuzz.networktoggler;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.Toast;

public class SplashActivity extends AppCompatActivity {

    private final int SPLASH_DISPLAY_LENGTH = 1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashscreen_layout);


        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                /* Create an Intent that will start the Menu-Activity. */
                try
                {
                    Intent intent = new Intent("android.intent.action.MAIN");
                    intent.setClassName("com.android.settings", "com.android.settings.RadioInfo");
                    startActivity(intent);
                    finish();
                }
                catch (Exception ex)
                {
                    Toast.makeText(getApplicationContext(), " Device not supported" , Toast.LENGTH_LONG).show();
                }
            }
        }, SPLASH_DISPLAY_LENGTH);
    }
}
