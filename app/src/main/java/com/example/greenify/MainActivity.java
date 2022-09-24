package com.example.greenify;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {
    Timer timer;
    VideoView vi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);
        vi=findViewById(R.id.videoView);
        vi.setVideoPath("android.resource://"+ getPackageName() + "/" +R.raw.gr);
        vi.start();
      timer = new Timer();
        timer.schedule(new TimerTask() {
          @Override
           public void run() {
               Intent intent = new Intent(MainActivity.this,homePage.class);
               startActivity(intent);
               finish();
            }
        },5000);

    }
}