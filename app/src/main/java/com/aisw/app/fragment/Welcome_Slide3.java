package com.aisw.app.fragment;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputType;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.RadioButton;

import com.aisw.app.R;
import com.aisw.app.utils.MessageEvent;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

public class Welcome_Slide3 extends Fragment {

    EditText edtxt20yy,edtxt17, edtxt16, edtxt18, edtxt19,editTextVisib,edtxt22,edtxt20;

    RadioButton radioButton5, radioButton6;

    int e20, e21, e22, e23, e24,e25,e26,e27;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View myFragmentView = inflater.inflate(R.layout.welcome_slide3, container, false);

        edtxt17 = (EditText) myFragmentView.findViewById(R.id.edtxt17);
        edtxt17.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_FLAG_CAP_SENTENCES);

        edtxt22 = (EditText) myFragmentView.findViewById(R.id.edtxt22);
        edtxt22.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_FLAG_CAP_SENTENCES);
        edtxt18 = (EditText) myFragmentView.findViewById(R.id.edtxt18);
        edtxt20= (EditText) myFragmentView.findViewById(R.id.edtxt20);
        edtxt19 = (EditText) myFragmentView.findViewById(R.id.edtxt19);
        edtxt20yy=(EditText) myFragmentView.findViewById(R.id.edtxt20yy);
        editTextVisib= (EditText) myFragmentView.findViewById(R.id.editTextVisib);
        radioButton5 = (RadioButton) myFragmentView.findViewById(R.id.radioButton5);
        radioButton6 = (RadioButton) myFragmentView.findViewById(R.id.radioButton6);
        edtxt22 = (EditText) myFragmentView.findViewById(R.id.edtxt22);

        edtxt16 = (EditText) myFragmentView.findViewById(R.id.edtxt16);



        edtxt18.addTextChangedListener(new MyTextWatcher(edtxt16));
        edtxt16.addTextChangedListener(new TextWatcher() {

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void afterTextChanged(Editable s) {
                calCheckPercent();
            }
        });

        edtxt20.addTextChangedListener(new TextWatcher() {

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void afterTextChanged(Editable s) {
                calCheckPercent();
            }
        });

        radioButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onRadioButtonClicked1(radioButton5);
            }
        });

        radioButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onRadioButtonClicked1(radioButton6);

            }
        });


        return myFragmentView;
    }

    public void onRadioButtonClicked1(View view) {

        boolean checked = ((RadioButton) view).isChecked();

        if (view == radioButton5) {
            radioButton6.setChecked(false);
            edtxt17.setEnabled(true);
            editTextVisib.setText("Yes");
            edtxt17.setFocusableInTouchMode(true);
            edtxt17.setClickable(true);
            edtxt18.setEnabled(true);
            edtxt18.setFocusableInTouchMode(true);
            edtxt18.setClickable(true);
            edtxt17.setBackgroundResource(R.drawable.rounded_border_edittext);
            edtxt18.setBackgroundResource(R.drawable.rounded_border_edittext);


        } else if (view == radioButton6) {
            radioButton5.setChecked(false);
            editTextVisib.setText("No");
            edtxt17.setEnabled(false);
            edtxt17.setFocusableInTouchMode(false);
            edtxt17.setClickable(false);
            edtxt18.setEnabled(false);
            edtxt18.setFocusableInTouchMode(false);
            edtxt18.setClickable(false);
            edtxt17.setBackgroundResource(R.drawable.disabled_edittext_round);
            edtxt18.setBackgroundResource(R.drawable.disabled_edittext_round);


        }
    }


    private class MyTextWatcher implements TextWatcher {

        EditText mEditText1 = null;


        public MyTextWatcher(EditText mEditText1) {
            this.mEditText1 = mEditText1;

        }


        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {

        }

        @Override
        public void afterTextChanged(Editable s) {

            calCheckPercent();


        }
    }

    public void calCheckPercent() {

        try {


            e20 = edtxt16.getText().toString().equals("") ? 0 : Integer.parseInt(edtxt16.getText().toString());
            e21 = edtxt18.getText().toString().equals("") ? 0 : Integer.parseInt(edtxt18.getText().toString());
            e22 = e20 * e21;
            Log.e("::::::::::multy::::::", String.valueOf(e22));
            e23 = e22 / 100;
            Log.e("::::::::::divide::::::", String.valueOf(e23));
            e24= e23 + e20;
            edtxt19.setText(String.valueOf(e24));

            e25=edtxt20.getText().toString().equals("") ? 0 : Integer.parseInt(edtxt20.getText().toString());

            e27=edtxt19.getText().toString().equals("") ? 0 : Integer.parseInt(edtxt19.getText().toString());
            e26= e27 - e25;

            edtxt20yy.setText(String.valueOf(e26));



        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        EventBus.getDefault().register(this);
    }

    @Override
    public void onDetach() {
        super.onDetach();
        EventBus.getDefault().unregister(this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEvent(String s){
        edtxt16.setText(s);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onMessage1(MessageEvent.Message1 event) {
        edtxt22.setText(event.str1);
    }



}