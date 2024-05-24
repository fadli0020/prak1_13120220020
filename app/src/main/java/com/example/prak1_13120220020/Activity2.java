package com.example.prak1_13120220020;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {
    private TextView txtStb, txtNama;
    private EditText txtNilaiTugas, txtNilaiFinal, txtNilaiMid;


    public void inputSelesai (View view) {
        Intent intent = new Intent();
        intent.putExtra(com.example.prak1_13120220020.MainActivity.KEY_NILAI_TUGAS, txtNilaiTugas.getText().toString());
        intent.putExtra(com.example.prak1_13120220020.MainActivity.KEY_NILAI_MID, txtNilaiMid.getText().toString());
        intent.putExtra(com.example.prak1_13120220020.MainActivity.KEY_NILAI_FINAL, txtNilaiFinal.getText().toString());
        setResult(com.example.prak1_13120220020.MainActivity.RESULT_OK, intent);
        finish();
    }

    public void inputBatal (View view) {
        Intent intent = new Intent();
        setResult(com.example.prak1_13120220020.MainActivity.RESULT_CANCEL, intent);
        finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        txtStb = findViewById(R.id.txt_stb);
        txtNama = findViewById(R.id.txt_nama);
        txtNilaiTugas = findViewById(R.id.txt_input_nilai_tugas);
        txtNilaiMid = findViewById(R.id.txt_input_nilai_mid);
        txtNilaiFinal = findViewById(R.id.txt_input_nilai_final);

        Intent intent = getIntent();
        String stb, nama;

        stb = intent.getStringExtra(com.example.prak1_13120220020.MainActivity.KEY_STB);
        nama = intent.getStringExtra(com.example.prak1_13120220020.MainActivity.KEY_NAMA);

        txtStb.setText(stb);
        txtNama.setText(nama);
    }


}