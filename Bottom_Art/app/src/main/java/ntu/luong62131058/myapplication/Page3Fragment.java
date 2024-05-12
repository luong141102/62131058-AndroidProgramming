package ntu.luong62131058.myapplication;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Page3Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Page3Fragment extends Fragment {
    LandScapeAdapter landScapeAdapter;
    ArrayList<LandScape> recyclerViewDatas;
    RecyclerView recyclerViewLandScape;

    public Page3Fragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Page3Fragment.
     */
    // TODO: Rename and change types and number of parameters
    public static Page3Fragment newInstance(String param1, String param2) {
        Page3Fragment fragment = new Page3Fragment();
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
        // Inflate the layout for this fragment
        View viewP3 = inflater.inflate(R.layout.fragment_page3, container, false);
        recyclerViewLandScape = viewP3.findViewById(R.id.recyclerLand);
        RecyclerView.LayoutManager layoutLinear = new LinearLayoutManager(viewP3.getContext());
        recyclerViewLandScape.setLayoutManager(layoutLinear);
        landScapeAdapter = new LandScapeAdapter(viewP3.getContext(), recyclerViewDatas);
        recyclerViewLandScape.setAdapter(landScapeAdapter);
        return viewP3;
    }
}