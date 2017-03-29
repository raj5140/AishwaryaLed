package com.aisw.app.fragment;


import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputType;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.RadioButton;

import com.aisw.app.R;

public class Welcome_Slide4 extends Fragment {

    EditText edtxt23,edtxt20x,edtxt21x,edtxt22x,edtxt20xx,edtxt21xx,edtxt22xx,edtxt20xxx,edtxt21xxx,edtxt22xxx;

    EditText editText1Invs,editText2Invs,editText3Invs;

    RadioButton radioButton7,radioButton8,radioButton9,radioButton10,radioButton11,radioButton12;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View myFragmentView = inflater.inflate(R.layout.welcome_slide4, container, false);

        edtxt20x = (EditText) myFragmentView.findViewById(R.id.edtxt20x);
        edtxt20x.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_FLAG_CAP_SENTENCES);
        edtxt20xx = (EditText) myFragmentView.findViewById(R.id.edtxt20xx);
        edtxt20xx.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_FLAG_CAP_SENTENCES);
        edtxt20xxx = (EditText) myFragmentView.findViewById(R.id.edtxt20xxx);
        edtxt20xxx.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_FLAG_CAP_SENTENCES);

        edtxt21x = (EditText) myFragmentView.findViewById(R.id.edtxt21x);
        edtxt22x = (EditText) myFragmentView.findViewById(R.id.edtxt22x);
        edtxt21xx = (EditText) myFragmentView.findViewById(R.id.edtxt21xx);
        edtxt22xx = (EditText) myFragmentView.findViewById(R.id.edtxt22xx);
        edtxt21xxx = (EditText) myFragmentView.findViewById(R.id.edtxt21xxx);
        edtxt22xxx = (EditText) myFragmentView.findViewById(R.id.edtxt22xxx);

        edtxt23 = (EditText) myFragmentView.findViewById(R.id.edtxt23);
        edtxt23.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_FLAG_CAP_SENTENCES);

        radioButton7=(RadioButton)myFragmentView.findViewById(R.id.radioButton7);
        radioButton8=(RadioButton)myFragmentView.findViewById(R.id.radioButton8);
        radioButton9=(RadioButton)myFragmentView.findViewById(R.id.radioButton9);
        radioButton10=(RadioButton)myFragmentView.findViewById(R.id.radioButton10);
        radioButton11=(RadioButton)myFragmentView.findViewById(R.id.radioButton11);
        radioButton12=(RadioButton)myFragmentView.findViewById(R.id.radioButton12);

        editText1Invs= (EditText) myFragmentView.findViewById(R.id.editText1Invs);
        editText2Invs= (EditText) myFragmentView.findViewById(R.id.editText2Invs);
        editText3Invs= (EditText) myFragmentView.findViewById(R.id.editText3Invs);
        editText1Invs.setSingleLine(false);
        editText2Invs.setSingleLine(false);
        editText3Invs.setSingleLine(false);


        radioButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onRadioButtonClicked5(radioButton7);
            }
        });

        radioButton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onRadioButtonClicked5(radioButton8);
            }
        });

        radioButton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onRadioButtonClicked5(radioButton9);
            }
        });

        radioButton10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onRadioButtonClicked5(radioButton10);
            }
        });

        radioButton11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onRadioButtonClicked5(radioButton11);
            }
        });

        radioButton12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onRadioButtonClicked5(radioButton12);
            }
        });

        edtxt20x.addTextChangedListener(new TextWatcher() {

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void afterTextChanged(Editable s) {

                editText1Invs.setText("Photographer : Yes"+"\nName: "+edtxt20x.getText().toString()+"\nMobile: "+edtxt21x.getText().toString()+"\nMail ID: "+edtxt22x.getText().toString());


            }
        });

        edtxt21x.addTextChangedListener(new TextWatcher() {

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void afterTextChanged(Editable s) {

                editText1Invs.setText("Photographer : Yes"+"\nName: "+edtxt20x.getText().toString()+"\nMobile: "+edtxt21x.getText().toString()+"\nMail ID: "+edtxt22x.getText().toString());


            }
        });

        edtxt22x.addTextChangedListener(new TextWatcher() {

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void afterTextChanged(Editable s) {

                editText1Invs.setText("Photographer : Yes"+"\nName: "+edtxt20x.getText().toString()+"\nMobile: "+edtxt21x.getText().toString()+"\nMail ID: "+edtxt22x.getText().toString());


            }
        });

        edtxt20xx.addTextChangedListener(new TextWatcher() {

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void afterTextChanged(Editable s) {

                editText2Invs.setText("Video: Yes"+"\nName: "+edtxt20xx.getText().toString()+"\nMobile: "+edtxt21xx.getText().toString()+"\nMail ID: "+edtxt22xx.getText().toString());


            }
        });

        edtxt21xx.addTextChangedListener(new TextWatcher() {

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void afterTextChanged(Editable s) {

                editText2Invs.setText("Video: Yes"+"\nName: "+edtxt20xx.getText().toString()+"\nMobile: "+edtxt21xx.getText().toString()+"\nMail ID: "+edtxt22xx.getText().toString());


            }
        });

        edtxt22xx.addTextChangedListener(new TextWatcher() {

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void afterTextChanged(Editable s) {

                editText2Invs.setText("Video: Yes"+"\nName: "+edtxt20xx.getText().toString()+"\nMobile: "+edtxt21xx.getText().toString()+"\nMail ID: "+edtxt22xx.getText().toString());


            }
        });

        edtxt20xxx.addTextChangedListener(new TextWatcher() {

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void afterTextChanged(Editable s) {

                editText3Invs.setText("Stage/Sound/Light: Yes"+"\nName: "+edtxt20xxx.getText().toString()+"\nMobile: "+edtxt21xxx.getText().toString()+"\nMail ID: "+edtxt22xxx.getText().toString());


            }
        });

        edtxt21xxx.addTextChangedListener(new TextWatcher() {

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void afterTextChanged(Editable s) {

                editText3Invs.setText("Stage/Sound/Light: Yes"+"\nName: "+edtxt20xxx.getText().toString()+"\nMobile: "+edtxt21xxx.getText().toString()+"\nMail ID: "+edtxt22xxx.getText().toString());


            }
        });

        edtxt22xxx.addTextChangedListener(new TextWatcher() {

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void afterTextChanged(Editable s) {

                editText3Invs.setText("Stage/Sound/Light: Yes"+"\nName: "+edtxt20xxx.getText().toString()+"\nMobile: "+edtxt21xxx.getText().toString()+"\nMail ID: "+edtxt22xxx.getText().toString());


            }
        });


        return myFragmentView;
    }

    public void onRadioButtonClicked5(View view){

        boolean checked = ((RadioButton) view).isChecked();

        if (view == radioButton7) {

            radioButton8.setChecked(false);
            edtxt20x.setEnabled(true);
            edtxt20x.setFocusableInTouchMode(true);
            edtxt20x.setClickable(true);
            edtxt21x.setEnabled(true);
            editText1Invs.setText("Photographer : Yes"+"\nName: "+edtxt20x.getText().toString()+"\nMobile: "+edtxt21x.getText().toString()+"\nMail ID: "+edtxt22x.getText().toString());
            edtxt21x.setFocusableInTouchMode(true);
            edtxt21x.setClickable(true);
            edtxt22x.setEnabled(true);
            edtxt22x.setFocusableInTouchMode(true);
            edtxt22x.setClickable(true);
            edtxt20x.setBackgroundResource(R.drawable.rounded_border_edittext);
            edtxt21x.setBackgroundResource(R.drawable.rounded_border_edittext);
            edtxt22x.setBackgroundResource(R.drawable.rounded_border_edittext);

//            "Yes,
//            Name :Dinesh,
//            mobile : 9003146457,
//            Email : raj2red@gmail"




        } else if (view == radioButton8) {

            radioButton7.setChecked(false);
            edtxt20x.setEnabled(false);
            edtxt20x.setFocusableInTouchMode(false);
            edtxt20x.setClickable(false);
            editText1Invs.setText("Not Required");
            edtxt21x.setEnabled(false);
            edtxt21x.setFocusableInTouchMode(false);
            edtxt21x.setClickable(false);
            edtxt22x.setEnabled(false);
            edtxt22x.setFocusableInTouchMode(false);
            edtxt22x.setClickable(false);
            edtxt20x.setBackgroundResource(R.drawable.disabled_edittext_round);
            edtxt21x.setBackgroundResource(R.drawable.disabled_edittext_round);
            edtxt22x.setBackgroundResource(R.drawable.disabled_edittext_round);

        }else if (view == radioButton9) {

            radioButton10.setChecked(false);
            edtxt20xx.setEnabled(true);
            edtxt20xx.setFocusableInTouchMode(true);
            edtxt20xx.setClickable(true);
            editText2Invs.setText("Video: Yes"+"\nName: "+edtxt20xx.getText().toString()+"\nMobile: "+edtxt21xx.getText().toString()+"\nMail ID: "+edtxt22xx.getText().toString());
            edtxt21xx.setEnabled(true);
            edtxt21xx.setFocusableInTouchMode(true);
            edtxt21xx.setClickable(true);
            edtxt22xx.setEnabled(true);
            edtxt22xx.setFocusableInTouchMode(true);
            edtxt22xx.setClickable(true);
            edtxt20xx.setBackgroundResource(R.drawable.rounded_border_edittext);
            edtxt21xx.setBackgroundResource(R.drawable.rounded_border_edittext);
            edtxt22xx.setBackgroundResource(R.drawable.rounded_border_edittext);

        }else if (view == radioButton10) {

            radioButton9.setChecked(false);
            edtxt20xx.setEnabled(false);
            edtxt20xx.setFocusableInTouchMode(false);
            edtxt20xx.setClickable(false);
            editText2Invs.setText("Not Required");
            edtxt21xx.setEnabled(false);
            edtxt21xx.setFocusableInTouchMode(false);
            edtxt21xx.setClickable(false);
            edtxt22xx.setEnabled(false);
            edtxt22xx.setFocusableInTouchMode(false);
            edtxt22xx.setClickable(false);
            edtxt20xx.setBackgroundResource(R.drawable.disabled_edittext_round);
            edtxt21xx.setBackgroundResource(R.drawable.disabled_edittext_round);
            edtxt22xx.setBackgroundResource(R.drawable.disabled_edittext_round);

        }else if (view == radioButton11) {

            radioButton12.setChecked(false);
            edtxt20xxx.setEnabled(true);
            edtxt20xxx.setFocusableInTouchMode(true);
            edtxt20xxx.setClickable(true);
            editText3Invs.setText("Stage/Sound/Light: Yes"+"\nName: "+edtxt20xxx.getText().toString()+"\nMobile: "+edtxt21xxx.getText().toString()+"\nMail ID: "+edtxt22xxx.getText().toString());
            edtxt21xxx.setEnabled(true);
            edtxt21xxx.setFocusableInTouchMode(true);
            edtxt21xxx.setClickable(true);
            edtxt22xxx.setEnabled(true);
            edtxt22xxx.setFocusableInTouchMode(true);
            edtxt22xxx.setClickable(true);
            edtxt20xxx.setBackgroundResource(R.drawable.rounded_border_edittext);
            edtxt21xxx.setBackgroundResource(R.drawable.rounded_border_edittext);
            edtxt22xxx.setBackgroundResource(R.drawable.rounded_border_edittext);

        }else if (view == radioButton12) {

            radioButton11.setChecked(false);
            edtxt20xxx.setEnabled(false);
            edtxt20xxx.setFocusableInTouchMode(false);
            edtxt20xxx.setClickable(false);
            editText3Invs.setText("Not Required");
            edtxt21xxx.setEnabled(false);
            edtxt21xxx.setFocusableInTouchMode(false);
            edtxt21xxx.setClickable(false);
            edtxt22xxx.setEnabled(false);
            edtxt22xxx.setFocusableInTouchMode(false);
            edtxt22xxx.setClickable(false);
            edtxt20xxx.setBackgroundResource(R.drawable.disabled_edittext_round);
            edtxt21xxx.setBackgroundResource(R.drawable.disabled_edittext_round);
            edtxt22xxx.setBackgroundResource(R.drawable.disabled_edittext_round);

        }

    }
}