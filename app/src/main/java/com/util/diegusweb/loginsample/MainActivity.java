package com.util.diegusweb.loginsample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private static final int CODIGO_ACTIVIDAD = 1;
    TextView txtUResultName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtUResultName = findViewById(R.id.txtUResultName);

        final Button button = findViewById(R.id.btnCalll);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, AddPersonActivity.class);
                startActivityForResult(intent, CODIGO_ACTIVIDAD);
            }
        });

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("eventTest", "onPause");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("eventTest", "onDestroy");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("eventTest", "onResume");
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data)
    {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == 1)
        {
            String message=data.getStringExtra("MESSAGE");
            txtUResultName.setText(message);
        }
    }

}
