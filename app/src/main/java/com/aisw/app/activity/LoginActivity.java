package com.aisw.app.activity;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.provider.Settings;
import android.support.v7.app.AlertDialog;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import com.aisw.app.R;
import com.aisw.app.navigation.MainActivity2;


public class LoginActivity extends Activity {

        private EditText userEditText;
        private EditText passEditText;
        private Button submit;
        private CheckBox saveLoginCheckBox;
        private SharedPreferences loginPreferences;
        private SharedPreferences.Editor loginPrefsEditor;
        private Boolean saveLogin;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.login_activity);

            userEditText = (EditText) findViewById(R.id.username);
            passEditText = (EditText) findViewById(R.id.password);
            submit = (Button)findViewById(R.id.button);
            saveLoginCheckBox = (CheckBox)findViewById(R.id.saveLoginCheckBox);
            loginPreferences = getSharedPreferences("loginPrefs", MODE_PRIVATE);
            loginPrefsEditor = loginPreferences.edit();

            saveLogin = loginPreferences.getBoolean("saveLogin", false);
            if (saveLogin == true) {
                userEditText.setText(loginPreferences.getString("username", ""));
//                passEditText.setText(loginPreferences.getString("password", ""));
                saveLoginCheckBox.setChecked(true);
            }

            submit.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    final String email = userEditText.getText().toString();
                    final String pass = passEditText.getText().toString();


                    if(email.length()==0)
                    {
                        new AlertDialog.Builder(LoginActivity.this)
                                .setTitle("AishwaryaLED")
                                .setMessage("Username Cannot be empty")
                                .setNegativeButton(" ", null)
                                .setPositiveButton("OK", new DialogInterface.OnClickListener() {

                                    public void onClick(DialogInterface arg0, int arg1) {
                                    }
                                }).create().show();

                        passEditText.getText().clear();

                    }else if(pass.length()==0)
                    {
                        new AlertDialog.Builder(LoginActivity.this)
                                .setTitle("AishwaryaLED")
                                .setMessage("Password Cannot be empty")
                                .setNegativeButton(" ", null)
                                .setPositiveButton("OK", new DialogInterface.OnClickListener() {

                                    public void onClick(DialogInterface arg0, int arg1) {
                                    }
                                }).create().show();
                    }else if(!email.equalsIgnoreCase("admin")){

                        new AlertDialog.Builder(LoginActivity.this)
                                .setTitle("AishwaryaLED")
                                .setMessage("Please Enter Correct Username")
                                .setNegativeButton(" ", null)
                                .setPositiveButton("OK", new DialogInterface.OnClickListener() {

                                    public void onClick(DialogInterface arg0, int arg1) {
                                    }
                                }).create().show();

                        passEditText.getText().clear();


                    }else if(!pass.equalsIgnoreCase("aishwarya")){

                        new AlertDialog.Builder(LoginActivity.this)
                                .setTitle("AishwaryaLED")
                                .setMessage("Please Enter Correct Password")
                                .setNegativeButton(" ", null)
                                .setPositiveButton("OK", new DialogInterface.OnClickListener() {

                                    public void onClick(DialogInterface arg0, int arg1) {
                                    }
                                }).create().show();

                        passEditText.getText().clear();

                    }else{

                        if (saveLoginCheckBox.isChecked()) {
                            loginPrefsEditor.putBoolean("saveLogin", true);
                            loginPrefsEditor.putString("username", email);
//                            loginPrefsEditor.putString("password", pass);
                            loginPrefsEditor.commit();
                        } else {
                            loginPrefsEditor.clear();
                            loginPrefsEditor.commit();
                        }

                        Intent i = new Intent(LoginActivity.this,MainActivity2.class);
                        startActivity(i);
                        finish();

                        Toast.makeText(getApplicationContext(),"Login Successfull",Toast.LENGTH_LONG).show();

                    }
                }
            });

        }

    }
