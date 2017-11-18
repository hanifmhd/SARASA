package com.mis.sarasa;

import android.os.Bundle;

/**
 * Created by Hanifmhd on 11/18/2017.
 */

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

public class BookmarkActivity extends AppCompatActivity implements View.OnClickListener{

    ImageView IvSoundBudi1, IvSoundBudi2, IvSoundBudi3, IvSoundBudi4, IvSoundBudi5, IvSoundAni6, IvSoundBudi7, IvSoundBudi8,IvSoundBudi9,IvSoundBudi10;
    private MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bookmark);


        IvSoundBudi1 = findViewById(R.id.IvSoundBudi1);
        IvSoundBudi2 = findViewById(R.id.IvSoundBudi2);
        IvSoundBudi3 = findViewById(R.id.IvSoundBudi3);
        IvSoundBudi4 = findViewById(R.id.IvSoundBudi4);
        IvSoundBudi5 = findViewById(R.id.IvSoundBudi5);
        IvSoundAni6 = findViewById(R.id.IvSoundAni6);
        IvSoundBudi7 = findViewById(R.id.IvSoundBudi7);
        IvSoundBudi8 = findViewById(R.id.IvSoundBudi8);
        IvSoundBudi9 = findViewById(R.id.IvSoundBudi9);
        IvSoundBudi10 = findViewById(R.id.IvSoundBudi10);


        IvSoundBudi1.setOnClickListener(this);
        IvSoundBudi2.setOnClickListener(this);
        IvSoundBudi3.setOnClickListener(this);
        IvSoundBudi4.setOnClickListener(this);
        IvSoundBudi5.setOnClickListener(this);
        IvSoundAni6.setOnClickListener(this);
        IvSoundBudi7.setOnClickListener(this);
        IvSoundBudi8.setOnClickListener(this);
        IvSoundBudi9.setOnClickListener(this);
        IvSoundBudi10.setOnClickListener(this);

    }
    @Override
    public void onClick(View view) {
//        final MediaPlayer mpp1 = MediaPlayer.create(PerkenalanActivity.this,R.raw.perkenalan1);
//        final MediaPlayer mpp2 = MediaPlayer.create(PerkenalanActivity.this,R.raw.perkenalan2);

        switch(view.getId()) {
            case R.id.IvSoundBudi1:
                stopPlaying();
                mp = MediaPlayer.create(BookmarkActivity.this,R.raw.perkenalanbudi1);
                mp.start();
                break;
            case R.id.IvSoundBudi2:
                stopPlaying();
                mp = MediaPlayer.create(BookmarkActivity.this,R.raw.perkenalanbudi2);
                mp.start();
                break;
            case R.id.IvSoundBudi3:
                stopPlaying();
                mp = MediaPlayer.create(BookmarkActivity.this,R.raw.salambudi1);
                mp.start();
                break;
            case R.id.IvSoundBudi4:
                stopPlaying();
                mp = MediaPlayer.create(BookmarkActivity.this,R.raw.salambudi2);
                mp.start();
                break;
            case R.id.IvSoundBudi5:
                stopPlaying();
                mp = MediaPlayer.create(BookmarkActivity.this,R.raw.angkabudi1);
                mp.start();
                break;
            case R.id.IvSoundAni6:
                stopPlaying();
                mp = MediaPlayer.create(BookmarkActivity.this,R.raw.angkani1);
                mp.start();
                break;
            case R.id.IvSoundBudi7:
                stopPlaying();
                mp = MediaPlayer.create(BookmarkActivity.this,R.raw.tempattinggalbudi1);
                mp.start();
                break;
            case R.id.IvSoundBudi8:
                stopPlaying();
                mp = MediaPlayer.create(BookmarkActivity.this,R.raw.tempattinggalbudi2);
                mp.start();
                break;
            case R.id.IvSoundBudi9:
                stopPlaying();
                mp = MediaPlayer.create(BookmarkActivity.this,R.raw.wdsbudi1);
                mp.start();
                break;
            case R.id.IvSoundBudi10:
                stopPlaying();
                mp = MediaPlayer.create(BookmarkActivity.this,R.raw.wdsbudi4);
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
