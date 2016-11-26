package com.lperdomoduran.mascotas.Adapters;

import android.app.Activity;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.lperdomoduran.mascotas.Model.ConstructorMascota;
import com.lperdomoduran.mascotas.Model.Mascota;
import com.lperdomoduran.mascotas.R;

import java.util.ArrayList;

/**
 * Created by lperdomoduran on 25/11/16.
 */

public class ProfileAdapter extends RecyclerView.Adapter<ProfileAdapter.ProfileViewHolder> {

    ArrayList<Mascota> mascotas;
    Activity activity;


    public ProfileAdapter(ArrayList<Mascota> mascotas, FragmentActivity activity) {
        this.mascotas = mascotas;
        this.activity = activity;
    }


    @Override
    public ProfileAdapter.ProfileViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_gridlayout, parent, false);
        return new ProfileViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ProfileAdapter.ProfileViewHolder holder, int position) {
        final Mascota mascota = mascotas.get(position);
        holder.iv_photo_cv.setImageResource(mascota.getPhoto());
        holder.tvRaitingMascota.setText(String.valueOf(mascota.getLikes()));
    }

    @Override
    public int getItemCount() {
        return mascotas.size();
    }

    public class ProfileViewHolder extends RecyclerView.ViewHolder {

        private ImageView iv_photo_cv;
        private TextView tvRaitingMascota;

        public ProfileViewHolder(View itemView) {
            super(itemView);
            iv_photo_cv = (ImageView) itemView.findViewById(R.id.iv_photo_cv);
            tvRaitingMascota = (TextView) itemView.findViewById(R.id.tvRaitingMascota);
        }
    }
}
