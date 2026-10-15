package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText editName = findViewById(R.id.etName);
        EditText editJob = findViewById(R.id.etTitle);
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
        btnMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = editName.getText().toString().trim();
                if (name.isEmpty()) {
                    Toast.makeText(MainActivity.this, "נא להזין שם", Toast.LENGTH_SHORT).show();
                    return;                         // לא עוברים מסך
                }
                Intent intent = new Intent(MainActivity.this, CardActivity.class);
                intent.putExtra("name", name);
                String job = editJob.getText().toString().trim();
                intent.putExtra("job", job);
                String phone = editPhone.getText().toString().trim();
                intent.putExtra("phone", phone);
                String website = editWebsite.getText().toString().trim();
                intent.putExtra("website", website);
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