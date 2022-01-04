package com.example.projectthree;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class MainScreenActivity extends AppCompatActivity {

public Button btn;

@Override
protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.loginbtn);
        btn.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View v) {
        openActivity();
        }
        });
        }

private void openActivity() {
        Intent intent1 = new Intent(this, HomePageActivity.class);
        startActivity(intent1);
        }

        }