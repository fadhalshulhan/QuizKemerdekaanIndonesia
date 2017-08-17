package com.shulhan.fadhal.proyekfadhalshulhan;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button jawab1, jawab2, jawab3, jawab4;
    TextView score, pertanyaan;

    private Pertanyaan jenisPertanyaan = new Pertanyaan();

    private String jenisJawaban;
    private int jenisScore = 0;
    private int jenisPertanyaanLength = jenisPertanyaan.jenisPertanyaan.length;

    Random ran;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ran = new Random();

        jawab1 = (Button) findViewById(R.id.jawab1);
        jawab2 = (Button) findViewById(R.id.jawab2);
        jawab3 = (Button) findViewById(R.id.jawab3);
        jawab4 = (Button) findViewById(R.id.jawab4);

        score = (TextView) findViewById(R.id.score);
        pertanyaan = (TextView) findViewById(R.id.pertanyaan);

        score.setText("Score : " + jenisScore);
        perbaruiPertanyaan(ran.nextInt(jenisPertanyaanLength));

        jawab1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (jawab1.getText() == jenisJawaban) {
                    jenisScore++;
                    score.setText("Score Anda : " + jenisScore);
                    perbaruiPertanyaan(ran.nextInt(jenisPertanyaanLength));
                } else {
                    berakhirDenganTragis();
                }

            }
        });

        jawab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (jawab2.getText() == jenisJawaban) {
                    jenisScore++;
                    score.setText("Score Anda : " + jenisScore);
                    perbaruiPertanyaan(ran.nextInt(jenisPertanyaanLength));
                } else {
                    berakhirDenganTragis();
                }

            }
        });


        jawab3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (jawab3.getText() == jenisJawaban) {
                    jenisScore++;
                    score.setText("Score Anda : " + jenisScore);
                    perbaruiPertanyaan(ran.nextInt(jenisPertanyaanLength));
                } else {
                    berakhirDenganTragis();
                }

            }
        });


        jawab4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (jawab4.getText() == jenisJawaban) {
                    jenisScore++;
                    score.setText("Score Anda : " + jenisScore);
                    perbaruiPertanyaan(ran.nextInt(jenisPertanyaanLength));
                } else {
                    berakhirDenganTragis();
                }

            }
        });


    }

    private void perbaruiPertanyaan(int nomor) {
        pertanyaan.setText(jenisPertanyaan.dapatPertanyaan(nomor));
        jawab1.setText(jenisPertanyaan.dapatPilihan1(nomor));
        jawab2.setText(jenisPertanyaan.dapatPilihan2(nomor));
        jawab3.setText(jenisPertanyaan.dapatPilihan3(nomor));
        jawab4.setText(jenisPertanyaan.dapatPilihan4(nomor));

        jenisJawaban = jenisPertanyaan.dapatJawabanBenar(nomor);

    }

    private void berakhirDenganTragis() {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);
        alertDialogBuilder
                .setMessage("Jawaban kamu salah!. Jadi, Score kamu sekarang adalah " + jenisScore + " Poin. Dan Jawaban yang benar adalah " + jenisJawaban + ", Bro!")
                .setCancelable(false)
                .setPositiveButton("COBA LAGI",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                startActivity(new Intent(getApplicationContext(), MainActivity.class));
                            }
                        })
                .setNegativeButton("KELUAR",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                finish();
                            }
                        });
        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }
}
