package com.laily.submissionplanetapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.laily.myapplication.R;

public class ProfileActivity extends AppCompatActivity {

    ImageButton ig,in,git;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        ig = findViewById(R.id.ig);
        in = findViewById(R.id.in);
        git = findViewById(R.id.git);

        git.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/LailyNurH"));
                startActivity(intent);
            }
        });

        in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/laily-nur-hamidah-184b99203/"));
                startActivity(intent);
            }
        });
        ig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/ly_laily30/"));
                startActivity(intent);
            }
        });


    }
}