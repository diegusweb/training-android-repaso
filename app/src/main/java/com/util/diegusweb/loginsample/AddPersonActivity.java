package com.util.diegusweb.loginsample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AddPersonActivity extends AppCompatActivity {

    public static final String PARAM_TITLE="titleApp";
    public static final String PARAM_AGE="age";
    EditText  txtName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_person);



        final Button button = findViewById(R.id.btnAddPerson);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtName = findViewById(R.id.txtName);

                Intent intent = new Intent();
                intent.putExtra("MESSAGE", txtName.getText().toString());
                setResult(1, intent);
                finish();
            }
        });
    }
}
