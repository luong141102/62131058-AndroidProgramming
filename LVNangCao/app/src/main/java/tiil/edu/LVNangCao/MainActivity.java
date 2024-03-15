package tiil.edu.LVNangCao;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

import tiil.edu.LVNangCao.models.Country;

public class MainActivity extends AppCompatActivity {

    ArrayList<Country> dsQG;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.country_item);
        dsQG = new ArrayList<Country>();
        dsQG.add(new Country("VietNam", 90, "vn"));
        dsQG.add(new Country("Russia", 110, "ru"));
        dsQG.add(new Country("United State", 80, "us"));

    }

}