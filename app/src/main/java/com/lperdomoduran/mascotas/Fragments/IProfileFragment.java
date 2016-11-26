package com.lperdomoduran.mascotas.Fragments;

import com.lperdomoduran.mascotas.Adapters.ProfileAdapter;
import com.lperdomoduran.mascotas.Model.Mascota;

import java.util.ArrayList;

/**
 * Created by lperdomoduran on 25/11/16.
 */

public interface IProfileFragment {

    public void generateLLV();

    public ProfileAdapter createAdapter(ArrayList<Mascota> mascotas);

    public void initAdapterRV(ProfileAdapter adapter);
}
