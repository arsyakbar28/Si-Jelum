package com.example.sijelum2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SearchActivity extends AppCompatActivity {
    EditText etMulai,etTujuan;
    Button btJalur;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        try
        {
            this.getSupportActionBar().hide();
        }
        catch (NullPointerException e){}

        setContentView(R.layout.activity_search);

        etMulai=findViewById(R.id.et_mulai);
        etTujuan=findViewById(R.id.et_tujuan);
        btJalur=findViewById(R.id.bt_jalur);

        btJalur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sMulai=etMulai.getText().toString().trim();
                String sTujuan=etTujuan.getText().toString().trim();

                if (sMulai.equals("") && sTujuan.equals("")){
                    Toast.makeText(getApplicationContext(),"Masukkan Lokasi",Toast.LENGTH_SHORT).show();
                }else {
                    DisplayTrack(sMulai,sTujuan);
                }
            }

            private void DisplayTrack(String sMulai, String sTujuan) {
                try {
                    Uri uri = Uri.parse("https://www.google.co.id/maps/dir/" + sMulai + "/" + sTujuan);
                    Intent intent =new Intent(Intent.ACTION_VIEW,uri);
                    intent.setPackage("com.google.android.apps.maps");
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(intent);
                }catch (ActivityNotFoundException e){
                    Uri uri=Uri.parse("https://play.google.com/store/apps/details?id=com.google.android.apps.maps");
                    Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(intent);
                }
            }
        });
    }
}