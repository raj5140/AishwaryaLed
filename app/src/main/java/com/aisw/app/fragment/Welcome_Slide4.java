package com.aisw.app.fragment;


import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.text.InputType;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.aisw.app.R;

public class Welcome_Slide4 extends Fragment {

    EditText edtxt20x,edtxt23;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View myFragmentView = inflater.inflate(R.layout.welcome_slide4, container, false);

        edtxt20x = (EditText) myFragmentView.findViewById(R.id.edtxt20x);
        edtxt20x.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_FLAG_CAP_SENTENCES);

        edtxt23 = (EditText) myFragmentView.findViewById(R.id.edtxt23);
        edtxt23.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_FLAG_CAP_SENTENCES);


        return myFragmentView;
    }
}