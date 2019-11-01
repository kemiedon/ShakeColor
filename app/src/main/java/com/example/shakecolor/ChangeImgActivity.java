package com.example.shakecolor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ChangeImgActivity extends AppCompatActivity {
    public static ImageView my_pic;
    Button btn_back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_img);
        my_pic = findViewById(R.id.myPic);

        btn_back = findViewById(R.id.btnBack);
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ChangeImgActivity.this, MainActivity.class);
                startActivity(i);
                finish();
            }
        });
        Intent intent = new Intent(this, ShakeImgService.class);
        //Start Service
        startService(intent);
    }
}
