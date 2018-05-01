package com.example.banarsibabu.mr31app;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */


public class Fragment1 extends Fragment {

    EditText edt;
    TextView _txt2_btn;
    FragmentCallback mfragmentCallback;


    public Fragment1() {

        // Required empty public constructor

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_fragment1, container, false);
        edt = rootView.findViewById(R.id.edt);
        _txt2_btn = rootView.findViewById(R.id._txt2_btn);


        _txt2_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String str = edt.getText().toString();

                mfragmentCallback.show(str);

            }
        });


        return rootView;
    }

    public void setCallback(FragmentCallback fragmentCallback) {
        mfragmentCallback = fragmentCallback;
    }
}
