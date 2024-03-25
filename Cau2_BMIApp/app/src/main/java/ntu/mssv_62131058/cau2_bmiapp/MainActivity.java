package ntu.mssv_62131058.cau2_bmiapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edtCN;
    EditText edtCC;
    TextView tvKQ;
    Button btnKQ, btnRS;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        View();
        btnKQ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Result();
            }
        });
        btnRS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Reset();
            }
        });
    }
    public void Result(){
        String Cn = edtCN.getText().toString();
        String Cc = edtCC.getText().toString();
        double canNang = Double.parseDouble(Cn);
        double chieuCao = Double.parseDouble(Cc);
        double kq = canNang / (chieuCao*chieuCao);
        String KQ;
        if (kq < 18.5){
            KQ = "Gầy";
        } else if (kq >=18.5 && kq <=24.9) {
            KQ = "Bình Thường";
        } else if (kq >=25 && kq<=29.9) {
            KQ = "Tiền Béo Phì";
        } else if (kq >= 30 && kq <=34.9) {
            KQ = "Béo Phì Độ 1";
        } else if (kq >= 35 && kq <=39.9) {
            KQ = "Béo Phì Độ 2";
        } else {
            KQ = "Béo Phì Độ 3";
        }
        tvKQ.setText(KQ);
    }
    public void Reset(){
        edtCN.setText("");
        edtCC.setText("");
        tvKQ.setText("");
    }
    void View(){
        edtCN = findViewById(R.id.edtCN);
        edtCC = findViewById(R.id.edtCC);
        tvKQ = findViewById(R.id.tvKQ);
        btnKQ = findViewById(R.id.btnKQ);
        btnRS = findViewById(R.id.btnRS);
    }
}