package com.lperdomoduran.mascotas.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.lperdomoduran.mascotas.Adapters.MascotaAdapter;
import com.lperdomoduran.mascotas.Model.Mascota;
import com.lperdomoduran.mascotas.Presenter.IRecyclerViewFragmentPresenter;
import com.lperdomoduran.mascotas.Presenter.RecyclerViewFragmentPresenter;
import com.lperdomoduran.mascotas.R;

import java.util.ArrayList;

/**
 * Created by lperdomoduran on 25/11/16.
 */

public class RecyclerViewFragment extends Fragment implements IRecyclerViewFragmentView {

    private ArrayList<Mascota> mascotas;
    private RecyclerView rvMascotas;
    private IRecyclerViewFragmentPresenter presenter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);
        View v = inflater.inflate(R.layout.fragment_recycler_view, container, false);

        rvMascotas = (RecyclerView) v.findViewById(R.id.rv_mascotas);
        presenter = new RecyclerViewFragmentPresenter(this, getContext());
        return v;
    }

    @Override
    public void generateLLV() {
        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        rvMascotas.setLayoutManager(llm);
    }

    @Override
    public MascotaAdapter createAdapter(ArrayList<Mascota> mascotas) {
        MascotaAdapter adapter = new MascotaAdapter(mascotas, getActivity());
        return adapter;
    }

    @Override
    public void initAdapterRV(MascotaAdapter adapter) {
        rvMascotas.setAdapter(adapter);
    }
}
