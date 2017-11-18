package com.mis.sarasa;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.rilixtech.materialfancybutton.MaterialFancyButton;

/**
 * Created by Hanifmhd on 11/18/2017.
 */

public class DaftarBahasaActivity extends AppCompatActivity{
    private MaterialFancyButton btn_BahasaJawa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //nampilin layout activity_daftar_bahasa
        setContentView(R.layout.activity_daftar_bahasa);

        btn_BahasaJawa = (MaterialFancyButton) findViewById(R.id.btn_BahasaJawa);

        btn_BahasaJawa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DaftarBahasaActivity.this,KamusActivity.class);
                startActivity(intent);
            }
        });

        //kalo diklik bahasa jawa, bakal pindah intent ke KamusActivity

    }
}
