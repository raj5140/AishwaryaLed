package com.aisw.app.fragment;

import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.preference.EditTextPreference;
import android.provider.ContactsContract;
import android.support.v4.app.Fragment;
import android.text.InputType;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;

import com.aisw.app.R;

import java.text.BreakIterator;


public class Welcome_Slide1 extends Fragment {

    private static final int RESULT_PICK_CONTACT = 85;
    private static final int RESULT_PICK_CONTACT2 = 86;

    private static final int RESULT_OK = -1;
    private static final int RESULT_OK2 = -2;


    EditText edtxt1,edtxt2,edtxt7,edtxt5,edtxt6;

    ImageButton imgbt1,imgbt2;


    @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View myFragmentView = inflater.inflate(R.layout.welcome_slide1, container, false);

            edtxt1 = (EditText)myFragmentView.findViewById( R.id.edtxt1 );
            edtxt2 = (EditText)myFragmentView.findViewById( R.id.edtxt2 );
            edtxt7 = (EditText)myFragmentView.findViewById( R.id.edtxt7 );
            edtxt5= (EditText)myFragmentView.findViewById( R.id.edtxt5 );
            edtxt6= (EditText)myFragmentView.findViewById( R.id.edtxt6 );
            imgbt1= (ImageButton) myFragmentView.findViewById( R.id.imgContBut1 );
            imgbt2= (ImageButton) myFragmentView.findViewById( R.id.imgContBut2 );
        imgbt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pickContact1();
            }
        });

        imgbt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pickContact2();
            }
        });



        edtxt1.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_FLAG_CAP_SENTENCES | InputType.TYPE_TEXT_FLAG_NO_SUGGESTIONS);
            edtxt2.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_FLAG_CAP_SENTENCES);
            edtxt7.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_FLAG_CAP_SENTENCES);

            return myFragmentView;
        }


    public void pickContact1() {
        Intent contactPickerIntent = new Intent(Intent.ACTION_PICK,
                ContactsContract.CommonDataKinds.Phone.CONTENT_URI);
        startActivityForResult(contactPickerIntent, RESULT_PICK_CONTACT);
    }

    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (resultCode == RESULT_OK) {

            switch (requestCode) {
                case RESULT_PICK_CONTACT:
                    contactPicked(data);
                    break;

                case RESULT_PICK_CONTACT2:
                    contactPicked2(data);
                    break;
            }


        } else {
            Log.e("Welcome_Slide1", "Failed to pick contact");
        }
    }

    private void contactPicked(Intent data) {
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

            edtxt5.setText(phoneNo);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }





    public void pickContact2() {
        Intent contactPickerIntent = new Intent(Intent.ACTION_PICK,
                ContactsContract.CommonDataKinds.Phone.CONTENT_URI);
        startActivityForResult(contactPickerIntent, RESULT_PICK_CONTACT2);
    }


    private void contactPicked2(Intent data) {
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

            edtxt6.setText(phoneNo);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
