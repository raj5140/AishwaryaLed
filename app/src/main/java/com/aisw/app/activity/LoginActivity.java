package com.aisw.app.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.aisw.app.R;

/**
 * Created by varun on 2/28/2017.
 */
public class LoginActivity extends Activity {

    private EditText userEditText;
    private EditText passEditText;
    private Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);

        userEditText = (EditText) findViewById(R.id.username);
        passEditText = (EditText) findViewById(R.id.password);
        submit = (Button)findViewById(R.id.button);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String email = userEditText.getText().toString();
                final String pass = passEditText.getText().toString();
                if(email.equalsIgnoreCase("Aishwarya")&&pass.equalsIgnoreCase("aaa"))
                {
                    Intent i = new Intent(LoginActivity.this,NavActivity.class);
                    startActivity(i);
                }
            }
        });

    }

}
