package com.mis.sarasa;

/**
 * Created by Hanifmhd on 11/17/2017.
 */

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.util.Linkify;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.TextView;

public class TentangActivity extends AppCompatActivity {
    LinearLayout tentang;
    private Animation animation;
    TextView tv_link_mis, tv_link_flaticon, tv_link_android;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tentang);
        tv_link_mis = findViewById(R.id.tv_link_mis);
        tv_link_flaticon = findViewById(R.id.tv_link_flaticon);
        tv_link_android = findViewById(R.id.tv_link_android);
        tentang = findViewById(R.id.layout_tentang);

        animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.credits);
        tentang.startAnimation(animation);
        Linkify.addLinks(tv_link_mis, Linkify.WEB_URLS);
        Linkify.addLinks(tv_link_flaticon,Linkify.WEB_URLS);
        Linkify.addLinks(tv_link_android,Linkify.WEB_URLS);
    }
}
