package thi.luong62131058.dethi2;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link UnitConverterFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class UnitConverterFragment extends Fragment {
    EditText editKm, editm, editKg, editg, editByte, editBit;
    Button btnKm, btnKg, btnByte;
    public UnitConverterFragment() {
        // Required empty public constructor
    }

    public static UnitConverterFragment newInstance(String param1, String param2) {
        UnitConverterFragment fragment = new UnitConverterFragment();
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
        View vC2 = inflater.inflate(R.layout.fragment_unit_converter, container, false);
        return vC2;
    }
}