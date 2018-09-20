package com.util.diegusweb.loginsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    EditText mUserView, mPasswordView;
    private boolean pulsado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Log.d("eventTest", "onCreate");

        mUserView = findViewById(R.id.txtUsername);
        mPasswordView = findViewById(R.id.txtPassword);

        final Button button = findViewById(R.id.btnLogin);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Login", mUserView.getText().toString());
            }
        });
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putString("userName", mUserView.getText().toString());
        outState.putString("password", mPasswordView.getText().toString());
        Log.d("Restore", "outState");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        mUserView.setText(savedInstanceState.getString("userName"));
        mPasswordView.setText(savedInstanceState.getString("password"));

        Log.d("Restore", savedInstanceState.getString("userName"));
    }

}
