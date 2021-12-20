package com.example.sijelum2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;

public class RumahsakitActivity extends AppCompatActivity {
    ListView lvProgram;
    String[] programName = {"Rumah Sakit Umum Daerah Sidoajo", "Rumah Sakit Bu Lilik", "Rumah Sakit Islam Siti Hajar", "Rumah Sakit Delta Surya"};
    String[] programDescription = {"No Telp 0318961649", "No Telp 0318911732", "No Telp 0318921233",
            "No Telp 0318962531"};
    int[] programImages = {R.drawable.rs1, R.drawable.rs2,
            R.drawable.rs3, R.drawable.rs4};

    String[] urls = {"https://goo.gl/maps/mBWaMY19HTUTSsYM6",
            "https://goo.gl/maps/qEmjxmPYqzaUFhvz9",
            "https://goo.gl/maps/HAogt8Rs82ZBgWYb9",
            "https://goo.gl/maps/bgzdYemdMtEJfNaG9"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rumahsakit);
        lvProgram = findViewById(R.id.lvProgram);
        ProgramAdapter programAdapter = new ProgramAdapter(this, programName, programImages, programDescription, urls);
        lvProgram.setAdapter(programAdapter);
    }
}