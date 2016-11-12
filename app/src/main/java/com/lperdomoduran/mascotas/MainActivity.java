package com.lperdomoduran.mascotas;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Mascota> miMascota = new ArrayList<Mascota>();
    private RecyclerView listaMascotas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar action_bar = (Toolbar) findViewById(R.id.miActionBar);
        setSupportActionBar(action_bar);


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
        miMascota.add(new Mascota("Wells", R.drawable.brasilero, "0"));
        miMascota.add(new Mascota("Iris", R.drawable.paulinista, "0"));
    }

    public void likeThePhoto() {

    }

    //Se utiliza para hacer funcionar el boton flotante
    public void addMyFab() {
        FloatingActionButton miFab = (FloatingActionButton) findViewById(R.id.myFab);
        miFab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.top_five:
                Intent intento = new Intent(MainActivity.this, fav_mascota.class);
                startActivity(intento);
            default:
                return super.onOptionsItemSelected(item);
        }

    }
}
