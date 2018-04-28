package com.example.banarsibabu.mr31app;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import static com.example.banarsibabu.mr31app.R.id._txt_show;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment2 extends Fragment implements FragmentCallback {
    TextView _txt_show;

    public Fragment2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_fragment2, container, false);
        _txt_show = rootView.findViewById(R.id._txt_show);

        return rootView;
    }

    @Override
    public void show(String str) {
        _txt_show.setText(str);

    }
}
