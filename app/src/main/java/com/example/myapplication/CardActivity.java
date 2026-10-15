package com.example.myapplication;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class CardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card);
        Intent intent = getIntent();          // המעטפה שהגיעה
        String name  = intent.getStringExtra("name");
        String job = intent.getStringExtra("job");
        String phone = intent.getStringExtra("phone");
        String website = intent.getStringExtra("website");
        TextView tvName = findViewById(R.id.title);
        tvName.setText(name);
        TextView tvJob = findViewById(R.id.tvJob);
        tvJob.setText(job);
        TextView tvOther = findViewById(R.id.tvOther);
        tvOther.setText("טלפון: " + phone + "\n" + website);
        Button btnBack = findViewById(R.id.btnBack);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();   // ★ סוגר את המסך הזה וחוזר לקודם — בדיוק כמו כפתור Back
            }
        });
    }
}