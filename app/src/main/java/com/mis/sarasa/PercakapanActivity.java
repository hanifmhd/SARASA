package com.mis.sarasa;

/**
 * Created by Hanifmhd on 10/25/2017.
 */

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.LinearLayout;

public class PercakapanActivity extends AppCompatActivity {
    LinearLayout perkenalan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_percakapan);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        perkenalan = (LinearLayout) findViewById(R.id.layout_perkenalan);
        perkenalan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PercakapanActivity.this, PerkenalanActivity.class);
                startActivity(intent);
            }
        });

    }
}
