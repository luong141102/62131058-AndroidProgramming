package tiil.edu.LVNangCao;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

import tiil.edu.LVNangCao.models.Country;
import tiil.edu.LVNangCao.models.Countrys.CountryAdapter;

public class MainActivity extends AppCompatActivity {

    ArrayList<Country> dsQG;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dsQG = new ArrayList<Country>();
        dsQG.add(new Country("Viet Nam", 90, "vn"));
        dsQG.add(new Country("Russia", 110, "ru"));
        dsQG.add(new Country("United State", 80, "us"));

        ListView listView = findViewById(R.id.lvQG);
        CountryAdapter adapter = new CountryAdapter(this, dsQG);
        listView.setAdapter(adapter);
    }

}