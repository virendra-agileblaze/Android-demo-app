package com.example.agileblaze.demoapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
     private TextView tv1;
     private  ImageView img1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
        tv1=(TextView)findViewById(R.id.tv1);
        img1=(ImageView)findViewById(R.id.img1);

        Animation myanim= AnimationUtils.loadAnimation(this,R.anim.mytransition);
        tv1.startAnimation(myanim);
        img1.startAnimation(myanim);
      final Intent intent=new Intent(this,login.class);
        Thread t=new Thread()
        {
            public  void  run()
            {
                try{
                    sleep(5000);

                }catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
                finally {
                    startActivity(intent);
                    finish();

                }
            }
        };
        t.start();
    }
}
