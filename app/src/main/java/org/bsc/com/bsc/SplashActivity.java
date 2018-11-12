package org.bsc.com.bsc;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends Activity {
    private Thread background;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        threadStart();
    }

     void threadStart() {

        background = new Thread(new Runnable() {

            @SuppressWarnings("deprecation")
            public void run() {

                try {
                    Thread.sleep(5000);
                    startActivity(new Intent(SplashActivity.this,DashboardActivity.class));
                    finish();
                    background.stop();
                } catch (Throwable t) {

                }
            }
        });
        background.start();
    }
}
