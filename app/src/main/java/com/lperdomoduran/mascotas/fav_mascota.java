package com.lperdomoduran.mascotas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuItem;

import java.util.ArrayList;

public class fav_mascota extends AppCompatActivity {

    ArrayList<Mascota> miMascota = new ArrayList<Mascota>();
    private RecyclerView listaMascotas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fav_mascota);

        Toolbar action_bar = (Toolbar) findViewById(R.id.miActionBar);
        setSupportActionBar(action_bar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        listaMascotas = (RecyclerView) findViewById(R.id.rv_mascotas);

        LinearLayoutManager llm = new LinearLayoutManager((this));
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        //GridLayoutManager llm = new GridLayoutManager(this, 2);
        listaMascotas.setLayoutManager(llm);
        initMascotaList();
        initAdapter();


    }

    public void initAdapter() {
        MascotaAdapter adapter = new MascotaAdapter(miMascota);
        listaMascotas.setAdapter(adapter);
    }

    public void initMascotaList() {
        miMascota.add(new Mascota("Cisco", R.drawable.argentino, "0"));
        miMascota.add(new Mascota("Caitlin", R.drawable.chihuahua, "0"));
        miMascota.add(new Mascota("Joe", R.drawable.mucuchies, "0"));
        miMascota.add(new Mascota("Barry", R.drawable.havanese, "0"));
        miMascota.add(new Mascota("Ronnie", R.drawable.orchid, "0"));
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home: //hago un case por si en un futuro agrego mas opciones
                Log.i("ActionBar", "Atrás!");
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

}
