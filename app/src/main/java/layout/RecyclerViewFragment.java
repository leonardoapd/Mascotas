package layout;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
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
public class RecyclerViewFragment extends Fragment {

    ArrayList<Mascota> miMascota = new ArrayList<Mascota>();
    private RecyclerView listaMascotas;

    public RecyclerViewFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_recycler_view, container, false);
        listaMascotas = (RecyclerView) view.findViewById(R.id.rv_mascotas);


        LinearLayoutManager llm = new LinearLayoutManager((getActivity()));
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        //GridLayoutManager llm = new GridLayoutManager(this, 2);
        listaMascotas.setLayoutManager(llm);
        listaMascotas.setHasFixedSize(true);
        initMascotaList();
        initAdapter();
        return view;
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

}
