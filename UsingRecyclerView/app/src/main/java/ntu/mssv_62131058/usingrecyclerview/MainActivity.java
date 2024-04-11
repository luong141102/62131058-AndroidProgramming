package ntu.mssv_62131058.usingrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    LandScapeAdapter landScapeAdapter;
    ArrayList<LandScape> recyclerViewDatas;
    RecyclerView recyclerViewLandScape;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerViewDatas = getDataForRecyclerView();
        recyclerViewLandScape = findViewById(R.id.recyclerLand);
//        RecyclerView.LayoutManager layoutLinear = new LinearLayoutManager(this);
//        recyclerViewLandScape.setLayoutManager(layoutLinear);
        RecyclerView.LayoutManager layoutLinear = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        recyclerViewLandScape.setLayoutManager(layoutLinear);
        landScapeAdapter = new LandScapeAdapter(this, recyclerViewDatas);
        recyclerViewLandScape.setAdapter(landScapeAdapter);
    }
    ArrayList<LandScape> getDataForRecyclerView(){
        ArrayList<LandScape> dsDuLieu = new ArrayList<LandScape>();
        LandScape landScape1 = new LandScape("tan", "Tanjiro");
        dsDuLieu.add(landScape1);
        dsDuLieu.add(new LandScape("zen", "Zenitsu"));
        dsDuLieu.add(new LandScape("ino", "Inosuke"));
        dsDuLieu.add(new LandScape("mui", "Muichiro"));
        return dsDuLieu;
    }
}