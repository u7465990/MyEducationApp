package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Button;

public class Welcome extends AppCompatActivity {

    private Button skip_button;
    private Handler handler = new Handler();
    private Runnable runnable = new Runnable() {
        @Override
        public void run() {
            toLogin();
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        initView();
        initEvent();
    }

    private void initEvent() {
        skip_button.setOnClickListener(v -> {
            toLogin();
            handler.removeCallbacks(runnable);
        });
        handler.postDelayed(runnable, 10000);
    }

    private void initView() {
        skip_button = findViewById(R.id.skip_button);
    }

    public void toLogin() {
        Intent intent = new Intent(this, Login.class);
        startActivity(intent);
        finish();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        handler.removeCallbacks(runnable);
    }
}