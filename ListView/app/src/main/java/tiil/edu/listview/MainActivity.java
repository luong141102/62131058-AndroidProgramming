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
        ArrayList<String> dsBH;
        dsBH = new ArrayList<String>();
        dsBH.add("Nha Trang thu");
        dsBH.add("Gan lam Truong Sa");
        dsBH.add("Ha Noi dem tro gio");

        ArrayAdapter<String> adapterBH;
        adapterBH = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                dsBH
        );
        lvbaiHat.setAdapter(adapterBH);
        lvbaiHat.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String chuoiThongBao = "Ban chon bai "+ dsBH.get(position);
                Toast.makeText(MainActivity.this, chuoiThongBao, Toast.LENGTH_SHORT).show();
                //HamXuLyChonItem(position);
            }
        });
    }
    void HamXuLyChonItem(int vitri, View v, int position){
        String chuoiThongBao = "Ban chon bai "+ dsBH.get(position);
        Toast.makeText(MainActivity.this, chuoiThongBao, Toast.LENGTH_SHORT).show();
    }
    void timDK(){
        ListView lvBaiHat = findViewById(R.id.dsBH);
    }
}