package com.mis.sarasa;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.rilixtech.materialfancybutton.MaterialFancyButton;

public class DaftarBahasaActivity extends AppCompatActivity{
    private MaterialFancyButton btn_BahasaJawa,btn_Bahasa1,btn_Bahasa2,btn_Bahasa3,btn_Bahasa4,btn_Bahasa5,btn_Bahasa6,btn_Bahasa7,btn_Bahasa8,btn_Bahasa9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //nampilin layout activity_daftar_bahasa
        setContentView(R.layout.activity_daftar_bahasa);

        btn_BahasaJawa = (MaterialFancyButton) findViewById(R.id.btn_BahasaJawa);
        btn_Bahasa1 = (MaterialFancyButton) findViewById(R.id.btn_Bahasa1);
        btn_Bahasa2 = (MaterialFancyButton) findViewById(R.id.btn_Bahasa2);
        btn_Bahasa3 = (MaterialFancyButton) findViewById(R.id.btn_Bahasa3);
        btn_Bahasa4 = (MaterialFancyButton) findViewById(R.id.btn_Bahasa4);
        btn_Bahasa5 = (MaterialFancyButton) findViewById(R.id.btn_Bahasa5);
        btn_Bahasa6 = (MaterialFancyButton) findViewById(R.id.btn_Bahasa6);
        btn_Bahasa7 = (MaterialFancyButton) findViewById(R.id.btn_Bahasa7);
        btn_Bahasa8 = (MaterialFancyButton) findViewById(R.id.btn_Bahasa8);
        btn_Bahasa9 = (MaterialFancyButton) findViewById(R.id.btn_Bahasa9);

        btn_BahasaJawa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DaftarBahasaActivity.this,KamusActivity.class);
                startActivity(intent);
            }
        });
        btn_Bahasa1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog alertDialog = new AlertDialog.Builder(DaftarBahasaActivity.this).create();
                alertDialog.setTitle("Terkunci!");
                alertDialog.setMessage("Fitur masih dalam tahap pengembangan");
                alertDialog.setButton(AlertDialog.BUTTON_POSITIVE, "Kembali",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        });
                alertDialog.show();
            }
        });
        btn_Bahasa2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog alertDialog = new AlertDialog.Builder(DaftarBahasaActivity.this).create();
                alertDialog.setTitle("Terkunci!");
                alertDialog.setMessage("Fitur masih dalam tahap pengembangan");
                alertDialog.setButton(AlertDialog.BUTTON_POSITIVE, "Kembali",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        });
                alertDialog.show();
            }
        });
        btn_Bahasa3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog alertDialog = new AlertDialog.Builder(DaftarBahasaActivity.this).create();
                alertDialog.setTitle("Terkunci!");
                alertDialog.setMessage("Fitur masih dalam tahap pengembangan");
                alertDialog.setButton(AlertDialog.BUTTON_POSITIVE, "Kembali",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        });
                alertDialog.show();
            }
        });
        btn_Bahasa4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog alertDialog = new AlertDialog.Builder(DaftarBahasaActivity.this).create();
                alertDialog.setTitle("Terkunci!");
                alertDialog.setMessage("Fitur masih dalam tahap pengembangan");
                alertDialog.setButton(AlertDialog.BUTTON_POSITIVE, "Kembali",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        });
                alertDialog.show();
            }
        });
        btn_Bahasa5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog alertDialog = new AlertDialog.Builder(DaftarBahasaActivity.this).create();
                alertDialog.setTitle("Terkunci!");
                alertDialog.setMessage("Fitur masih dalam tahap pengembangan");
                alertDialog.setButton(AlertDialog.BUTTON_POSITIVE, "Kembali",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        });
                alertDialog.show();
            }
        });
        btn_Bahasa6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog alertDialog = new AlertDialog.Builder(DaftarBahasaActivity.this).create();
                alertDialog.setTitle("Terkunci!");
                alertDialog.setMessage("Fitur masih dalam tahap pengembangan");
                alertDialog.setButton(AlertDialog.BUTTON_POSITIVE, "Kembali",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        });
                alertDialog.show();
            }
        });
        btn_Bahasa7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog alertDialog = new AlertDialog.Builder(DaftarBahasaActivity.this).create();
                alertDialog.setTitle("Terkunci!");
                alertDialog.setMessage("Fitur masih dalam tahap pengembangan");
                alertDialog.setButton(AlertDialog.BUTTON_POSITIVE, "Kembali",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        });
                alertDialog.show();
            }
        });
        btn_Bahasa8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog alertDialog = new AlertDialog.Builder(DaftarBahasaActivity.this).create();
                alertDialog.setTitle("Terkunci!");
                alertDialog.setMessage("Fitur masih dalam tahap pengembangan");
                alertDialog.setButton(AlertDialog.BUTTON_POSITIVE, "Kembali",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        });
                alertDialog.show();
            }
        });
        btn_Bahasa9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog alertDialog = new AlertDialog.Builder(DaftarBahasaActivity.this).create();
                alertDialog.setTitle("Terkunci!");
                alertDialog.setMessage("Fitur masih dalam tahap pengembangan");
                alertDialog.setButton(AlertDialog.BUTTON_POSITIVE, "Kembali",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        });
                alertDialog.show();
            }
        });

        //kalo diklik bahasa jawa, bakal pindah intent ke KamusActivity

    }
}
