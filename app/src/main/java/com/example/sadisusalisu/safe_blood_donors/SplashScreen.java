package com.example.sadisusalisu.safe_blood_donors;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashScreen extends AppCompatActivity {

    private static int SPLASH_TIME_OUT = 4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

} boolean postDelayed = new Handler().postDelayed(new Runnable() {
    @Override
    public void run() {
        Intent homeIntend = new Intent(SplashScreen.this,Welcome.class);
        startActivity(homeIntend);
        finish();


    }

},SPLASH_TIME_OUT);
}
