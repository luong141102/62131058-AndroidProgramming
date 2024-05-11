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
        recyclerViewDatas.add(new LandScape("tan", "Tanjiro"));
        recyclerViewDatas.add(new LandScape("zen", "Zenitsu"));
        recyclerViewDatas.add(new LandScape("ino", "Inosuke"));
        recyclerViewDatas.add(new LandScape("mui", "Muichiro"));
        recyclerViewDatas.add(new LandScape("demdaysao", "Đêm đầy sao"));
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