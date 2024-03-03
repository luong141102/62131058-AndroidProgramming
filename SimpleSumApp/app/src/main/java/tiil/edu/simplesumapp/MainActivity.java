package tiil.edu.simplesumapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void XuLyCong(View view){
        EditText editTextSoA = findViewById(R.id.edtA);
        EditText editTextSoB = findViewById(R.id.edtB);
        EditText editTextKQ = findViewById(R.id.edtKQ);

        String strA = editTextSoA.getText().toString();
        String strB = editTextSoB.getText().toString();

        int so_A = Integer.parseInt(strA);
        int so_B = Integer.parseInt(strB);

        int tong = so_A + so_B;
        String strTong = String.valueOf(tong);
        editTextKQ.setText(strTong);
    }
    public void Reset(View view){
        EditText editTextSoA = findViewById(R.id.edtA);
        EditText editTextSoB = findViewById(R.id.edtB);
        EditText editTextKQ = findViewById(R.id.edtKQ);
        editTextSoA.setText("");
        editTextSoB.setText("");
        editTextKQ.setText("");
    }
}