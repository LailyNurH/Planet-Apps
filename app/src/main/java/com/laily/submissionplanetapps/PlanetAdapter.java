package com.laily.submissionplanetapps;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.laily.myapplication.R;

import java.util.ArrayList;


public class PlanetAdapter extends RecyclerView.Adapter<PlanetAdapter.ListViewHolder> {
    private final ArrayList<Planet> listPlanet;
    private Context context;
    private OnItemClickCallback onItemClickCallback;


    public PlanetAdapter(ArrayList<Planet> list) {
        this.listPlanet= list;

    }


    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_planet, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        Planet planet = listPlanet.get(position);
        Glide.with(holder.itemView.getContext())
                .load(planet.getImages())
                .apply(new RequestOptions())
                .into(holder.imgplanet);
        holder.nama.setText(planet.getName());
        holder.jarak.setText(planet.getJarak());
        holder.deskripsi.setText(planet.getDetail());

        final Context mContext = holder.itemView.getContext();

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickCallback.onItemClicked(listPlanet.get(holder.getAdapterPosition()));

            }
        });
    }

    @Override
    public int getItemCount() {
        return listPlanet.size();
    }

    static class ListViewHolder extends RecyclerView.ViewHolder {


        ImageView imgplanet;
        TextView nama,jarak,deskripsi;
        ListViewHolder(@NonNull View itemView) {
            super(itemView);

            imgplanet = itemView.findViewById(R.id.imgplanet);
            nama = itemView.findViewById(R.id.planetname);
            jarak = itemView.findViewById(R.id.jarak);
            deskripsi = itemView.findViewById(R.id.deskripsi);
        }
    }

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    public interface OnItemClickCallback {
        void onItemClicked(Planet data);
    }
}

