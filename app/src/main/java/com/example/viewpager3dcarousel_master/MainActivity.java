package com.example.viewpager3dcarousel_master;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends Activity{
    private Image3DSwitchView image_switch_view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        image_switch_view=(Image3DSwitchView) findViewById(R.id.image_switch_view);
        image_switch_view.setOnImageSwitchListener(new Image3DSwitchView.OnImageSwitchListener() {

            @Override
            public void onImageSwitch(int currentImage) {
                // TODO Auto-generated method stub

            }
        });
        image_switch_view.setCurrentImage(1);
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        image_switch_view.clear();
    }





}

