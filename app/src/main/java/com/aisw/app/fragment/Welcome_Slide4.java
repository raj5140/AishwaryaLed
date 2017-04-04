package com.aisw.app.fragment;


import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract;
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
import android.widget.ImageButton;
import android.widget.RadioButton;

import com.aisw.app.R;

public class Welcome_Slide4 extends Fragment {


    private static final int RESULT_PICK_CONTACT3 = 85;
    private static final int RESULT_PICK_CONTACT4 = 86;
    private static final int RESULT_PICK_CONTACT5 = 87;
    private static final int RESULT_PICK_CONTACT6 = 88;
    private static final int RESULT_PICK_CONTACT7 = 89;


    private static final int RESULT_OK3 = -1;
    private static final int RESULT_OK4 = -2;

    private static final int RESULT_OK5 = -3;
    private static final int RESULT_OK6 = -4;
    private static final int RESULT_OK7 = -5;



    EditText edtxt23,edtxt20x,edtxt21x,edtxt22x,edtxt20xx,edtxt21xx,edtxt22xx,edtxt20xxx,edtxt21xxx,edtxt22xxx;

    EditText editText1Invs,editText2Invs,editText3Invs,editText4Invs,editText5Invs;

    EditText edtxt20xxxSound,edtxt21xxxSound,edtxt22xxxSound,edtxt20xxxLight,edtxt21xxxLight,edtxt22xxxLight;

    RadioButton radioButton7,radioButton8,radioButton9,radioButton10,radioButton11,radioButton12,radioButton11Sound,radioButton12Sound,radioButton11Light,radioButton12Light;

    ImageButton imgbt3,imgbt4,imgbt5,imgbt6,imgbt7;

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
        edtxt20xxxSound= (EditText) myFragmentView.findViewById(R.id.edtxt20xxxSound);
        edtxt21xxxSound= (EditText) myFragmentView.findViewById(R.id.edtxt21xxxSound);
        edtxt22xxxSound= (EditText) myFragmentView.findViewById(R.id.edtxt22xxxSound);

        edtxt20xxxLight= (EditText) myFragmentView.findViewById(R.id.edtxt20xxxLight);
        edtxt21xxxLight= (EditText) myFragmentView.findViewById(R.id.edtxt21xxxLight);
        edtxt22xxxLight= (EditText) myFragmentView.findViewById(R.id.edtxt22xxxLight);

        imgbt3= (ImageButton) myFragmentView.findViewById( R.id.imgContBut3 );
        imgbt4= (ImageButton) myFragmentView.findViewById( R.id.imgContBut4);
        imgbt5= (ImageButton) myFragmentView.findViewById( R.id.imgContBut5 );
        imgbt6= (ImageButton) myFragmentView.findViewById( R.id.imgContBut6 );
        imgbt7= (ImageButton) myFragmentView.findViewById( R.id.imgContBut7 );



        edtxt23 = (EditText) myFragmentView.findViewById(R.id.edtxt23);
        edtxt23.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_FLAG_CAP_SENTENCES);

        radioButton7=(RadioButton)myFragmentView.findViewById(R.id.radioButton7);
        radioButton8=(RadioButton)myFragmentView.findViewById(R.id.radioButton8);
        radioButton9=(RadioButton)myFragmentView.findViewById(R.id.radioButton9);
        radioButton10=(RadioButton)myFragmentView.findViewById(R.id.radioButton10);
        radioButton11=(RadioButton)myFragmentView.findViewById(R.id.radioButton11);
        radioButton12=(RadioButton)myFragmentView.findViewById(R.id.radioButton12);
        radioButton11Sound=(RadioButton)myFragmentView.findViewById(R.id.radioButton11Sound);
        radioButton12Sound=(RadioButton)myFragmentView.findViewById(R.id.radioButton12Sound);
        radioButton11Light=(RadioButton)myFragmentView.findViewById(R.id.radioButton11Light);
        radioButton12Light=(RadioButton)myFragmentView.findViewById(R.id.radioButton12Light);

        editText1Invs= (EditText) myFragmentView.findViewById(R.id.editText1Invs);
        editText2Invs= (EditText) myFragmentView.findViewById(R.id.editText2Invs);
        editText3Invs= (EditText) myFragmentView.findViewById(R.id.editText3Invs);
        editText4Invs= (EditText) myFragmentView.findViewById(R.id.editText4Invs);
        editText5Invs= (EditText) myFragmentView.findViewById(R.id.editText5Invs);
        editText1Invs.setSingleLine(false);
        editText2Invs.setSingleLine(false);
        editText3Invs.setSingleLine(false);
        editText4Invs.setSingleLine(false);
        editText5Invs.setSingleLine(false);


        imgbt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pickContact3();
            }
        });

        imgbt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pickContact4();
            }
        });

        imgbt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pickContact5();
            }
        });

        imgbt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pickContact6();
            }
        });


        imgbt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pickContact7();
            }
        });


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

        radioButton11Sound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onRadioButtonClicked5(radioButton11Sound);
            }
        });

        radioButton12Sound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onRadioButtonClicked5(radioButton12Sound);
            }
        });

        radioButton11Light.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onRadioButtonClicked5(radioButton11Light);
            }
        });

        radioButton12Light.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onRadioButtonClicked5(radioButton12Light);
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

                editText3Invs.setText("Stage: Yes"+"\nName: "+edtxt20xxx.getText().toString()+"\nMobile: "+edtxt21xxx.getText().toString()+"\nMail ID: "+edtxt22xxx.getText().toString());

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

                editText3Invs.setText("Stage: Yes"+"\nName: "+edtxt20xxx.getText().toString()+"\nMobile: "+edtxt21xxx.getText().toString()+"\nMail ID: "+edtxt22xxx.getText().toString());


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

                editText3Invs.setText("Stage: Yes"+"\nName: "+edtxt20xxx.getText().toString()+"\nMobile: "+edtxt21xxx.getText().toString()+"\nMail ID: "+edtxt22xxx.getText().toString());


            }
        });



        edtxt20xxxSound.addTextChangedListener(new TextWatcher() {

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void afterTextChanged(Editable s) {

                editText4Invs.setText("Sound: Yes"+"\nName: "+edtxt20xxxSound.getText().toString()+"\nMobile: "+edtxt21xxxSound.getText().toString()+"\nMail ID: "+edtxt22xxxSound.getText().toString());


            }
        });

        edtxt20xxxLight.addTextChangedListener(new TextWatcher() {

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void afterTextChanged(Editable s) {

                editText5Invs.setText("Light: Yes"+"\nName: "+edtxt20xxxLight.getText().toString()+"\nMobile: "+edtxt21xxxLight.getText().toString()+"\nMail ID: "+edtxt22xxxLight.getText().toString());


            }
        });

        edtxt21xxxSound.addTextChangedListener(new TextWatcher() {

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void afterTextChanged(Editable s) {

                editText4Invs.setText("Sound: Yes"+"\nName: "+edtxt20xxxSound.getText().toString()+"\nMobile: "+edtxt21xxxSound.getText().toString()+"\nMail ID: "+edtxt22xxxSound.getText().toString());


            }
        });

        edtxt21xxxLight.addTextChangedListener(new TextWatcher() {

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void afterTextChanged(Editable s) {

                editText5Invs.setText("Light: Yes"+"\nName: "+edtxt20xxxLight.getText().toString()+"\nMobile: "+edtxt21xxxLight.getText().toString()+"\nMail ID: "+edtxt22xxxLight.getText().toString());


            }
        });

        edtxt22xxxSound.addTextChangedListener(new TextWatcher() {

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void afterTextChanged(Editable s) {

                editText4Invs.setText("Sound: Yes"+"\nName: "+edtxt20xxxSound.getText().toString()+"\nMobile: "+edtxt21xxxSound.getText().toString()+"\nMail ID: "+edtxt22xxxSound.getText().toString());


            }
        });

        edtxt22xxxLight.addTextChangedListener(new TextWatcher() {

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void afterTextChanged(Editable s) {

                editText5Invs.setText("Light: Yes"+"\nName: "+edtxt20xxxLight.getText().toString()+"\nMobile: "+edtxt21xxxLight.getText().toString()+"\nMail ID: "+edtxt22xxxLight.getText().toString());


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
            editText3Invs.setText("Stage: Yes"+"\nName: "+edtxt20xxx.getText().toString()+"\nMobile: "+edtxt21xxx.getText().toString()+"\nMail ID: "+edtxt22xxx.getText().toString());
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

        }else if (view == radioButton11Sound) {

            radioButton12Sound.setChecked(false);
            edtxt20xxxSound.setEnabled(true);
            edtxt20xxxSound.setFocusableInTouchMode(true);
            edtxt20xxxSound.setClickable(true);
            editText4Invs.setText("Sound: Yes"+"\nName: "+edtxt20xxxSound.getText().toString()+"\nMobile: "+edtxt21xxxSound.getText().toString()+"\nMail ID: "+edtxt22xxxSound.getText().toString());
            edtxt21xxxSound.setEnabled(true);
            edtxt21xxxSound.setFocusableInTouchMode(true);
            edtxt21xxxSound.setClickable(true);
            edtxt22xxxSound.setEnabled(true);
            edtxt22xxxSound.setFocusableInTouchMode(true);
            edtxt22xxxSound.setClickable(true);
            edtxt20xxxSound.setBackgroundResource(R.drawable.rounded_border_edittext);
            edtxt21xxxSound.setBackgroundResource(R.drawable.rounded_border_edittext);
            edtxt22xxxSound.setBackgroundResource(R.drawable.rounded_border_edittext);

        }else if (view == radioButton12Sound) {

            radioButton11Sound.setChecked(false);
            edtxt20xxxSound.setEnabled(false);
            edtxt20xxxSound.setFocusableInTouchMode(false);
            edtxt20xxxSound.setClickable(false);
            editText4Invs.setText("Not Required");
            edtxt21xxxSound.setEnabled(false);
            edtxt21xxxSound.setFocusableInTouchMode(false);
            edtxt21xxxSound.setClickable(false);
            edtxt22xxxSound.setEnabled(false);
            edtxt22xxxSound.setFocusableInTouchMode(false);
            edtxt22xxxSound.setClickable(false);
            edtxt20xxxSound.setBackgroundResource(R.drawable.disabled_edittext_round);
            edtxt21xxxSound.setBackgroundResource(R.drawable.disabled_edittext_round);
            edtxt22xxxSound.setBackgroundResource(R.drawable.disabled_edittext_round);

        }else if (view == radioButton11Light) {

            radioButton12Light.setChecked(false);
            edtxt20xxxLight.setEnabled(true);
            edtxt20xxxLight.setFocusableInTouchMode(true);
            edtxt20xxxLight.setClickable(true);
            editText4Invs.setText("Light: Yes"+"\nName: "+edtxt20xxxLight.getText().toString()+"\nMobile: "+edtxt21xxxLight.getText().toString()+"\nMail ID: "+edtxt22xxxLight.getText().toString());
            edtxt21xxxLight.setEnabled(true);
            edtxt21xxxLight.setFocusableInTouchMode(true);
            edtxt21xxxLight.setClickable(true);
            edtxt22xxxLight.setEnabled(true);
            edtxt22xxxLight.setFocusableInTouchMode(true);
            edtxt22xxxLight.setClickable(true);
            edtxt20xxxLight.setBackgroundResource(R.drawable.rounded_border_edittext);
            edtxt21xxxLight.setBackgroundResource(R.drawable.rounded_border_edittext);
            edtxt22xxxLight.setBackgroundResource(R.drawable.rounded_border_edittext);

        }else if (view == radioButton12Light) {

            radioButton11Light.setChecked(false);
            edtxt20xxxLight.setEnabled(false);
            edtxt20xxxLight.setFocusableInTouchMode(false);
            edtxt20xxxLight.setClickable(false);
            editText4Invs.setText("Not Required");
            edtxt21xxxLight.setEnabled(false);
            edtxt21xxxLight.setFocusableInTouchMode(false);
            edtxt21xxxLight.setClickable(false);
            edtxt22xxxLight.setEnabled(false);
            edtxt22xxxLight.setFocusableInTouchMode(false);
            edtxt22xxxLight.setClickable(false);
            edtxt20xxxLight.setBackgroundResource(R.drawable.disabled_edittext_round);
            edtxt21xxxLight.setBackgroundResource(R.drawable.disabled_edittext_round);
            edtxt22xxxLight.setBackgroundResource(R.drawable.disabled_edittext_round);

        }

    }

    public void pickContact3() {
        Intent contactPickerIntent = new Intent(Intent.ACTION_PICK,
                ContactsContract.CommonDataKinds.Phone.CONTENT_URI);
        startActivityForResult(contactPickerIntent, RESULT_PICK_CONTACT3);
    }

    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (resultCode == RESULT_OK3) {

            switch (requestCode) {
                case RESULT_PICK_CONTACT3:
                    contactPicked3(data);
                    break;

                case RESULT_PICK_CONTACT4:
                    contactPicked4(data);
                    break;

                case RESULT_PICK_CONTACT5:
                    contactPicked5(data);
                    break;

                case RESULT_PICK_CONTACT6:
                    contactPicked6(data);
                    break;

                case RESULT_PICK_CONTACT7:
                    contactPicked7(data);
                    break;
            }


        } else {
            Log.e("Welcome_Slide1", "Failed to pick contact");
        }
    }


    private void contactPicked3(Intent data) {
        Cursor cursor = null;
        try {
            String phoneNo = null ;
            String name = null;
            Uri uri = data.getData();
            cursor = getActivity().getContentResolver().query(uri, null, null, null, null);
            cursor.moveToFirst();

            int  phoneIndex =cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER);
            int  nameIndex =cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME);

            phoneNo = cursor.getString(phoneIndex);
            name = cursor.getString(nameIndex);

            edtxt21x.setText(phoneNo);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }





    public void pickContact4() {
        Intent contactPickerIntent = new Intent(Intent.ACTION_PICK,
                ContactsContract.CommonDataKinds.Phone.CONTENT_URI);
        startActivityForResult(contactPickerIntent, RESULT_PICK_CONTACT4);
    }




    private void contactPicked4(Intent data) {
        Cursor cursor = null;
        try {
            String phoneNo = null ;
            String name = null;
            Uri uri = data.getData();
            cursor = getActivity().getContentResolver().query(uri, null, null, null, null);
            cursor.moveToFirst();

            int  phoneIndex =cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER);
            int  nameIndex =cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME);

            phoneNo = cursor.getString(phoneIndex);
            name = cursor.getString(nameIndex);

            edtxt21xx.setText(phoneNo);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    public void pickContact5() {
        Intent contactPickerIntent = new Intent(Intent.ACTION_PICK,
                ContactsContract.CommonDataKinds.Phone.CONTENT_URI);
        startActivityForResult(contactPickerIntent, RESULT_PICK_CONTACT5);
    }




    private void contactPicked5(Intent data) {
        Cursor cursor = null;
        try {
            String phoneNo = null ;
            String name = null;
            Uri uri = data.getData();
            cursor = getActivity().getContentResolver().query(uri, null, null, null, null);
            cursor.moveToFirst();

            int  phoneIndex =cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER);
            int  nameIndex =cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME);

            phoneNo = cursor.getString(phoneIndex);
            name = cursor.getString(nameIndex);

            edtxt21xxx.setText(phoneNo);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    public void pickContact6() {
        Intent contactPickerIntent = new Intent(Intent.ACTION_PICK,
                ContactsContract.CommonDataKinds.Phone.CONTENT_URI);
        startActivityForResult(contactPickerIntent, RESULT_PICK_CONTACT6);
    }




    private void contactPicked6(Intent data) {
        Cursor cursor = null;
        try {
            String phoneNo = null;
            String name = null;
            Uri uri = data.getData();
            cursor = getActivity().getContentResolver().query(uri, null, null, null, null);
            cursor.moveToFirst();

            int phoneIndex = cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER);
            int nameIndex = cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME);

            phoneNo = cursor.getString(phoneIndex);
            name = cursor.getString(nameIndex);

            edtxt21xxxSound.setText(phoneNo);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


        public void pickContact7() {
            Intent contactPickerIntent = new Intent(Intent.ACTION_PICK,
                    ContactsContract.CommonDataKinds.Phone.CONTENT_URI);
            startActivityForResult(contactPickerIntent, RESULT_PICK_CONTACT7);
        }




        private void contactPicked7(Intent data) {
            Cursor cursor = null;
            try {
                String phoneNo = null ;
                String name = null;
                Uri uri = data.getData();
                cursor = getActivity().getContentResolver().query(uri, null, null, null, null);
                cursor.moveToFirst();

                int  phoneIndex =cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER);
                int  nameIndex =cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME);

                phoneNo = cursor.getString(phoneIndex);
                name = cursor.getString(nameIndex);

                edtxt21xxxLight.setText(phoneNo);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }


}