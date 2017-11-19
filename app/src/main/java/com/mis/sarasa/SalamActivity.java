package com.mis.sarasa;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class SalamActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView IvSoundBudi1, IvSoundBudi2, IvSoundBudi3, IvSoundAni1, IvSoundAni2, IvSoundAni3;
    ImageView IvBookmark1, IvBookmark2, IvBookmark3, IvBookmark4, IvBookmark5, IvBookmark6;
    ImageView IvSoundBudi1on;

    private MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salam);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        IvSoundBudi1 = findViewById(R.id.IvSoundBudi1);
        IvSoundBudi2 = findViewById(R.id.IvSoundBudi2);
        IvSoundBudi3 = findViewById(R.id.IvSoundBudi3);

        IvSoundAni1 = findViewById(R.id.IvSoundAni1);
        IvSoundAni2 = findViewById(R.id.IvSoundAni2);
        IvSoundAni3 = findViewById(R.id.IvSoundAni3);

        IvBookmark1 = findViewById(R.id.IvBookmark1);
        IvBookmark2 = findViewById(R.id.IvBookmark2);
        IvBookmark3 = findViewById(R.id.IvBookmark3);
        IvBookmark4 = findViewById(R.id.IvBookmark4);
        IvBookmark5 = findViewById(R.id.IvBookmark5);
        IvBookmark6 = findViewById(R.id.IvBookmark6);

        IvSoundBudi1on = findViewById(R.id.IvSoundBudi1on);

        IvSoundBudi1.setOnClickListener(this);
        IvSoundBudi2.setOnClickListener(this);
        IvSoundBudi3.setOnClickListener(this);
        IvSoundAni1.setOnClickListener(this);
        IvSoundAni2.setOnClickListener(this);
        IvSoundAni3.setOnClickListener(this);

        IvBookmark1.setOnClickListener(this);
        IvBookmark2.setOnClickListener(this);
        IvBookmark3.setOnClickListener(this);
        IvBookmark4.setOnClickListener(this);
        IvBookmark5.setOnClickListener(this);
        IvBookmark6.setOnClickListener(this);

        IvSoundBudi1on.setOnClickListener(this);
        IvSoundBudi1on.setVisibility(View.INVISIBLE);
    }

    @Override
    public void onClick(View view) {
//        final MediaPlayer mpp1 = MediaPlayer.create(PerkenalanActivity.this,R.raw.perkenalan1);
//        final MediaPlayer mpp2 = MediaPlayer.create(PerkenalanActivity.this,R.raw.perkenalan2);

        Intent intent = new Intent(getApplicationContext(), BookmarkActivity.class);


        switch (view.getId()) {
            case R.id.IvSoundBudi1:
                stopPlaying();
                mp = MediaPlayer.create(SalamActivity.this, R.raw.salambudi1);
                IvSoundBudi1on.setVisibility(View.VISIBLE);
                mp.start();
                break;
            case R.id.IvSoundBudi2:
                stopPlaying();
                mp = MediaPlayer.create(SalamActivity.this, R.raw.salambudi2);
                mp.start();
                break;
            case R.id.IvSoundBudi3:
                stopPlaying();
                mp = MediaPlayer.create(SalamActivity.this, R.raw.salambudi3);
                mp.start();
                break;
            case R.id.IvSoundAni1:
                stopPlaying();
                mp = MediaPlayer.create(SalamActivity.this, R.raw.salamani1);
                mp.start();
                break;
            case R.id.IvSoundAni2:
                stopPlaying();
                mp = MediaPlayer.create(SalamActivity.this, R.raw.salamani2);
                mp.start();
                break;
            case R.id.IvSoundAni3:
                stopPlaying();
                mp = MediaPlayer.create(SalamActivity.this, R.raw.salamani3);
                mp.start();
                break;
            case R.id.IvBookmark1:
                Toast.makeText(getApplicationContext(), "Berhasil Menambahkan Bookmark", Toast.LENGTH_SHORT).show();
                startActivity(intent);
                finish();
                break;
            case R.id.IvBookmark2:
                Toast.makeText(getApplicationContext(), "Berhasil Menambahkan Bookmark", Toast.LENGTH_SHORT).show();
                startActivity(intent);
                finish();
                break;
            case R.id.IvBookmark3:
                Toast.makeText(getApplicationContext(), "Berhasil Menambahkan Bookmark", Toast.LENGTH_SHORT).show();
                startActivity(intent);
                finish();
                break;
            case R.id.IvBookmark4:
                Toast.makeText(getApplicationContext(), "Berhasil Menambahkan Bookmark", Toast.LENGTH_SHORT).show();
                startActivity(intent);
                finish();
                break;
            case R.id.IvBookmark5:
                Toast.makeText(getApplicationContext(), "Berhasil Menambahkan Bookmark", Toast.LENGTH_SHORT).show();
                startActivity(intent);
                finish();
                break;
            case R.id.IvBookmark6:
                Toast.makeText(getApplicationContext(), "Berhasil Menambahkan Bookmark", Toast.LENGTH_SHORT).show();
                startActivity(intent);
                finish();
                break;
        }
    }

    private void stopPlaying() {
        if (mp != null) {
            mp.stop();
            mp.release();
            mp = null;
            IvSoundBudi1on.setVisibility(View.INVISIBLE);
        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        stopPlaying();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home) {
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }

}
