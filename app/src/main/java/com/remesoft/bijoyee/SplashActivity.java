package com.remesoft.bijoyee;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

import com.remesoft.bijoyee.Helper.ActivitySwitcher;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        }
        getWindow().setStatusBarColor(ContextCompat.getColor(this,R.color.white));

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                ActivitySwitcher.switchActivity(SplashActivity.this, MainActivity.class);
                finish();
            }
        }, 3000);
    }
}