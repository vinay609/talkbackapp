package com.example.talkbackappenglishtofrench;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.media.MediaPlayer;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btngreen, btnred, btnblack, btnyellow, btnpurple;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        btngreen = findViewById(R.id.btngreen);
        btnred = findViewById(R.id.btnred);
        btnblack = findViewById(R.id.btnblack);
        btnyellow = findViewById(R.id.btnyellow);
        btnpurple = findViewById(R.id.btnpurple);

        btngreen.setOnClickListener(this);
        btnred.setOnClickListener(this);
        btnblack.setOnClickListener(this);
        btnyellow.setOnClickListener(this);
        btnpurple.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        int clickedBtnId = v.getId();
        if (clickedBtnId == R.id.btngreen) {
            playsounds(R.raw.green);

        } else if (clickedBtnId == R.id.btnred) {
            playsounds(R.raw.red);

        } else if (clickedBtnId == R.id.btnblack) {
            playsounds(R.raw.black);

            } else if (clickedBtnId == R.id.btnyellow) {
            playsounds(R.raw.yellow);

            } else if (clickedBtnId == R.id.btnpurple) {
            playsounds(R.raw.purple);


        }

    }

    public void playsounds(int id){

        MediaPlayer mediaplayer = MediaPlayer.create(
                this,
        R.raw.green
        );
        mediaplayer.start();
    }
}