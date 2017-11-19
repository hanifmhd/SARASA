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

public class AngkaActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView IvSoundBudi1, IvSoundBudi2, IvSoundBudi3, IvSoundBudi4, IvSoundBudi5, IvSoundBudi6, IvSoundAni1, IvSoundAni2, IvSoundAni3, IvSoundAni4, IvSoundAni5;
    ImageView IvBookmark1, IvBookmark2, IvBookmark3, IvBookmark4, IvBookmark5, IvBookmark6, IvBookmark7, IvBookmark8, IvBookmark9, IvBookmark10, IvBookmark11;
    private MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_angka);

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

        IvBookmark1 = findViewById(R.id.IvBookmark1);
        IvBookmark2 = findViewById(R.id.IvBookmark2);
        IvBookmark3 = findViewById(R.id.IvBookmark3);
        IvBookmark4 = findViewById(R.id.IvBookmark4);
        IvBookmark5 = findViewById(R.id.IvBookmark5);
        IvBookmark6 = findViewById(R.id.IvBookmark6);
        IvBookmark7 = findViewById(R.id.IvBookmark7);
        IvBookmark8 = findViewById(R.id.IvBookmark8);
        IvBookmark9 = findViewById(R.id.IvBookmark9);
        IvBookmark10 = findViewById(R.id.IvBookmark10);
        IvBookmark11 = findViewById(R.id.IvBookmark11);


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

        IvBookmark1.setOnClickListener(this);
        IvBookmark2.setOnClickListener(this);
        IvBookmark3.setOnClickListener(this);
        IvBookmark4.setOnClickListener(this);
        IvBookmark5.setOnClickListener(this);
        IvBookmark6.setOnClickListener(this);
        IvBookmark7.setOnClickListener(this);
        IvBookmark8.setOnClickListener(this);
        IvBookmark9.setOnClickListener(this);
        IvBookmark10.setOnClickListener(this);
        IvBookmark11.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
//        final MediaPlayer mpp1 = MediaPlayer.create(PerkenalanActivity.this,R.raw.perkenalan1);
//        final MediaPlayer mpp2 = MediaPlayer.create(PerkenalanActivity.this,R.raw.perkenalan2);

        Intent intent = new Intent(AngkaActivity.this,BookmarkActivity.class);

        switch (view.getId()) {
            case R.id.IvSoundBudi1:
                stopPlaying();
                mp = MediaPlayer.create(AngkaActivity.this, R.raw.angkabudi1);
                mp.start();
                break;
            case R.id.IvSoundBudi2:
                stopPlaying();
                mp = MediaPlayer.create(AngkaActivity.this, R.raw.angkabudi2);
                mp.start();
                break;
            case R.id.IvSoundBudi3:
                stopPlaying();
                mp = MediaPlayer.create(AngkaActivity.this, R.raw.angkabudi3);
                mp.start();
                break;
            case R.id.IvSoundBudi4:
                stopPlaying();
                mp = MediaPlayer.create(AngkaActivity.this, R.raw.angkabudi4);
                mp.start();
                break;
            case R.id.IvSoundBudi5:
                stopPlaying();
                mp = MediaPlayer.create(AngkaActivity.this, R.raw.angkabudi5);
                mp.start();
                break;
            case R.id.IvSoundBudi6:
                stopPlaying();
                mp = MediaPlayer.create(AngkaActivity.this, R.raw.angkabudi6);
                mp.start();
                break;
            case R.id.IvSoundAni1:
                stopPlaying();
                mp = MediaPlayer.create(AngkaActivity.this, R.raw.angkani1);
                mp.start();
                break;
            case R.id.IvSoundAni2:
                stopPlaying();
                mp = MediaPlayer.create(AngkaActivity.this, R.raw.angkani2);
                mp.start();
                break;
            case R.id.IvSoundAni3:
                stopPlaying();
                mp = MediaPlayer.create(AngkaActivity.this, R.raw.angkani3);
                mp.start();
                break;
            case R.id.IvSoundAni4:
                stopPlaying();
                mp = MediaPlayer.create(AngkaActivity.this, R.raw.angkani4);
                mp.start();
                break;
            case R.id.IvSoundAni5:
                stopPlaying();
                mp = MediaPlayer.create(AngkaActivity.this, R.raw.angkani5);
                mp.start();
                break;
            case R.id.IvBookmark1:
                Toast.makeText(AngkaActivity.this, "Berhasil Menambahkan Bookmark", Toast.LENGTH_SHORT).show();
                startActivity(intent);
                finish();
                break;
            case R.id.IvBookmark2:
                Toast.makeText(AngkaActivity.this, "Berhasil Menambahkan Bookmark", Toast.LENGTH_SHORT).show();
                startActivity(intent);
                finish();
                break;
            case R.id.IvBookmark3:
                Toast.makeText(AngkaActivity.this, "Berhasil Menambahkan Bookmark", Toast.LENGTH_SHORT).show();
                startActivity(intent);
                finish();
                break;
            case R.id.IvBookmark4:
                Toast.makeText(AngkaActivity.this, "Berhasil Menambahkan Bookmark", Toast.LENGTH_SHORT).show();
                startActivity(intent);
                finish();
                break;
            case R.id.IvBookmark5:
                Toast.makeText(AngkaActivity.this, "Berhasil Menambahkan Bookmark", Toast.LENGTH_SHORT).show();
                startActivity(intent);
                finish();
                break;
            case R.id.IvBookmark6:
                Toast.makeText(AngkaActivity.this, "Berhasil Menambahkan Bookmark", Toast.LENGTH_SHORT).show();
                startActivity(intent);
                finish();
                break;
            case R.id.IvBookmark7:
                Toast.makeText(AngkaActivity.this, "Berhasil Menambahkan Bookmark", Toast.LENGTH_SHORT).show();
                startActivity(intent);
                finish();
                break;
            case R.id.IvBookmark8:
                Toast.makeText(AngkaActivity.this, "Berhasil Menambahkan Bookmark", Toast.LENGTH_SHORT).show();
                startActivity(intent);
                finish();
                break;
            case R.id.IvBookmark9:
                Toast.makeText(AngkaActivity.this, "Berhasil Menambahkan Bookmark", Toast.LENGTH_SHORT).show();
                startActivity(intent);
                finish();
                break;
            case R.id.IvBookmark10:
                Toast.makeText(AngkaActivity.this, "Berhasil Menambahkan Bookmark", Toast.LENGTH_SHORT).show();
                startActivity(intent);
                finish();
                break;
            case R.id.IvBookmark11:
                Toast.makeText(AngkaActivity.this, "Berhasil Menambahkan Bookmark", Toast.LENGTH_SHORT).show();
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

