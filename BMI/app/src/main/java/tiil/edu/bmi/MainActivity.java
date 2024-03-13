package tiil.edu.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edtCN;
    EditText edtCC;
    Button btnKQ, btnRS;
    TextView tvKQ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        View();
        btnKQ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                KetQua();
            }
        });
        btnRS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Reset();
            }
        });
    }
    public void KetQua(){
        String Cn =edtCN.getText().toString();
        String Cc = edtCC.getText().toString();
        double canNang = Double.parseDouble(Cn);
        double chieuCao = Double.parseDouble(Cc);
        double kq = canNang / (chieuCao*chieuCao);
        String KQ = String.valueOf(kq);
        if (kq < 18.5){
            KQ = "Gầy";
        } else if (kq >=18.5 && kq <24.9) {
            KQ = "Bình Thường";
        } else if (kq >=25 && kq<29.9) {
            KQ = "Tiền Béo Phì";
        } else if (kq >= 30 && kq <34.9) {
            KQ = "Béo Phì Độ I";
        } else if (kq >= 35 && kq <39.9) {
            KQ = "Béo Phì Độ II";
        } else if (kq >= 40) {
            KQ = "Béo Phì Độ III";
        }
        tvKQ.setText(KQ);
    }
    public void Reset(){
        edtCN.setText("");
        edtCC.setText("");
        tvKQ.setText("");
    }
    void View() {
        edtCN = findViewById(R.id.edtCN);
        edtCC = findViewById(R.id.edtCC);
        btnKQ = findViewById(R.id.btnKQ);
        tvKQ = findViewById(R.id.tvKQ);
        btnRS = findViewById(R.id.btnRS);
    }
}