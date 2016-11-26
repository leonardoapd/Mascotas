package com.lperdomoduran.mascotas;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.lperdomoduran.mascotas.Adapters.PageAdapter;
import com.lperdomoduran.mascotas.Fragments.ProfileFragment;
import com.lperdomoduran.mascotas.Fragments.RecyclerViewFragment;
import com.lperdomoduran.mascotas.MailSender.FormActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {



    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar action_bar = (Toolbar) findViewById(R.id.miActionBar);
        setSupportActionBar(action_bar);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        viewPager = (ViewPager) findViewById(R.id.viewPager);


        setupViewPager();
        /*

        */

        if(toolbar != null){
            setSupportActionBar(toolbar);
        }

    }

    private ArrayList<Fragment> addFragments(){
        ArrayList<Fragment> fragments = new ArrayList<>();

        fragments.add(new RecyclerViewFragment());
        fragments.add(new ProfileFragment());

        return fragments;
    }

    public void setupViewPager(){
        viewPager.setAdapter(new PageAdapter(getSupportFragmentManager(), addFragments()));
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.getTabAt(0).setIcon(R.drawable.home_48);
        tabLayout.getTabAt(1).setIcon(R.drawable.dog_48);
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
                Intent intento = new Intent(MainActivity.this, Fav_Mascota_Activity.class);
                startActivity(intento);
                break;
            case R.id.action_contact:
                Intent contactIntent = new Intent(this, FormActivity.class);
                startActivity(contactIntent);
                break;
            case R.id.action_about:
                Intent aboutIntent = new Intent(this, AboutActivity.class);
                startActivity(aboutIntent);
                break;


        }
        return super.onOptionsItemSelected(item);

    }
}

