package com.example.shakecolor;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;

import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    public static LinearLayout square;
    Button btn_change;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        square = findViewById(R.id.square);
        btn_change = findViewById(R.id.btnChange);
        Toast.makeText(this,"app正在執行中",Toast.LENGTH_SHORT).show();
        Toast.makeText(this,"第二個branch",Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, ShakeService.class);

        //Start Service
        startService(intent);
        btn_change.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, ChangeImgActivity.class);
                startActivity(i);
                finish();
            }
        });

    }

}
