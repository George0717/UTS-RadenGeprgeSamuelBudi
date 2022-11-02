package com.uts.if3b.uts_pab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    EditText etNama,etNomor;
    CheckBox confirm;
    Button btnDaftar;
    Spinner dropDown;
    String namaLengkap, nomorPendaftaran, spinner, konfirmasi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Pendaftaran");
        etNama = findViewById(R.id.et_nama_lengkap);
        etNomor = findViewById(R.id.et_nomor_pendaftaran);
        btnDaftar = findViewById(R.id.btn_daftar);
        dropDown = findViewById(R.id.sp_jalurPendaftaran);
        confirm = findViewById(R.id.cb_konfirmasi);

        btnDaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                namaLengkap = etNama.getText().toString();
                nomorPendaftaran = etNomor.getText().toString();
                spinner = dropDown.getSelectedItem().toString();
                if (namaLengkap.trim().equals(""))
                {
                    etNama.setError("Nama Lengkap Wajib Dimasukkan");
                }
                else if(nomorPendaftaran.trim().equals("")) {
                    etNomor.setError("Nomor Pendafaran Wajib DIISI");
                }
                else if(confirm.isChecked() == false){
                    confirm.setError("Pastikan data");
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Selamat " + namaLengkap + " anda sudah terdaftar di kampus Universitas Multi Data Palembang", Toast.LENGTH_SHORT).show();
                }

                Intent pindah = new Intent(MainActivity.this, Konfirmasi.class);
                pindah.putExtra("nama", namaLengkap);
                pindah.putExtra("nomor", nomorPendaftaran);
                pindah.putExtra("spin", spinner);
                startActivity(pindah);
            }
        });


    }
}