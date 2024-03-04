package tiil.edu.addsubmuldiv_anynomous;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText editTextSo1;
    EditText editTextSo2;
    EditText editTextKQ;
    Button nutCong, nutTru, nutNhan, nutChia, nutRs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Tinh();
        View.OnClickListener boLangNgheCong = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Cong();
            }
        };
        nutCong.setOnClickListener(boLangNgheCong);
        nutTru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Tru();
            }
        });
        nutNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Nhan();
            }
        });
        nutChia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Chia();
            }
        });
        nutRs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Reset();
            }
        });

    }
    void Tinh(){
        editTextSo1 = findViewById(R.id.edtSo1);
        editTextSo2 = findViewById(R.id.edtSo2);
        editTextKQ = findViewById(R.id.edtKQ);
        nutCong = findViewById(R.id.btnCong);
        nutTru = findViewById(R.id.btnTru);
        nutNhan = findViewById(R.id.btnNhan);
        nutChia = findViewById(R.id.btnChia);
        nutRs = findViewById(R.id.btnR);
    }
    public void Cong(){
        String So1 = editTextSo1.getText().toString();
        String So2 = editTextSo2.getText().toString();
        float so1 = Float.parseFloat(So1);
        float so2 = Float.parseFloat(So2);
        float tong = so1 + so2;
        String KQ = String.valueOf(tong);
        editTextKQ.setText(KQ);
    }
    public void Tru(){
        String So1 = editTextSo1.getText().toString();
        String So2 = editTextSo2.getText().toString();
        float so1 = Float.parseFloat(So1);
        float so2 = Float.parseFloat(So2);
        float tong = so1 - so2;
        String KQ = String.valueOf(tong);
        editTextKQ.setText(KQ);
    }
    public void Nhan(){
        String So1 = editTextSo1.getText().toString();
        String So2 = editTextSo2.getText().toString();
        float so1 = Float.parseFloat(So1);
        float so2 = Float.parseFloat(So2);
        float tong = so1 * so2;
        String KQ = String.valueOf(tong);
        editTextKQ.setText(KQ);
    }
    public void Chia(){
        String So1 = editTextSo1.getText().toString();
        String So2 = editTextSo2.getText().toString();
        float so1 = Float.parseFloat(So1);
        float so2 = Float.parseFloat(So2);
        float tong = so1 / so2;
        String KQ = String.valueOf(tong);
        editTextKQ.setText(KQ);
    }
    public void Reset(){
        editTextSo1.setText("");
        editTextSo2.setText("");
        editTextKQ.setText("");
    }
}