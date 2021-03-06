package com.mis.sarasa;

import android.content.Intent;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.rilixtech.materialfancybutton.MaterialFancyButton;

public class MainActivity extends AppCompatActivity {
    MaterialFancyButton btn_percakapan, btn_kamus, btn_bookmark, btn_tentang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Typeface armonioso = Typeface.createFromAsset(getAssets(),
                "fonts/Armonioso.otf");
        Typeface roboto = Typeface.createFromAsset(getAssets(),
                "fonts/Roboto_Light.ttf");
        TextView sarasa = (TextView) findViewById(R.id.tv_sarasa);
        TextView berbicara = (TextView) findViewById(R.id.tv_berbicara);

        berbicara.setTypeface(roboto);
        sarasa.setTypeface(armonioso);

        btn_percakapan = (MaterialFancyButton) findViewById(R.id.btn_percakapan);
        btn_percakapan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, DaftarBahasaActivityPercakapan.class);
                startActivity(intent);
            }
        });

        btn_kamus = (MaterialFancyButton) findViewById(R.id.btn_kamus);
        btn_kamus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, DaftarBahasaActivity.class);
                startActivity(intent);
            }
        });

        btn_bookmark = (MaterialFancyButton) findViewById(R.id.btn_bookmark);
        btn_bookmark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, BookmarkActivity.class);
                startActivity(intent);
            }
        });

        btn_tentang = (MaterialFancyButton) findViewById(R.id.btn_tentang);
        btn_tentang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, TentangActivity.class);
                startActivity(intent);
            }
        });



    }

    @Override
    public void onBackPressed() {
        finish();
        System.exit(0);
        android.os.Process.killProcess(android.os.Process.myPid());
    }

}
