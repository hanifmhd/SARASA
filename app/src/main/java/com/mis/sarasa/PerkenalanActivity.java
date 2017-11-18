package com.mis.sarasa;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;


public class PerkenalanActivity extends AppCompatActivity implements View.OnClickListener{

    ImageView IvSoundBudi1, IvSoundBudi2, IvSoundBudi3, IvSoundAni1, IvSoundAni2, IvSoundAni3;
    private MediaPlayer mp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perkenalan);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        IvSoundBudi1 = findViewById(R.id.IvSoundBudi1);
        IvSoundBudi2 = findViewById(R.id.IvSoundBudi2);
        IvSoundBudi3 = findViewById(R.id.IvSoundBudi3);

        IvSoundAni1 = findViewById(R.id.IvSoundAni1);
        IvSoundAni2 = findViewById(R.id.IvSoundAni2);
        IvSoundAni3 = findViewById(R.id.IvSoundAni3);

        IvSoundBudi1.setOnClickListener(this);
        IvSoundBudi2.setOnClickListener(this);
        IvSoundBudi3.setOnClickListener(this);
        IvSoundAni1.setOnClickListener(this);
        IvSoundAni2.setOnClickListener(this);
        IvSoundAni3.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
//        final MediaPlayer mpp1 = MediaPlayer.create(PerkenalanActivity.this,R.raw.perkenalan1);
//        final MediaPlayer mpp2 = MediaPlayer.create(PerkenalanActivity.this,R.raw.perkenalan2);

        switch(view.getId()) {
            case R.id.IvSoundBudi1:
                stopPlaying();
                mp = MediaPlayer.create(PerkenalanActivity.this,R.raw.perkenalanbudi1);
                mp.start();
                break;
            case R.id.IvSoundBudi2:
                stopPlaying();
                mp = MediaPlayer.create(PerkenalanActivity.this,R.raw.perkenalanbudi2);
                mp.start();
                break;
            case R.id.IvSoundBudi3:
                stopPlaying();
                mp = MediaPlayer.create(PerkenalanActivity.this,R.raw.perkenalanbudi3);
                mp.start();
                break;
            case R.id.IvSoundAni1:
                stopPlaying();
                mp = MediaPlayer.create(PerkenalanActivity.this,R.raw.perkenalanani1);
                mp.start();
                break;
            case R.id.IvSoundAni2:
                stopPlaying();
                mp = MediaPlayer.create(PerkenalanActivity.this,R.raw.perkenalanani2);
                mp.start();
                break;
            case R.id.IvSoundAni3:
                stopPlaying();
                mp = MediaPlayer.create(PerkenalanActivity.this,R.raw.perkenalanani3);
                mp.start();
                break;
        }
    }
    private void stopPlaying(){
        if(mp != null){
            mp.stop();
            mp.release();
            mp = null;
        }
    }

}
