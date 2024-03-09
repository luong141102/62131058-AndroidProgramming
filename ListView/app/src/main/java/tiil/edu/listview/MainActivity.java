package tiil.edu.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayAdapter<String> adapterBH;
    ArrayList<String> dsBH;
    ListView lvbaiHat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        timDK();
        dsBH = new ArrayList<String>();
        dsBH.add("Chân Tình");
        dsBH.add("Chúng Ta Của Tương Lai");
        dsBH.add("Vết Mưa");
        dsBH.add("Khóa Ly Biệt");

        adapterBH = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                dsBH
        );
        lvbaiHat.setAdapter(adapterBH);
        lvbaiHat.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String chuoiThongBao = "Bạn chọn bài "+ dsBH.get(position);
                Toast.makeText(MainActivity.this, chuoiThongBao, Toast.LENGTH_SHORT).show();
            }
        });
    }
    void timDK(){
        lvbaiHat = findViewById(R.id.listView);
    }
}