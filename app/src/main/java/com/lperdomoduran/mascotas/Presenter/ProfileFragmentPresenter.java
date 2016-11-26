package com.lperdomoduran.mascotas.Presenter;

import android.content.Context;

import com.lperdomoduran.mascotas.Fragments.IProfileFragment;
import com.lperdomoduran.mascotas.Fragments.IRecyclerViewFragmentView;
import com.lperdomoduran.mascotas.Model.ConstructorMascota;
import com.lperdomoduran.mascotas.Model.Mascota;

import java.util.ArrayList;

/**
 * Created by lperdomoduran on 25/11/16.
 */

public class ProfileFragmentPresenter implements IProfileFragmentPresenter {

    private IProfileFragment iProfileFragment;
    private Context context;
    private ConstructorMascota constructorMascota;
    private ArrayList<Mascota> mascotas;

    public ProfileFragmentPresenter(IProfileFragment iProfileFragment, Context context) {
        this.iProfileFragment = iProfileFragment;
        this.context = context;
        getMascotas();
    }


    @Override
    public void getMascotas(){
        constructorMascota = new ConstructorMascota(context);
        mascotas = constructorMascota.getData();
        showMascotasRV();;
    }

    @Override
    public void showMascotasRV(){
        iProfileFragment.initAdapterRV(iProfileFragment.createAdapter(mascotas));
        iProfileFragment.generateLLV();
    }
}
