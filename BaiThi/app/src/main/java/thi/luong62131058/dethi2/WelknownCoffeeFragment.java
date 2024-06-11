package thi.luong62131058.dethi2;

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
 * Use the {@link WelknownCoffeeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class WelknownCoffeeFragment extends Fragment {
    LandScapeAdapter landScapeAdapter;
    ArrayList<LandScape> recyclerViewDatas;
    RecyclerView recyclerViewLandScape;
    public WelknownCoffeeFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment WelknownCoffeeFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static WelknownCoffeeFragment newInstance(String param1, String param2) {
        WelknownCoffeeFragment fragment = new WelknownCoffeeFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        recyclerViewDatas = new ArrayList<LandScape>();
        recyclerViewDatas.add(new LandScape("cf1975", "Cafe 1975: Phước long, Nha Trang, Khánh Hòa"));
        recyclerViewDatas.add(new LandScape("f5cf", "F5 Game & Coffee: Vĩnh Phước, Nha Trang, Khánh Hòa"));
        recyclerViewDatas.add(new LandScape("giongcf", "Gióng Coffee: Lộc Thọ, Nha Trang, Khánh Hòa"));
        recyclerViewDatas.add(new LandScape("ongthomaycf", "Ông Thợ May Cafe: Vĩnh Hải, Nha Trang, Khánh Hòa"));
        recyclerViewDatas.add(new LandScape("tiemcf", "Tiệm Cà Phê: Vĩnh Phước, Nha Trang, Khánh Hòa"));
        recyclerViewDatas.add(new LandScape("trasuacf", "Trà Sữa & Cafe: Vĩnh Phước, Nha Trang, Khánh Hòa"));
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View vC3 = inflater.inflate(R.layout.fragment_welknown_coffee, container, false);
        recyclerViewLandScape = vC3.findViewById(R.id.recyclerLand);
        RecyclerView.LayoutManager layoutLinear = new LinearLayoutManager(vC3.getContext());
        recyclerViewLandScape.setLayoutManager(layoutLinear);
        landScapeAdapter = new LandScapeAdapter(vC3.getContext(), recyclerViewDatas);
        recyclerViewLandScape.setAdapter(landScapeAdapter);
        return vC3;
    }
}