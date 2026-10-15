package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText editName = findViewById(R.id.etName);
        EditText editJob= findViewById(R.id.etTitle);
        EditText editPhone = findViewById(R.id.etJob);
        EditText editWebsite = findViewById(R.id.etWebsite);
        Button btnMain = findViewById(R.id.etDueDate);
        Button btnFill = findViewById(R.id.btnCancel);
        Button btnGo = findViewById(R.id.btnSave); // אודות
        btnGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // ★ מסר מפורש: אנחנו מציינים בדיוק מי היעד
                Intent intent = new Intent(MainActivity.this, AboutActivity.class);
                startActivity(intent);
            }
        });
        btnFill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editName.setText("שלו לוי");
                editJob.setText("מתכנת אנדרויד");
                editPhone.setText("054-7888321");
                editWebsite.setText("indeed.com");
            }
        });

    }
}