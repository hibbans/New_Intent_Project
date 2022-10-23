package com.dicoding.newintentproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText editNIM, editName,editKelas,editIPK;
    Button _addButton, _exitButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editNIM = findViewById(R.id.inputNIM);
        editName = findViewById(R.id.inputNama);
        editKelas = findViewById(R.id.inputKelas);
        editIPK = findViewById(R.id.inputIPK);

        _addButton = findViewById(R.id.addButton);
        _exitButton = findViewById(R.id.exitButton);
    }
    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    public void addClick(View view) {
        String nim = editNIM.getText().toString();
        String name = editName.getText().toString();
        String kelas = editKelas.getText().toString();
        String ipk = editIPK.getText().toString();

        Intent intentText = new Intent(this, NextActivity.class);

        intentText.putExtra("nimUser",nim);
        intentText.putExtra("nameUser",name);
        intentText.putExtra("kelasUser",kelas);
        intentText.putExtra("ipkUser",ipk);

        startActivity(intentText);
    }

    public void exitClick(View view) {
        _exitButton.setOnClickListener( view1 ->
                MainActivity.super.onDestroy()
        );
    }
}