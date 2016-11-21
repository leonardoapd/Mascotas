package com.lperdomoduran.mascotas;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by lperdomoduran on 12/11/16.
 */

public class MascotaAdapter extends RecyclerView.Adapter<MascotaAdapter.MascotaViewHolder> {

    ArrayList<Mascota> mascotas;
    int likes = 0;

    public MascotaAdapter(ArrayList<Mascota> mascotas) {
        this.mascotas = mascotas;
    }

    @Override
    public MascotaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_mascota, parent, false);
        return new MascotaViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final MascotaViewHolder mascotaViewHolder, final int position) {
        final Mascota mascota = mascotas.get(position);
        mascotaViewHolder.iv_photo_cv.setImageResource(mascota.getPhoto());
        mascotaViewHolder.tv_name_cv.setText(mascota.getName());
        mascotaViewHolder.tv_likes_cv.setText(mascota.getLikes());

        mascotaViewHolder.iv_like_cv.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                likes++;
                mascotaViewHolder.tv_likes_cv.setText("" + likes);
            }
        });

    }

    @Override
    public int getItemCount() {
        return mascotas.size();
    }

    public static class MascotaViewHolder extends RecyclerView.ViewHolder {

        private CardView cv_mascota;
        private ImageView iv_photo_cv;
        private ImageButton iv_like_cv;
        private TextView tv_name_cv;
        private TextView tv_likes_cv;

        public MascotaViewHolder(View itemView) {
            super(itemView);
            cv_mascota = (CardView) itemView.findViewById(R.id.cv_mascota);
            iv_photo_cv = (ImageView) itemView.findViewById(R.id.iv_photo_cv);
            tv_name_cv = (TextView) itemView.findViewById(R.id.tv_name_cv);
            tv_likes_cv = (TextView) itemView.findViewById(R.id.tv_likes_cv);
            iv_like_cv = (ImageButton) itemView.findViewById(R.id.iv_like_cv);
        }
    }

}
