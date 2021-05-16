package com.laily.submissionplanetapps;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.laily.myapplication.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ImageButton profile;
    private RecyclerView rvPlanet;
    private ArrayList<Planet> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvPlanet = findViewById(R.id.rv_planet);
        rvPlanet.setHasFixedSize(true);
        profile = findViewById(R.id.profile);
        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ProfileActivity.class);
                startActivity(intent);
            }
        });


        list.addAll(PlanetData.getListData());
        showRecyclerList();
    }

    private void showSelectedPlanet(Planet data) {
        Toast.makeText(this, "You Selected " + data.getName(), Toast.LENGTH_SHORT).show();


        Intent intent = new Intent(MainActivity.this, DetailActivity.class);
        intent.putExtra(DetailActivity.EXTRA_NAME, data.getName());
        intent.putExtra(DetailActivity.EXTRA_DESKRIPSI, data.getDetail());
        intent.putExtra(DetailActivity.EXTRA_JARAK, data.getJarak());
        intent.putExtra(DetailActivity.EXTRA_IMAGES, data.getImages());
        startActivity(intent);

    }

    private void showRecyclerList() {
        rvPlanet.setLayoutManager(new LinearLayoutManager(this));
        PlanetAdapter planetAdapter = new PlanetAdapter(list);
        rvPlanet.setAdapter(planetAdapter);

        planetAdapter.setOnItemClickCallback(new PlanetAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Planet data) {

                showSelectedPlanet(data);
            }
        });
    }
}
