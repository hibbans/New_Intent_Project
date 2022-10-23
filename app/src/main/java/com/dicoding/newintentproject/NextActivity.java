package com.dicoding.newintentproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class NextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        TextView textNIM = findViewById(R.id.text_NIM);
        TextView textName = findViewById(R.id.text_name);
        TextView textKelas = findViewById(R.id.text_kelas);
        TextView textIPK = findViewById(R.id.text_IPK);

        Bundle bundle = getIntent().getExtras();

        String NIM = bundle.getString("nimUser");
        String NAME = bundle.getString("nameUser");
        String KELAS = bundle.getString("kelasUser");
        String IPK = bundle.getString("ipkUser");

        textNIM.setText(NIM);
        textName.setText(NAME);
        textKelas.setText(KELAS);
        textIPK.setText(IPK);
    }
}