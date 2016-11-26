package com.lperdomoduran.mascotas.Presenter;

import android.content.Context;
import android.support.v4.app.Fragment;

import com.lperdomoduran.mascotas.Fragments.IRecyclerViewFragmentView;
import com.lperdomoduran.mascotas.Model.ConstructorMascota;
import com.lperdomoduran.mascotas.Model.Mascota;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class RecyclerViewFragmentPresenter implements IRecyclerViewFragmentPresenter {

    private IRecyclerViewFragmentView iRecyclerViewFragmentView;
    private Context context;
    private ConstructorMascota constructorMascota;
    private ArrayList<Mascota> mascotas;

    public RecyclerViewFragmentPresenter(IRecyclerViewFragmentView iRecyclerViewFragmentView, Context context) {
        this.context = context;
        this.iRecyclerViewFragmentView = iRecyclerViewFragmentView;
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
        iRecyclerViewFragmentView.initAdapterRV(iRecyclerViewFragmentView.createAdapter(mascotas));
        iRecyclerViewFragmentView.generateLLV();
    }

}
