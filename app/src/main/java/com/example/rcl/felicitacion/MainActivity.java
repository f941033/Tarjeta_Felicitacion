package com.example.rcl.felicitacion;

import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import static android.media.MediaPlayer.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Typeface myFont = Typeface.createFromAsset(getAssets(), "Beauty and the Beast Sample.ttf");
        TextView titulo = (TextView) findViewById(R.id.titulo);
        titulo.setTypeface(myFont);

        Animation animacion = AnimationUtils.loadAnimation(this,R.anim.animacion);
        titulo.startAnimation(animacion);

        Animation slideUp = AnimationUtils.loadAnimation(this,R.anim.slideup);
        TextView texto1 = (TextView) findViewById(R.id.textView1);
        TextView texto2 = (TextView) findViewById(R.id.textView2);

        texto1.startAnimation(slideUp);
        texto2.startAnimation(slideUp);

        MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.happy_birthday);
        mediaPlayer.start();


    }
}
