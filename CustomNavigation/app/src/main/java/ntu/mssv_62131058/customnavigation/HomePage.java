package ntu.mssv_62131058.customnavigation;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import ntu.mssv_62131058.customnavigation.R;
import androidx.appcompat.app.AppCompatActivity;
public class HomePage extends Fragment {
    LandScapeAdapter landScapeAdapter;
    ArrayList<LandScape> recyclerViewDatas;
    RecyclerView recyclerViewLandScape;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        recyclerViewDatas = new ArrayList<LandScape>();
        recyclerViewDatas.add(new LandScape("tan", "Tanjiro"));
        recyclerViewDatas.add(new LandScape("zen", "Zenitsu"));
        recyclerViewDatas.add(new LandScape("ino", "Inosuke"));
        recyclerViewDatas.add(new LandScape("mui", "Muichiro"));
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.home_page, container, false);
        recyclerViewLandScape = view.findViewById(R.id.recyclerLand);
        RecyclerView.LayoutManager layoutLinear = new LinearLayoutManager(view.getContext());
        recyclerViewLandScape.setLayoutManager(layoutLinear);
        landScapeAdapter = new LandScapeAdapter(view.getContext(), recyclerViewDatas);
        recyclerViewLandScape.setAdapter(landScapeAdapter);
        return view;
    }
}
