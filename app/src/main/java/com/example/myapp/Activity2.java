package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity {
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        button=(Button)findViewById(R.id.btnprofil);
        button=(Button)findViewById(R.id.btnkegiatan);
        button=(Button)findViewById(R.id.btnkeluar);
    }
    public void onclickprofil(View arg0) {
        Toast.makeText(getApplicationContext(), "Selamat Datang di Profil Saya ",Toast.LENGTH_LONG).show();
        Intent ExplicitIntent=new Intent(Activity2.this, Activity3.class);
        startActivity(ExplicitIntent);
    }
    public void onclickkegiatan(View arg0) {
        Toast.makeText(getApplicationContext(), "Selamat Datang di Kegiatan Saya ",Toast.LENGTH_LONG).show();
        Intent ExplicitIntent=new Intent(Activity2.this, Activity4.class);
        startActivity(ExplicitIntent);
    }
    public void onclickkeluar(View arg0) {
        Toast.makeText(getApplicationContext(), "Anda Berhasil Keluar ",Toast.LENGTH_LONG).show();
        Intent ExplicitIntent=new Intent(Activity2.this, MainActivity.class);
        startActivity(ExplicitIntent);
    }
}
