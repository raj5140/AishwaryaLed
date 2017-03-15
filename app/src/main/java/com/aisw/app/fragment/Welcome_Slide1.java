package com.aisw.app.fragment;

import android.os.Bundle;
import android.preference.EditTextPreference;
import android.support.v4.app.Fragment;
import android.text.InputType;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.aisw.app.R;

import java.text.BreakIterator;


public class Welcome_Slide1 extends Fragment {

    EditText edtxt1,edtxt2,edtxt7;

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View myFragmentView = inflater.inflate(R.layout.welcome_slide1, container, false);

            edtxt1 = (EditText)myFragmentView.findViewById( R.id.edtxt1 );
            edtxt2 = (EditText)myFragmentView.findViewById( R.id.edtxt2 );
            edtxt7 = (EditText)myFragmentView.findViewById( R.id.edtxt7 );

            edtxt1.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_FLAG_CAP_SENTENCES | InputType.TYPE_TEXT_FLAG_NO_SUGGESTIONS);
            edtxt2.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_FLAG_CAP_SENTENCES);
            edtxt7.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_FLAG_CAP_SENTENCES);

            return myFragmentView;
        }

}
