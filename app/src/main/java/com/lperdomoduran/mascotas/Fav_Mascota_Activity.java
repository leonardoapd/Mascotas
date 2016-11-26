package com.lperdomoduran.mascotas;

import android.app.Activity;
import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuItem;

import com.lperdomoduran.mascotas.Adapters.MascotaAdapter;
import com.lperdomoduran.mascotas.Adapters.PageAdapter;
import com.lperdomoduran.mascotas.DB.BaseDatos;
import com.lperdomoduran.mascotas.Fragments.IProfileFragment;
import com.lperdomoduran.mascotas.Fragments.IRecyclerViewFragmentView;
import com.lperdomoduran.mascotas.Fragments.RecyclerViewFragment;
import com.lperdomoduran.mascotas.Model.ConstructorMascota;
import com.lperdomoduran.mascotas.Model.Mascota;

import java.util.ArrayList;

import static android.os.Build.VERSION_CODES.M;

public class Fav_Mascota_Activity extends AppCompatActivity {

    Context context;
    private RecyclerView listaMascotas;
    ArrayList<Mascota> miMascota = new ArrayList<Mascota>();


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
        listaMascotas.setHasFixedSize(true);
        listaMascotas.setLayoutManager(llm);
        initMascotaList();
        initAdapter();

    }

    public void initAdapter() {
        MascotaAdapter adapter = new MascotaAdapter(miMascota, this);
        listaMascotas.setAdapter(adapter);
    }

    public void initMascotaList() {
        miMascota.add(new Mascota("Wally", R.drawable.chihuahua, 8));
        miMascota.add(new Mascota("Caitlin", R.drawable.mucuchies, 4));
        miMascota.add(new Mascota("Cisco", R.drawable.havanese, 2));
        miMascota.add(new Mascota("Wells", R.drawable.orchid, 1));
        miMascota.add(new Mascota("Joe", R.drawable.argentino, 1));
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
