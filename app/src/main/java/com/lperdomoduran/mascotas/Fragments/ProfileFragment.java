package com.lperdomoduran.mascotas.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.lperdomoduran.mascotas.Adapters.ProfileAdapter;
import com.lperdomoduran.mascotas.Model.Mascota;
import com.lperdomoduran.mascotas.Adapters.MascotaAdapter;
import com.lperdomoduran.mascotas.Presenter.IProfileFragmentPresenter;
import com.lperdomoduran.mascotas.Presenter.IRecyclerViewFragmentPresenter;
import com.lperdomoduran.mascotas.Presenter.ProfileFragmentPresenter;
import com.lperdomoduran.mascotas.Presenter.RecyclerViewFragmentPresenter;
import com.lperdomoduran.mascotas.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class ProfileFragment extends Fragment implements IProfileFragment {

    ArrayList<Mascota> miMascota = new ArrayList<Mascota>();
    private RecyclerView listaMascotas;
    private IProfileFragmentPresenter presenter;

    public ProfileFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_profile, container, false);
        listaMascotas = (RecyclerView) view.findViewById(R.id.rv_gl_mascotas);
        presenter = new ProfileFragmentPresenter(this, getContext());
        return view;
    }


    public void generateLLV() {
        GridLayoutManager glm = new GridLayoutManager(getActivity(), 3);
        listaMascotas.setLayoutManager(glm);
    }

    @Override
    public ProfileAdapter createAdapter(ArrayList<Mascota> mascotas) {
        ProfileAdapter adapter = new ProfileAdapter(mascotas, getActivity());
        return adapter;
    }


    @Override
    public void initAdapterRV(ProfileAdapter adapter) {
        listaMascotas.setAdapter(adapter);
    }



}
