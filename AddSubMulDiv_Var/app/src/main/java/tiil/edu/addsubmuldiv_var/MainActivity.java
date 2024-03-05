package tiil.edu.addsubmuldiv_var;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edtSoA;
    EditText edtSoB;
    Button btnCong, btnTru, btnNhan, btnChia;
    TextView tvKetQua;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TimView();
        btnCong.setOnClickListener(boLangNghe_XuLyCong);
        btnTru.setOnClickListener(boLangNghe_XuLyTru);
        btnNhan.setOnClickListener(boLangNghe_XuLyNhan);
        btnChia.setOnClickListener(boLangNghe_XuLyChia);
    }

    View.OnClickListener boLangNghe_XuLyCong = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String strSoA = edtSoA.getText().toString();
            String strSoB = edtSoB.getText().toString();
            double soA = Double.parseDouble(strSoA);
            double soB = Double.parseDouble(strSoB);
            double tong = soA + soB;
            String strKQ = String.valueOf(tong);
            tvKetQua.setText(strKQ);
        }
    };
    View.OnClickListener boLangNghe_XuLyTru = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String strSoA = edtSoA.getText().toString();
            String strSoB = edtSoB.getText().toString();
            double soA = Double.parseDouble(strSoA);
            double soB = Double.parseDouble(strSoB);
            double tong = soA - soB;
            String strKQ = String.valueOf(tong);
            tvKetQua.setText(strKQ);
        }
    };
    View.OnClickListener boLangNghe_XuLyNhan = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String strSoA = edtSoA.getText().toString();
            String strSoB = edtSoB.getText().toString();
            double soA = Double.parseDouble(strSoA);
            double soB = Double.parseDouble(strSoB);
            double tong = soA * soB;
            String strKQ = String.valueOf(tong);
            tvKetQua.setText(strKQ);
        }
    };
    View.OnClickListener boLangNghe_XuLyChia = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String strSoA = edtSoA.getText().toString();
            String strSoB = edtSoB.getText().toString();
            double soA = Double.parseDouble(strSoA);
            double soB = Double.parseDouble(strSoB);
            double tong = soA / soB;
            String strKQ = String.valueOf(tong);
            tvKetQua.setText(strKQ);
        }
    };
    void TimView(){
        edtSoA = findViewById(R.id.edtA);
        edtSoB = findViewById(R.id.edtB);
        btnCong = findViewById(R.id.btnCong);
        btnTru = findViewById(R.id.btnTru);
        btnNhan = findViewById(R.id.btnNhan);
        btnChia = findViewById(R.id.btnChia);
        tvKetQua = findViewById(R.id.tvKetQua);
    }
}