package com.mis.sarasa;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;

public class PercakapanActivity extends AppCompatActivity {
    LinearLayout perkenalan,salam,angka,tempattinggal,wds,tanggal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_percakapan);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        perkenalan = (LinearLayout) findViewById(R.id.layout_perkenalan);
        salam = (LinearLayout) findViewById(R.id.layout_salam);
        angka = (LinearLayout) findViewById(R.id.layout_angka);
        tempattinggal = (LinearLayout) findViewById(R.id.layout_tempattinggal);
        wds = (LinearLayout) findViewById(R.id.layout_wds);

        perkenalan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PercakapanActivity.this, PerkenalanActivity.class);
                startActivity(intent);
            }
        });
        salam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PercakapanActivity.this, SalamActivity.class);
                startActivity(intent);
            }
        });
        angka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PercakapanActivity.this, AngkaActivity.class);
                startActivity(intent);
            }
        });
        tempattinggal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PercakapanActivity.this, TempattinggalActivity.class);
                startActivity(intent);
            }
        });
        wds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PercakapanActivity.this, WdsActivity.class);
                startActivity(intent);
            }
        });
    }
}
