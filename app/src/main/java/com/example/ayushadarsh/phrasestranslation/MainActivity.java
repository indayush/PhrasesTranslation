package com.example.ayushadarsh.phrasestranslation;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public void playPhrases (View view){

        Button buttonPressed = (Button) view;

        Log.i("Button Pressed - ",buttonPressed.getTag().toString());

        MediaPlayer mediaPlayer = MediaPlayer.create(this,getResources().
                getIdentifier(buttonPressed.getTag().toString(),"raw",getPackageName()));
        // Play all media files associated with their tags in one go.
        mediaPlayer.start();

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
