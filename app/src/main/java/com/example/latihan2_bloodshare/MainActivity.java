package com.example.latihan2_bloodshare;
/*
Tanggal :
Deskripsi : Pindah Halaman
NIM : 10118001
Nama : Alfian Soasiu
Kelas : IF-1
*/
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void OnClick(View view){
        Intent intent = new Intent(this,RegisterActivity.class);
        startActivity(intent);
    }
}