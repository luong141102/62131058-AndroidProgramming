package ntu.mssv_62131058.bottomnavi_recyclerview;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link AlgorithmFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class AlgorithmFragment extends Fragment {

    LandScapeAdapter landScapeAdapter;
    ArrayList<LandScape> recyclerViewDatas;
    RecyclerView recyclerViewLandScape;
    public AlgorithmFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment AlgorithmFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static AlgorithmFragment newInstance(String param1, String param2) {
        AlgorithmFragment fragment = new AlgorithmFragment();
        Bundle args = new Bundle();

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        recyclerViewDatas = new ArrayList<LandScape>();
        recyclerViewDatas.add(new LandScape("starnight", "The Starry Nights"));
        recyclerViewDatas.add(new LandScape("dog", "Dogs Playing Poker"));
        recyclerViewDatas.add(new LandScape("lastnight", "The Last Supper"));
        recyclerViewDatas.add(new LandScape("guernica", "Guernica"));
        recyclerViewDatas.add(new LandScape("landscape", "Landscape With The Fall Of Icarus"));
        recyclerViewDatas.add(new LandScape("thekiss", "The Kiss"));
        recyclerViewDatas.add(new LandScape("anderszorn", "Anders Zorn Our Daily Bread"));
        recyclerViewDatas.add(new LandScape("magic", "The Adoration of the Magi"));
        recyclerViewDatas.add(new LandScape("gleaners", "The Gleaners"));
        recyclerViewDatas.add(new LandScape("nightwave", "The Night Wave"));

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View viewAl = inflater.inflate(R.layout.fragment_algorithm, container, false);
        recyclerViewLandScape = viewAl.findViewById(R.id.recyclerLand);
        RecyclerView.LayoutManager layoutLinear = new LinearLayoutManager(viewAl.getContext());
        recyclerViewLandScape.setLayoutManager(layoutLinear);
        landScapeAdapter = new LandScapeAdapter(viewAl.getContext(), recyclerViewDatas);
        recyclerViewLandScape.setAdapter(landScapeAdapter);
        return viewAl;
    }
}