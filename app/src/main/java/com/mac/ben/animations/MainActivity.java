package com.mac.ben.animations;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView iv1;
    ImageView iv2;
    ImageView iv3;
    ImageView iv4;
    ImageView iv5;
    ImageView iv6;
    ImageView iv7;
    ImageView iv8;
    ImageView iv9;
    ImageView iv10;
    ImageView iv11;
    ImageView iv12;
    ImageView iv13;
    ImageView iv14;
    ImageView iv15;
    ImageView iv16;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        iv1 = findViewById(R.id.mario1_iv);
        iv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation anim = AnimationUtils.loadAnimation(MainActivity.this,R.anim.blink_anim);
                iv1.startAnimation(anim);
            }
        });

        iv2 = findViewById(R.id.mario2_iv);
        iv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation anim = AnimationUtils.loadAnimation(MainActivity.this,R.anim.bounce);
                iv2.startAnimation(anim);
            }
        });

        iv3 = findViewById(R.id.block_iv);
        iv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation anim = AnimationUtils.loadAnimation(MainActivity.this,R.anim.fadein);
                iv3.startAnimation(anim);
            }
        });

        iv4 = findViewById(R.id.boo_iv);
        iv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation anim = AnimationUtils.loadAnimation(MainActivity.this,R.anim.fadeout);
                iv4.startAnimation(anim);
            }
        });

        iv5 = findViewById(R.id.bullet_iv);
        iv5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation anim = AnimationUtils.loadAnimation(MainActivity.this,R.anim.lefttoright);
                iv5.startAnimation(anim);
            }
        });

        iv6 = findViewById(R.id.chainchop_iv);
        iv6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation anim = AnimationUtils.loadAnimation(MainActivity.this,R.anim.mixed_anim);
                iv6.startAnimation(anim);
            }
        });

        iv7 = findViewById(R.id.goomba_iv);
        iv7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation anim = AnimationUtils.loadAnimation(MainActivity.this,R.anim.righttoleft);
                iv7.startAnimation(anim);
            }
        });

        iv8 = findViewById(R.id.greenshell_iv);
        iv8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation anim = AnimationUtils.loadAnimation(MainActivity.this,R.anim.rotate);
                iv8.startAnimation(anim);
            }
        });

        iv9 = findViewById(R.id.redshell_iv);
        iv9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation anim = AnimationUtils.loadAnimation(MainActivity.this,R.anim.sample_anim);
                iv9.startAnimation(anim);
            }
        });

        iv10 = findViewById(R.id.mushroom1_iv);
        iv10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation anim = AnimationUtils.loadAnimation(MainActivity.this,R.anim.zoomin);
                iv10.startAnimation(anim);
            }
        });

        iv11 = findViewById(R.id.mushroom2_iv);
        iv11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation anim = AnimationUtils.loadAnimation(MainActivity.this,R.anim.zoomout);
                iv11.startAnimation(anim);
            }
        });
    }
}
