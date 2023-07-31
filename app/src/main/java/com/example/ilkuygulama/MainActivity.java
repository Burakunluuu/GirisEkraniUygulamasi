package com.example.ilkuygulama;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView kullanici = (TextView) findViewById(R.id.kullanici);
        TextView sifre = (TextView) findViewById(R.id.sifre);

        MaterialButton kullanicibuton = (MaterialButton) findViewById(R.id.kullaniciButon);


        // Yönetici ve yönetici

        kullanicibuton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (kullanici.getText().toString().equals("Yönetici") && sifre.getText().toString().equals("Yönetici")) {

                    // Doğru
                    Toast.makeText(MainActivity.this, "Giriş Doğrulandı!", Toast.LENGTH_SHORT).show();


                } else
                    Toast.makeText(MainActivity.this, "Yanlış girdiniz tekrar deneyiniz!", Toast.LENGTH_SHORT).show();
                // Yanlış
            }
        });

    }}
