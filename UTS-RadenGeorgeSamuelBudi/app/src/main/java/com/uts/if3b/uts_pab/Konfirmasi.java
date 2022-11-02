package com.uts.if3b.uts_pab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Konfirmasi extends AppCompatActivity {
    TextView tvNama, tvNomor, tvSpinner;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_konfirmasi);
        getSupportActionBar().setTitle("Konfirmasi Data");

        tvNama = findViewById(R.id.tv_nama);
        tvNomor = findViewById(R.id.tv_nomor_pendaftaran);
        tvSpinner = findViewById(R.id.tv_spin);

        Intent terima = getIntent();
        String yNama = terima.getStringExtra("nama");
        String yNomor = terima.getStringExtra("nomor");
        String ySpin = terima.getStringExtra("spin");

        tvNama.setText(yNama);
        tvNomor.setText(yNomor);
        tvSpinner.setText(ySpin);


    }
}