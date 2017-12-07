package com.example.taruc.lab33navigationdrawer;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class ImportFragment extends Fragment {
    private TextView textViewMesssage;



    public ImportFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {
    View v= inflater.inflate(R.layout.fragment_import, container, false);

    textViewMesssage = (TextView) v.findViewById(R.id.textViewMessage);
    Button buttonShowMessage = (Button) v.findViewById(R.id.buttonShowMEssage);
    buttonShowMessage.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            textViewMesssage.setText("Say Cheese");
        }
    });
        // Inflate the layout for this fragment
    return v;
    }

}
