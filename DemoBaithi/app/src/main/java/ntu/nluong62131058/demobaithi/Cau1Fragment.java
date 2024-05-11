package ntu.nluong62131058.demobaithi;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Cau1Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Cau1Fragment extends Fragment {
    EditText editText_met;
    EditText editText_Km;
    Button btnChuyen;
    public Cau1Fragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Cau1Fragment.
     */
    // TODO: Rename and change types and number of parameters
    public static Cau1Fragment newInstance(String param1, String param2) {
        Cau1Fragment fragment = new Cau1Fragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View viewCau1 =inflater.inflate(R.layout.fragment_cau1, container, false);
        editText_met = viewCau1.findViewById(R.id.editSom);
        editText_Km = viewCau1.findViewById(R.id.editKm);
        btnChuyen = viewCau1.findViewById(R.id.btnDoi);
        btnChuyen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String dlMet = editText_met.getText().toString();
                String dlKm = editText_Km.getText().toString();
                if (dlMet.isEmpty()){

                }else {

                }
            }
        });
        return viewCau1;
    }
}