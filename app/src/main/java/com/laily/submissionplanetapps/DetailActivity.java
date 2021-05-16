package com.laily.submissionplanetapps;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.laily.myapplication.R;

public class DetailActivity extends AppCompatActivity {
    public  static final String EXTRA_NAME = "extra_name";
    public  static final String EXTRA_IMAGES = "extra_images";
    public  static final String EXTRA_JARAK = "extra_jarak";
    public  static final String EXTRA_DESKRIPSI= "extra_deskripsi";

    String planetName,jarak,deskripsi;
    int images;

    ImageView imgplanet;
    TextView planetname;
    TextView sjarak;
    TextView sdeskripsi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);



        imgplanet = findViewById(R.id.imgplanet);
        planetname = findViewById(R.id.planetname);
        sjarak = findViewById(R.id.jarak);
        sdeskripsi = findViewById(R.id.overview);

        String name = getIntent().getStringExtra(EXTRA_NAME);
        String jarak = getIntent().getStringExtra(EXTRA_JARAK);
        String deskripsi = getIntent().getStringExtra(EXTRA_DESKRIPSI);
        int Url = getIntent().getIntExtra(EXTRA_IMAGES,0);

        Glide.with(imgplanet.getContext())
                .load(Url)
                .into(imgplanet);
        sjarak.setText(jarak);
        sdeskripsi.setText(deskripsi);
        planetname.setText(name);


        }




}