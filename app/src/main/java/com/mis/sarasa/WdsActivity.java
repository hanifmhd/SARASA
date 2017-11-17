package com.mis.sarasa;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

public class WdsActivity extends AppCompatActivity implements View.OnClickListener{

    ImageView IvSoundBudi1, IvSoundBudi2, IvSoundBudi3, IvSoundBudi4, IvSoundBudi5, IvSoundBudi6, IvSoundAni1, IvSoundAni2, IvSoundAni3, IvSoundAni4, IvSoundAni5, IvSoundAni6;
    private MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wds);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        IvSoundBudi1 = findViewById(R.id.IvSoundBudi1);
        IvSoundBudi2 = findViewById(R.id.IvSoundBudi2);
        IvSoundBudi3 = findViewById(R.id.IvSoundBudi3);
        IvSoundBudi4 = findViewById(R.id.IvSoundBudi4);
        IvSoundBudi5 = findViewById(R.id.IvSoundBudi5);
        IvSoundBudi6 = findViewById(R.id.IvSoundBudi6);

        IvSoundAni1 = findViewById(R.id.IvSoundAni1);
        IvSoundAni2 = findViewById(R.id.IvSoundAni2);
        IvSoundAni3 = findViewById(R.id.IvSoundAni3);
        IvSoundAni4 = findViewById(R.id.IvSoundAni4);
        IvSoundAni5 = findViewById(R.id.IvSoundAni5);
        IvSoundAni6 = findViewById(R.id.IvSoundAni6);


        IvSoundBudi1.setOnClickListener(this);
        IvSoundBudi2.setOnClickListener(this);
        IvSoundBudi3.setOnClickListener(this);
        IvSoundBudi4.setOnClickListener(this);
        IvSoundBudi5.setOnClickListener(this);
        IvSoundBudi6.setOnClickListener(this);

        IvSoundAni1.setOnClickListener(this);
        IvSoundAni2.setOnClickListener(this);
        IvSoundAni3.setOnClickListener(this);
        IvSoundAni4.setOnClickListener(this);
        IvSoundAni5.setOnClickListener(this);
        IvSoundAni6.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
//        final MediaPlayer mpp1 = MediaPlayer.create(PerkenalanActivity.this,R.raw.perkenalan1);
//        final MediaPlayer mpp2 = MediaPlayer.create(PerkenalanActivity.this,R.raw.perkenalan2);

        switch(view.getId()) {
            case R.id.IvSoundBudi1:
                stopPlaying();
                mp = MediaPlayer.create(WdsActivity.this,R.raw.wdsbudi1);
                mp.start();
                break;
            case R.id.IvSoundBudi2:
                stopPlaying();
                mp = MediaPlayer.create(WdsActivity.this,R.raw.wdsbudi2);
                mp.start();
                break;
            case R.id.IvSoundBudi3:
                stopPlaying();
                mp = MediaPlayer.create(WdsActivity.this,R.raw.wdsbudi3);
                mp.start();
                break;
            case R.id.IvSoundBudi4:
                stopPlaying();
                mp = MediaPlayer.create(WdsActivity.this,R.raw.wdsbudi4);
                mp.start();
                break;
            case R.id.IvSoundBudi5:
                stopPlaying();
                mp = MediaPlayer.create(WdsActivity.this,R.raw.wdsbudi5);
                mp.start();
                break;
            case R.id.IvSoundBudi6:
                stopPlaying();
                mp = MediaPlayer.create(WdsActivity.this,R.raw.wdsbudi6);
                mp.start();
                break;
            case R.id.IvSoundAni1:
                stopPlaying();
                mp = MediaPlayer.create(WdsActivity.this,R.raw.wdsani1);
                mp.start();
                break;
            case R.id.IvSoundAni2:
                stopPlaying();
                mp = MediaPlayer.create(WdsActivity.this,R.raw.wdsani2);
                mp.start();
                break;
            case R.id.IvSoundAni3:
                stopPlaying();
                mp = MediaPlayer.create(WdsActivity.this,R.raw.wdsani3);
                mp.start();
                break;
            case R.id.IvSoundAni4:
                stopPlaying();
                mp = MediaPlayer.create(WdsActivity.this,R.raw.wdsani4);
                mp.start();
                break;
            case R.id.IvSoundAni5:
                stopPlaying();
                mp = MediaPlayer.create(WdsActivity.this,R.raw.wdsani5);
                mp.start();
                break;
            case R.id.IvSoundAni6:
                stopPlaying();
                mp = MediaPlayer.create(WdsActivity.this,R.raw.wdsani6);
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