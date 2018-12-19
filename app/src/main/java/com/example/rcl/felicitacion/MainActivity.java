package com.example.rcl.felicitacion;

import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
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

        //MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.happy_birthday);
        //mediaPlayer.start();
    }
}
