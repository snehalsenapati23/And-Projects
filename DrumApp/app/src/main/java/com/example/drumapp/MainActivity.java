package com.example.drumapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AppCompatButton sound1=findViewById(R.id.sound1);
        AppCompatButton sound2=findViewById(R.id.sound2);
        //AppCompatButton sound3=findViewById(R.id.sound3);
        AppCompatButton sound4=findViewById(R.id.sound4);
        final MediaPlayer mp=MediaPlayer.create(this,R.raw.drum1);
       final MediaPlayer np=MediaPlayer.create(this,R.raw.drum2);
 //      final MediaPlayer zp=MediaPlayer.create(this,R.raw.snare);
        final MediaPlayer qp=MediaPlayer.create(this,R.raw.clap);

        sound1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
            }
        });
        sound2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                np.start();
            }
        });

        sound4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                qp.start();
            }
        });
//        sound3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                zp.start();
//            }
//        });


    }


}