package layout;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.lperdomoduran.mascotas.Mascota;
import com.lperdomoduran.mascotas.MascotaAdapter;
import com.lperdomoduran.mascotas.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class ProfileFragment extends Fragment {

    ArrayList<Mascota> miMascota = new ArrayList<Mascota>();
    private RecyclerView listaMascotas;

    public ProfileFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_profile, container, false);
        listaMascotas = (RecyclerView) view.findViewById(R.id.rv_mascotas);







        GridLayoutManager llm = new GridLayoutManager(getActivity(), 2);
        listaMascotas.setHasFixedSize(true);
        listaMascotas.setLayoutManager(llm);
        initMascotaList();
        initAdapter();
        return view;
    }

    public void initAdapter() {
        MascotaAdapter adapter = new MascotaAdapter(miMascota);
        listaMascotas.setAdapter(adapter);
    }

    public void initMascotaList() {

        miMascota.add(new Mascota("Joe", R.drawable.mucuchies, "0"));
        miMascota.add(new Mascota("Joe", R.drawable.mucuchies, "0"));
        miMascota.add(new Mascota("Joe", R.drawable.mucuchies, "0"));
        miMascota.add(new Mascota("Joe", R.drawable.mucuchies, "0"));
        miMascota.add(new Mascota("Joe", R.drawable.mucuchies, "0"));
        miMascota.add(new Mascota("Joe", R.drawable.mucuchies, "0"));
        miMascota.add(new Mascota("Joe", R.drawable.mucuchies, "0"));
        miMascota.add(new Mascota("Joe", R.drawable.mucuchies, "0"));
        miMascota.add(new Mascota("Joe", R.drawable.mucuchies, "0"));
    }

}
